package com.deltaqin.bilibili.service;

import com.deltaqin.bilibili.common.exception.CommonExceptionImpl;
import com.deltaqin.bilibili.model.UserModel;

/**
 * @author deltaqin
 * @date 2021/6/13 上午11:17
 */
public interface UserService {

    // 校验用户的信息
    UserModel login(String telPhone, String passwaord) throws CommonExceptionImpl;


    void register(UserModel userModel) throws CommonExceptionImpl;

    UserModel getUserById(Integer id) throws CommonExceptionImpl;

    UserModel getUserByName(String name) throws CommonExceptionImpl;
}
