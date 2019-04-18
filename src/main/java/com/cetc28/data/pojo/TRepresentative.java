package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_REPRESENTATIVE", schema = "MEMBER", catalog = "")
public class TRepresentative {
    private long id;
    private String ryid;
    private String zzid;
    private String zzmc;
    private String tjdw;
    private String fl;
    private String jb;
    private String dbrsdxqk;
    private String sszt;
    private String qyid;
    private Time cjsj;
    private String cjry;
    private String cjryxm;
    private String cjbm;
    private String cjbmmc;
    private String dbrsfl;
    private String zc;
    private String xw;
    private String gasf;
    private String gsltjdwyj;
    private String zhpjyj;
    private String tzbtjdwyj;
    private String isrealdata;
    private String dbfl;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "RYID")
    public String getRyid() {
        return ryid;
    }

    public void setRyid(String ryid) {
        this.ryid = ryid;
    }

    @Basic
    @Column(name = "ZZID")
    public String getZzid() {
        return zzid;
    }

    public void setZzid(String zzid) {
        this.zzid = zzid;
    }

    @Basic
    @Column(name = "ZZMC")
    public String getZzmc() {
        return zzmc;
    }

    public void setZzmc(String zzmc) {
        this.zzmc = zzmc;
    }

    @Basic
    @Column(name = "TJDW")
    public String getTjdw() {
        return tjdw;
    }

    public void setTjdw(String tjdw) {
        this.tjdw = tjdw;
    }

    @Basic
    @Column(name = "FL")
    public String getFl() {
        return fl;
    }

    public void setFl(String fl) {
        this.fl = fl;
    }

    @Basic
    @Column(name = "JB")
    public String getJb() {
        return jb;
    }

    public void setJb(String jb) {
        this.jb = jb;
    }

    @Basic
    @Column(name = "DBRSDXQK")
    public String getDbrsdxqk() {
        return dbrsdxqk;
    }

    public void setDbrsdxqk(String dbrsdxqk) {
        this.dbrsdxqk = dbrsdxqk;
    }

    @Basic
    @Column(name = "SSZT")
    public String getSszt() {
        return sszt;
    }

    public void setSszt(String sszt) {
        this.sszt = sszt;
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

    @Basic
    @Column(name = "DBRSFL")
    public String getDbrsfl() {
        return dbrsfl;
    }

    public void setDbrsfl(String dbrsfl) {
        this.dbrsfl = dbrsfl;
    }

    @Basic
    @Column(name = "ZC")
    public String getZc() {
        return zc;
    }

    public void setZc(String zc) {
        this.zc = zc;
    }

    @Basic
    @Column(name = "XW")
    public String getXw() {
        return xw;
    }

    public void setXw(String xw) {
        this.xw = xw;
    }

    @Basic
    @Column(name = "GASF")
    public String getGasf() {
        return gasf;
    }

    public void setGasf(String gasf) {
        this.gasf = gasf;
    }

    @Basic
    @Column(name = "GSLTJDWYJ")
    public String getGsltjdwyj() {
        return gsltjdwyj;
    }

    public void setGsltjdwyj(String gsltjdwyj) {
        this.gsltjdwyj = gsltjdwyj;
    }

    @Basic
    @Column(name = "ZHPJYJ")
    public String getZhpjyj() {
        return zhpjyj;
    }

    public void setZhpjyj(String zhpjyj) {
        this.zhpjyj = zhpjyj;
    }

    @Basic
    @Column(name = "TZBTJDWYJ")
    public String getTzbtjdwyj() {
        return tzbtjdwyj;
    }

    public void setTzbtjdwyj(String tzbtjdwyj) {
        this.tzbtjdwyj = tzbtjdwyj;
    }

    @Basic
    @Column(name = "ISREALDATA")
    public String getIsrealdata() {
        return isrealdata;
    }

    public void setIsrealdata(String isrealdata) {
        this.isrealdata = isrealdata;
    }

    @Basic
    @Column(name = "DBFL")
    public String getDbfl() {
        return dbfl;
    }

    public void setDbfl(String dbfl) {
        this.dbfl = dbfl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TRepresentative that = (TRepresentative) o;
        return id == that.id &&
                Objects.equals(ryid, that.ryid) &&
                Objects.equals(zzid, that.zzid) &&
                Objects.equals(zzmc, that.zzmc) &&
                Objects.equals(tjdw, that.tjdw) &&
                Objects.equals(fl, that.fl) &&
                Objects.equals(jb, that.jb) &&
                Objects.equals(dbrsdxqk, that.dbrsdxqk) &&
                Objects.equals(sszt, that.sszt) &&
                Objects.equals(qyid, that.qyid) &&
                Objects.equals(cjsj, that.cjsj) &&
                Objects.equals(cjry, that.cjry) &&
                Objects.equals(cjryxm, that.cjryxm) &&
                Objects.equals(cjbm, that.cjbm) &&
                Objects.equals(cjbmmc, that.cjbmmc) &&
                Objects.equals(dbrsfl, that.dbrsfl) &&
                Objects.equals(zc, that.zc) &&
                Objects.equals(xw, that.xw) &&
                Objects.equals(gasf, that.gasf) &&
                Objects.equals(gsltjdwyj, that.gsltjdwyj) &&
                Objects.equals(zhpjyj, that.zhpjyj) &&
                Objects.equals(tzbtjdwyj, that.tzbtjdwyj) &&
                Objects.equals(isrealdata, that.isrealdata) &&
                Objects.equals(dbfl, that.dbfl);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, ryid, zzid, zzmc, tjdw, fl, jb, dbrsdxqk, sszt, qyid, cjsj, cjry, cjryxm, cjbm, cjbmmc, dbrsfl, zc, xw, gasf, gsltjdwyj, zhpjyj, tzbtjdwyj, isrealdata, dbfl);
    }
}
