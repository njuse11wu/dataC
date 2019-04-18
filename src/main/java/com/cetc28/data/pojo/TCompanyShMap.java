package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_COMPANY_SH_MAP", schema = "MEMBER", catalog = "")
public class TCompanyShMap {
    private long id;
    private String qyid;
    private String ssshbm;
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
    @Column(name = "QYID")
    public String getQyid() {
        return qyid;
    }

    public void setQyid(String qyid) {
        this.qyid = qyid;
    }

    @Basic
    @Column(name = "SSSHBM")
    public String getSsshbm() {
        return ssshbm;
    }

    public void setSsshbm(String ssshbm) {
        this.ssshbm = ssshbm;
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
        TCompanyShMap that = (TCompanyShMap) o;
        return id == that.id &&
                Objects.equals(qyid, that.qyid) &&
                Objects.equals(ssshbm, that.ssshbm) &&
                Objects.equals(ssshmc, that.ssshmc) &&
                Objects.equals(jrsj, that.jrsj) &&
                Objects.equals(cjsj, that.cjsj) &&
                Objects.equals(cjry, that.cjry) &&
                Objects.equals(cjryxm, that.cjryxm) &&
                Objects.equals(cjbm, that.cjbm) &&
                Objects.equals(cjbmmc, that.cjbmmc);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, qyid, ssshbm, ssshmc, jrsj, cjsj, cjry, cjryxm, cjbm, cjbmmc);
    }
}
