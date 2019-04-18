package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_COMMITTEE_MEM", schema = "MEMBER", catalog = "")
public class TCommitteeMem {
    private long id;
    private String ryid;
    private String zzid;
    private String zzmc;
    private String zcwdxqk;
    private String sflb;
    private long jb;
    private String qyid;
    private Time cjsj;
    private String cjry;
    private String cjryxm;
    private String cjbm;
    private String cjbmmc;
    private String xw;
    private String zc;
    private String gasf;
    private String gsltjdwyj;
    private String zhpjyj;
    private String tzbtjdwyj;
    private Boolean sfzb;
    private Boolean sfcx;
    private Boolean sftb;
    private String zcwsx;
    private String tjdw;
    private String czwfl;
    private String zcwfl;
    private Long xh;

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
    @Column(name = "ZCWDXQK")
    public String getZcwdxqk() {
        return zcwdxqk;
    }

    public void setZcwdxqk(String zcwdxqk) {
        this.zcwdxqk = zcwdxqk;
    }

    @Basic
    @Column(name = "SFLB")
    public String getSflb() {
        return sflb;
    }

    public void setSflb(String sflb) {
        this.sflb = sflb;
    }

    @Basic
    @Column(name = "JB")
    public long getJb() {
        return jb;
    }

    public void setJb(long jb) {
        this.jb = jb;
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
    @Column(name = "XW")
    public String getXw() {
        return xw;
    }

    public void setXw(String xw) {
        this.xw = xw;
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
    @Column(name = "SFZB")
    public Boolean getSfzb() {
        return sfzb;
    }

    public void setSfzb(Boolean sfzb) {
        this.sfzb = sfzb;
    }

    @Basic
    @Column(name = "SFCX")
    public Boolean getSfcx() {
        return sfcx;
    }

    public void setSfcx(Boolean sfcx) {
        this.sfcx = sfcx;
    }

    @Basic
    @Column(name = "SFTB")
    public Boolean getSftb() {
        return sftb;
    }

    public void setSftb(Boolean sftb) {
        this.sftb = sftb;
    }

    @Basic
    @Column(name = "ZCWSX")
    public String getZcwsx() {
        return zcwsx;
    }

    public void setZcwsx(String zcwsx) {
        this.zcwsx = zcwsx;
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
    @Column(name = "CZWFL")
    public String getCzwfl() {
        return czwfl;
    }

    public void setCzwfl(String czwfl) {
        this.czwfl = czwfl;
    }

    @Basic
    @Column(name = "ZCWFL")
    public String getZcwfl() {
        return zcwfl;
    }

    public void setZcwfl(String zcwfl) {
        this.zcwfl = zcwfl;
    }

    @Basic
    @Column(name = "XH")
    public Long getXh() {
        return xh;
    }

    public void setXh(Long xh) {
        this.xh = xh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TCommitteeMem that = (TCommitteeMem) o;
        return id == that.id &&
                jb == that.jb &&
                Objects.equals(ryid, that.ryid) &&
                Objects.equals(zzid, that.zzid) &&
                Objects.equals(zzmc, that.zzmc) &&
                Objects.equals(zcwdxqk, that.zcwdxqk) &&
                Objects.equals(sflb, that.sflb) &&
                Objects.equals(qyid, that.qyid) &&
                Objects.equals(cjsj, that.cjsj) &&
                Objects.equals(cjry, that.cjry) &&
                Objects.equals(cjryxm, that.cjryxm) &&
                Objects.equals(cjbm, that.cjbm) &&
                Objects.equals(cjbmmc, that.cjbmmc) &&
                Objects.equals(xw, that.xw) &&
                Objects.equals(zc, that.zc) &&
                Objects.equals(gasf, that.gasf) &&
                Objects.equals(gsltjdwyj, that.gsltjdwyj) &&
                Objects.equals(zhpjyj, that.zhpjyj) &&
                Objects.equals(tzbtjdwyj, that.tzbtjdwyj) &&
                Objects.equals(sfzb, that.sfzb) &&
                Objects.equals(sfcx, that.sfcx) &&
                Objects.equals(sftb, that.sftb) &&
                Objects.equals(zcwsx, that.zcwsx) &&
                Objects.equals(tjdw, that.tjdw) &&
                Objects.equals(czwfl, that.czwfl) &&
                Objects.equals(zcwfl, that.zcwfl) &&
                Objects.equals(xh, that.xh);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, ryid, zzid, zzmc, zcwdxqk, sflb, jb, qyid, cjsj, cjry, cjryxm, cjbm, cjbmmc, xw, zc, gasf, gsltjdwyj, zhpjyj, tzbtjdwyj, sfzb, sfcx, sftb, zcwsx, tjdw, czwfl, zcwfl, xh);
    }
}
