package com.wayne.dao;
import com.wayne.entity.Login;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by YiTao on 2017/2/21.
 */
@Repository
public class LoginDao extends DaoBase implements ILoginDao {
    @Override
    public Login login(String username, String pwd) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("username", username);
        params.put("password", pwd);
        return getReadOnlySqlSessionUtil().selectOne(
                "ILoginDao.login", params);
    }
}
