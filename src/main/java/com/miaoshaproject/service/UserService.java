package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

public interface UserService {
    //通过用户ID获取用户对象
    UserModel getUserById(Integer id);

    void register(UserModel userModel) throws BusinessException;

    //通过缓存获取用户对象
    UserModel getUserByIdInCache(Integer id);

    /**
     *
     * @param telphone 用户注册手机
     * @param encrptPassword 用户加密后的密码
     * @throws BusinessException
     * @return
     */
    UserModel validateLogin(String telphone, String encrptPassword) throws BusinessException;
}
