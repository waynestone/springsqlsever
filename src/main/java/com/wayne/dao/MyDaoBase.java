package com.wayne.dao;

import com.wayne.core.SqlSessionUtil;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by YiTao on 2017/3/17.
 */
@Repository
public class MyDaoBase {
    @Autowired
    private SqlSessionFactory superManMysqlSessionFactory;
    public SqlSessionUtil getMasterSqlSessionUtil() {
        return SqlSessionUtil.wapperSession(superManMysqlSessionFactory);
    }
}
