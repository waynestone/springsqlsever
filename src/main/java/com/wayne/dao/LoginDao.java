package com.wayne.dao;
import com.wayne.entity.Login;
import com.wayne.entity.person;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
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

    public person getall(){
        Map<String, Object> params = new HashMap<String, Object>();
        List<person> ret= getmysqlMasterSqlSessionUtil().selectList("ILoginDao.person",params);
        return null;
    }
}
