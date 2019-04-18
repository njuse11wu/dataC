package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_TT_SH_MAP", schema = "MEMBER", catalog = "")
public class TTtShMap {
    private long id;
    private String ttid;
    private String ssshmc;
    private Time jrsj;
    private Time cjsj;
    private String cjry;
    private String cjryxm;
    private String cjbm;
    private String cjbmmc;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TTID")
    public String getTtid() {
        return ttid;
    }

    public void setTtid(String ttid) {
        this.ttid = ttid;
    }

    @Basic
    @Column(name = "SSSHMC")
    public String getSsshmc() {
        return ssshmc;
    }

    public void setSsshmc(String ssshmc) {
        this.ssshmc = ssshmc;
    }

    @Basic
    @Column(name = "JRSJ")
    public Time getJrsj() {
        return jrsj;
    }

    public void setJrsj(Time jrsj) {
        this.jrsj = jrsj;
    }

    @Basic
    @Column(name = "CJSJ")
    public Time getCjsj() {
        return cjsj;
    }

    public void setCjsj(Time cjsj) {
        this.cjsj = cjsj;
    }

    @Basic
    @Column(name = "CJRY")
    public String getCjry() {
        return cjry;
    }

    public void setCjry(String cjry) {
        this.cjry = cjry;
    }

    @Basic
    @Column(name = "CJRYXM")
    public String getCjryxm() {
        return cjryxm;
    }

    public void setCjryxm(String cjryxm) {
        this.cjryxm = cjryxm;
    }

    @Basic
    @Column(name = "CJBM")
    public String getCjbm() {
        return cjbm;
    }

    public void setCjbm(String cjbm) {
        this.cjbm = cjbm;
    }

    @Basic
    @Column(name = "CJBMMC")
    public String getCjbmmc() {
        return cjbmmc;
    }

    public void setCjbmmc(String cjbmmc) {
        this.cjbmmc = cjbmmc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TTtShMap tTtShMap = (TTtShMap) o;
        return id == tTtShMap.id &&
                Objects.equals(ttid, tTtShMap.ttid) &&
                Objects.equals(ssshmc, tTtShMap.ssshmc) &&
                Objects.equals(jrsj, tTtShMap.jrsj) &&
                Objects.equals(cjsj, tTtShMap.cjsj) &&
                Objects.equals(cjry, tTtShMap.cjry) &&
                Objects.equals(cjryxm, tTtShMap.cjryxm) &&
                Objects.equals(cjbm, tTtShMap.cjbm) &&
                Objects.equals(cjbmmc, tTtShMap.cjbmmc);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, ttid, ssshmc, jrsj, cjsj, cjry, cjryxm, cjbm, cjbmmc);
    }
}
