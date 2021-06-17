package com.deltaqin.bilibili.service.impl;

import com.deltaqin.bilibili.common.exception.CommonExceptionImpl;
import com.deltaqin.bilibili.common.exception.ExceptionTypeEnum;
import com.deltaqin.bilibili.common.validator.ValidationResult;
import com.deltaqin.bilibili.common.validator.ValidatorUtil;
import com.deltaqin.bilibili.dao.UserInfoMapper;
import com.deltaqin.bilibili.dataobject.UserInfo;
import com.deltaqin.bilibili.model.UserModel;
import com.deltaqin.bilibili.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


//
//<update id="updateByPrimaryKeySelective" parameterType="com.deltaqin.bilibili.dataobject.UserInfo">
//        update user_info
//<set>
//<if test="name != null">
//        name = #{name,jdbcType=VARCHAR},
//</if>
//<if test="password != null">
//        password = #{password,jdbcType=VARCHAR},
//</if>
//<if test="registerTime != null">
//        register_time = #{registerTime,jdbcType=TIMESTAMP},
//</if>
//</set>
//        where id = #{id,jdbcType=INTEGER}
//</update>
//<update id="updateByPrimaryKey" parameterType="com.deltaqin.bilibili.dataobject.UserInfo">
//        update user_info
//        set name = #{name,jdbcType=VARCHAR},
//        password = #{password,jdbcType=VARCHAR},
//        register_time = #{registerTime,jdbcType=TIMESTAMP}
//        where id = #{id,jdbcType=INTEGER}
//</update>
/**
 * @author deltaqin
 * @date 2021/6/13 上午11:17
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private ValidatorUtil validatorUtil;

    /**
     * 校验用户的信息
     * @param passwaord
     * @return
     * @throws CommonExceptionImpl
     */
    @Override
    public UserModel login(String name, String passwaord) throws CommonExceptionImpl {
        // 获取用户的DO
        UserInfo userInfo = userInfoMapper.selectByName(name);
        if (userInfo == null) {
            throw new CommonExceptionImpl(ExceptionTypeEnum.USER_LOGIN_FAIL);
        }

        // 验证密码是否准确
        if (!StringUtils.equals(userInfo.getPassword(), passwaord)) {
            throw new CommonExceptionImpl(ExceptionTypeEnum.USER_LOGIN_FAIL);
        }

        // 两个DO转换为Model领域模型
        UserModel userModel = converFromDataObject(userInfo);
        return userModel;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
    public void register(UserModel userModel) throws CommonExceptionImpl {
        if (userModel == null){
            throw new CommonExceptionImpl(ExceptionTypeEnum.PARAMETER_VALIDATION_ERROR);
        }

        ValidationResult validate = validatorUtil.validate(userModel);

        if (validate.isHasError()) {
            throw new CommonExceptionImpl(ExceptionTypeEnum.PARAMETER_VALIDATION_ERROR, validate.getErrMsgString());
        }
        UserInfo userInfo = convertUserFromModel(userModel);

        try {
            int insert = userInfoMapper.insert(userInfo);
            // 重复用户直接返回异常
            if (insert < 1) {
                throw new CommonExceptionImpl(ExceptionTypeEnum.USER_HAS_REGISTER);
            }
        } catch (DuplicateKeyException exception) {
            throw new CommonExceptionImpl(ExceptionTypeEnum.PARAMETER_VALIDATION_ERROR, "手机号已经注册");
        }
    }

    @Override
    public UserModel getUserById(Integer id) throws CommonExceptionImpl {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(id);
        if (userInfo == null) {
            throw new CommonExceptionImpl(ExceptionTypeEnum.USER_NOT_EXIST);
        }
        UserModel userModel = convertModelFromDo(userInfo);
        return userModel;
    }

    @Override
    public UserModel getUserByName(String name) throws CommonExceptionImpl {
        //userInfoMapper.selectByPrimaryKey(new UserInfoKey());
        UserInfo userInfo = userInfoMapper.selectByName(name);
        if (userInfo == null) {
            throw new CommonExceptionImpl(ExceptionTypeEnum.USER_NOT_EXIST);
        }

        UserModel userModel = convertModelFromDo(userInfo);
        return userModel;
    }

    private UserModel convertModelFromDo(UserInfo userInfo) {
        if (userInfo == null) return null;

        UserModel userModel = UserModel.builder().build();
        BeanUtils.copyProperties(userInfo, userModel);
        userModel.setRegisterTime(new DateTime(userInfo.getRegisterTime()));
        return userModel;
    }

    /**
     * @param userInfo
     * @return
     */
    private UserModel converFromDataObject(UserInfo userInfo ) {
        if (userInfo == null) return null;

        UserModel userModel = UserModel.builder().build();
        BeanUtils.copyProperties(userInfo, userModel);
        userModel.setRegisterTime(new DateTime(userInfo.getRegisterTime()));
        return userModel;
    }

    private UserInfo convertUserFromModel(UserModel userModel) {
        if (userModel == null) {
            return  null;
        }
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(userModel, userInfo);
        userInfo.setRegisterTime(userModel.getRegisterTime().toDate());
        return userInfo;
    }


}
