package com.wayne.service;
import com.wayne.dao.ILoginDao;
import com.wayne.entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wayne.core.MD5Util;
/**
 * Created by YiTao on 2017/2/21.
 */
@Service
public class LoginService implements ILoginService {
    @Autowired
    private ILoginDao logindao;
    @Override
    public Login login(String username, String password) {
        password = MD5Util.MD5(password).toUpperCase();//转大写
        logindao.getall();
        return logindao.login(username, password);

    }
}
