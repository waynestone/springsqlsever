package com.wayne.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.wayne.core.SqlSessionUtil;


@Repository
public class DaoBase {
    @Autowired
    private SqlSessionFactory superManReadOnlySqlServerSessionFactory;

    @Autowired
    private SqlSessionFactory superManSqlServerSessionFactory;

    public SqlSessionUtil getReadOnlySqlSessionUtil() {
        return SqlSessionUtil.wapperSession(superManReadOnlySqlServerSessionFactory);
    }
    public SqlSessionUtil getMasterSqlSessionUtil() {
        return SqlSessionUtil.wapperSession(superManSqlServerSessionFactory);
    }


    @Autowired
    private SqlSessionFactory superManMysqlSessionFactory;
    public SqlSessionUtil getmysqlMasterSqlSessionUtil() {
        return SqlSessionUtil.wapperSession(superManMysqlSessionFactory);
    }
}
