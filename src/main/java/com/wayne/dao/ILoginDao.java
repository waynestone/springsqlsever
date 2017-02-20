package com.wayne.dao;

import com.wayne.entity.Login;

public interface ILoginDao {
    /**
     * 登录
     * @param username
     * @param pwd
     * @return
     */
    Login login(String username,String pwd);
}