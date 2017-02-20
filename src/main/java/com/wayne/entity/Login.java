package com.wayne.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Login {
    private Integer loginID;

    private Integer token;

    private String username;

    private String password;

    private Date lastLogin;

    private String lastLoginIP;

    private Integer levelID;

    private Boolean isEnabled;

    private BigDecimal imprest;

    private BigDecimal overdraft;

    private Integer paymentCycle;

    private Integer shenzhenaccountid;

    public Integer getLoginID() {
        return loginID;
    }

    public void setLoginID(Integer loginID) {
        this.loginID = loginID;
    }

    public Integer getToken() {
        return token;
    }

    public void setToken(Integer token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getLastLoginIP() {
        return lastLoginIP;
    }

    public void setLastLoginIP(String lastLoginIP) {
        this.lastLoginIP = lastLoginIP == null ? null : lastLoginIP.trim();
    }

    public Integer getLevelID() {
        return levelID;
    }

    public void setLevelID(Integer levelID) {
        this.levelID = levelID;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public BigDecimal getImprest() {
        return imprest;
    }

    public void setImprest(BigDecimal imprest) {
        this.imprest = imprest;
    }

    public BigDecimal getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(BigDecimal overdraft) {
        this.overdraft = overdraft;
    }

    public Integer getPaymentCycle() {
        return paymentCycle;
    }

    public void setPaymentCycle(Integer paymentCycle) {
        this.paymentCycle = paymentCycle;
    }

    public Integer getShenzhenaccountid() {
        return shenzhenaccountid;
    }

    public void setShenzhenaccountid(Integer shenzhenaccountid) {
        this.shenzhenaccountid = shenzhenaccountid;
    }
}