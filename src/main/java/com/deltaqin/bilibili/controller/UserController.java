package com.deltaqin.bilibili.controller;

import com.deltaqin.bilibili.common.entities.ResultType;
import com.deltaqin.bilibili.common.exception.CommonExceptionImpl;
import com.deltaqin.bilibili.common.exception.ExceptionTypeEnum;
import com.deltaqin.bilibili.common.utils.CodeUtil;
import com.deltaqin.bilibili.common.utils.Encode;
import com.deltaqin.bilibili.model.UserModel;
import com.deltaqin.bilibili.service.UserService;
import com.deltaqin.bilibili.vo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

//import static com.deltaqin.bilibili.common.constant.GlobalConstant.CONTENT_TYPE_FORMED;

/**
 * @author deltaqin
 * @date 2021/6/13 上午11:17
 */
@RestController("/user")
//解决跨域
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*")
@Api(tags = "用户接口")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private HttpServletRequest httpServletRequest;

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 登录之后返回 token
     * @param password
     * @return
     * @throws CommonExceptionImpl
     */
    @ApiOperation(value = "用户登录测试接口", notes = "登录接口,将返回的token设置为全局参数")
    //@RequestMapping(value = "/login", method = RequestMethod.POST,consumes={CONTENT_TYPE_FORMED})
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultType login(@RequestParam(name = "name") String name,
                            @RequestParam(name = "password") String password
                            //@RequestParam(name = "code")String code
    ) throws CommonExceptionImpl, UnsupportedEncodingException, NoSuchAlgorithmException {

        if (StringUtils.isEmpty(name) || StringUtils.isEmpty(password)) {
            throw new CommonExceptionImpl(ExceptionTypeEnum.USER_LOGIN_FAIL);
        }

        //String codeInSession = (String)httpServletRequest.getSession().getAttribute(name);
        //String codeInRedis = (String)redisTemplate.opsForValue().get(name);
        //code = code.toUpperCase();
        //if (!StringUtils.equals(codeInRedis, code)) {
        //    throw new CommonExceptionImpl(ExceptionTypeEnum.PARAMETER_VALIDATION_ERROR, "验证码错误");
        //}

        UserModel userModel = userService.login(name, Encode.encodeByMd5(password));

        // 能走到这里说明通过校验，开始session或者token


        //将登陆凭证加入到用户登陆成功的session内（v1.0）
        //httpServletRequest.getSession().setAttribute("IS_LOGIN", true);
        //httpServletRequest.getSession().setAttribute("LOGIN_USER", userModel);

        // 使用token+redis实现(v2.0)
        String token = UUID.randomUUID().toString();
        token = token.replace("-", "");
        redisTemplate.opsForValue().set(token, userModel);
        redisTemplate.expire(token, 1, TimeUnit.HOURS);

        log.info("用户登录: {}" , userModel);

        return ResultType.create(token);
    }

    @ApiOperation(value = "用户注册测试接口", notes = "注册接口")
    @RequestMapping(path = "/register",method = RequestMethod.POST)
    //@RequestMapping(path = "/register",method = RequestMethod.POST, consumes = CONTENT_TYPE_FORMED)
    public ResultType register(@RequestParam(name = "name") String name,
                               @RequestParam(name = "password") String password
    ) throws CommonExceptionImpl, UnsupportedEncodingException, NoSuchAlgorithmException {

        UserModel userModel = UserModel.builder().name(name).password(Encode.encodeByMd5(password)).registerTime(DateTime.now()).build();
        userService.register(userModel);

        log.info("用户注册: {}" , userModel);
        return ResultType.create(null);
    }

    @ApiOperation(value = "登录之前先获取验证码(5min过期）", notes = "使用返回的验证码登录。图片显示在用户登录页面")
    // produces = "image/jpeg" 不设置就是乱码
    //@RequestMapping(value = "/getotp",method = {RequestMethod.GET},consumes={CONTENT_TYPE_FORMED}, produces = "image/jpeg")
    @RequestMapping(value = "/getotp",method = {RequestMethod.GET}, produces = "image/jpeg")
    public void getOtpCode(@RequestParam(name = "name") String name, HttpServletResponse httpServletResponse) throws CommonExceptionImpl {

        // 返回验证码的图片
        Map<String,Object> map = CodeUtil.generateCodeAndPic();

        log.info("telphone:" + name + ", otpCode:" + map.get("code"));
        //
        redisTemplate.opsForValue().set(name, map.get("code"));
        redisTemplate.expire(name, 5, TimeUnit.MINUTES);

        try {
            // 不设置这knife4j就是下载文件
            httpServletResponse.setContentType("image/jpeg");
            ImageIO.write((RenderedImage) map.get("pic"), "jpeg", httpServletResponse.getOutputStream());
        } catch (IOException ioException) {
            throw new CommonExceptionImpl(ExceptionTypeEnum.PARAMETER_VALIDATION_ERROR, "验证码图片生成错误");
        }
    }

    @ApiOperation(value = "使用ID获取用户", notes = "获取用户")
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ResultType getUserById(@RequestParam(name = "id") Integer id) throws CommonExceptionImpl {
        if (id == null)
            throw new CommonExceptionImpl(ExceptionTypeEnum.PARAMETER_VALIDATION_ERROR, "需要用户id");

        UserModel userModel = userService.getUserById(id);

        if (userModel == null) {
            throw new CommonExceptionImpl(ExceptionTypeEnum.USER_NOT_EXIST);
        }

        UserVo userVo = convertFromModel(userModel);

        return ResultType.create(userVo);

    }

    @ApiOperation(value = "使用用户名获取用户", notes = "获取用户")
    @RequestMapping(value = "/getbyname", method = RequestMethod.GET)
    public ResultType getUserByPhone(@RequestParam(name = "name") String name) throws CommonExceptionImpl {
        if (name == null)
            throw new CommonExceptionImpl(ExceptionTypeEnum.PARAMETER_VALIDATION_ERROR, "需要用户名");

        UserModel userModel = userService.getUserByName(name);

        if (userModel == null) {
            throw new CommonExceptionImpl(ExceptionTypeEnum.USER_NOT_EXIST);
        }

        UserVo userVo = convertFromModel(userModel);

        return ResultType.create(userVo);

    }

    private UserVo convertFromModel(UserModel userModel) {
        UserVo userVo = new UserVo();
        BeanUtils.copyProperties(userModel, userVo);
        userVo.setRegisterTime(userModel.getRegisterTime().toString(DateTimeFormat
                .forPattern("yyyy-MM-dd HH:mm:ss")));
        return userVo;
    }
}

