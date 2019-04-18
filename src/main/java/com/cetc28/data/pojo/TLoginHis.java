package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_LOGIN_HIS", schema = "MEMBER", catalog = "")
public class TLoginHis {
    private String userId;
    private Time loginTime;
    private String loginIp;
    private long id;

    @Basic
    @Column(name = "USER_ID")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "LOGIN_TIME")
    public Time getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Time loginTime) {
        this.loginTime = loginTime;
    }

    @Basic
    @Column(name = "LOGIN_IP")
    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TLoginHis tLoginHis = (TLoginHis) o;
        return id == tLoginHis.id &&
                Objects.equals(userId, tLoginHis.userId) &&
                Objects.equals(loginTime, tLoginHis.loginTime) &&
                Objects.equals(loginIp, tLoginHis.loginIp);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userId, loginTime, loginIp, id);
    }
}
