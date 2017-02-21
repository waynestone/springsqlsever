package com.wayne.service;
import com.wayne.entity.Login;
/**
 * Created by YiTao on 2017/2/21.
 */
public interface ILoginService {
    /**
     * 登录查询接
     * @param username
     * @param password
     * @return
     */
    Login login(String username,String password);
}
