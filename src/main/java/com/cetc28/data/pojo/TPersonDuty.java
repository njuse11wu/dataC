package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_PERSON_DUTY", schema = "MEMBER", catalog = "")
public class TPersonDuty {
    private long id;
    private String ryid;
    private String sszwlb;
    private String xzqhmc;
    private String xzqhbm;
    private String zzjgmc;
    private String zzjgbm;
    private Long jb;
    private String zwbm;
    private String zwmc;
    private String sfzz;
    private String zwszsf;
    private String zwszcs;
    private String zwszqx;
    private String bm;
    private Time cjsj;
    private String cjry;
    private String cjryxm;
    private String cjbmmc;
    private Time gxsj;
    private String gxry;
    private String gxryxm;
    private String gxbm;
    private String gxbmmc;
    private String cjbm;

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
    @Column(name = "SSZWLB")
    public String getSszwlb() {
        return sszwlb;
    }

    public void setSszwlb(String sszwlb) {
        this.sszwlb = sszwlb;
    }

    @Basic
    @Column(name = "XZQHMC")
    public String getXzqhmc() {
        return xzqhmc;
    }

    public void setXzqhmc(String xzqhmc) {
        this.xzqhmc = xzqhmc;
    }

    @Basic
    @Column(name = "XZQHBM")
    public String getXzqhbm() {
        return xzqhbm;
    }

    public void setXzqhbm(String xzqhbm) {
        this.xzqhbm = xzqhbm;
    }

    @Basic
    @Column(name = "ZZJGMC")
    public String getZzjgmc() {
        return zzjgmc;
    }

    public void setZzjgmc(String zzjgmc) {
        this.zzjgmc = zzjgmc;
    }

    @Basic
    @Column(name = "ZZJGBM")
    public String getZzjgbm() {
        return zzjgbm;
    }

    public void setZzjgbm(String zzjgbm) {
        this.zzjgbm = zzjgbm;
    }

    @Basic
    @Column(name = "JB")
    public Long getJb() {
        return jb;
    }

    public void setJb(Long jb) {
        this.jb = jb;
    }

    @Basic
    @Column(name = "ZWBM")
    public String getZwbm() {
        return zwbm;
    }

    public void setZwbm(String zwbm) {
        this.zwbm = zwbm;
    }

    @Basic
    @Column(name = "ZWMC")
    public String getZwmc() {
        return zwmc;
    }

    public void setZwmc(String zwmc) {
        this.zwmc = zwmc;
    }

    @Basic
    @Column(name = "SFZZ")
    public String getSfzz() {
        return sfzz;
    }

    public void setSfzz(String sfzz) {
        this.sfzz = sfzz;
    }

    @Basic
    @Column(name = "ZWSZSF")
    public String getZwszsf() {
        return zwszsf;
    }

    public void setZwszsf(String zwszsf) {
        this.zwszsf = zwszsf;
    }

    @Basic
    @Column(name = "ZWSZCS")
    public String getZwszcs() {
        return zwszcs;
    }

    public void setZwszcs(String zwszcs) {
        this.zwszcs = zwszcs;
    }

    @Basic
    @Column(name = "ZWSZQX")
    public String getZwszqx() {
        return zwszqx;
    }

    public void setZwszqx(String zwszqx) {
        this.zwszqx = zwszqx;
    }

    @Basic
    @Column(name = "BM")
    public String getBm() {
        return bm;
    }

    public void setBm(String bm) {
        this.bm = bm;
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
    @Column(name = "CJBMMC")
    public String getCjbmmc() {
        return cjbmmc;
    }

    public void setCjbmmc(String cjbmmc) {
        this.cjbmmc = cjbmmc;
    }

    @Basic
    @Column(name = "GXSJ")
    public Time getGxsj() {
        return gxsj;
    }

    public void setGxsj(Time gxsj) {
        this.gxsj = gxsj;
    }

    @Basic
    @Column(name = "GXRY")
    public String getGxry() {
        return gxry;
    }

    public void setGxry(String gxry) {
        this.gxry = gxry;
    }

    @Basic
    @Column(name = "GXRYXM")
    public String getGxryxm() {
        return gxryxm;
    }

    public void setGxryxm(String gxryxm) {
        this.gxryxm = gxryxm;
    }

    @Basic
    @Column(name = "GXBM")
    public String getGxbm() {
        return gxbm;
    }

    public void setGxbm(String gxbm) {
        this.gxbm = gxbm;
    }

    @Basic
    @Column(name = "GXBMMC")
    public String getGxbmmc() {
        return gxbmmc;
    }

    public void setGxbmmc(String gxbmmc) {
        this.gxbmmc = gxbmmc;
    }

    @Basic
    @Column(name = "CJBM")
    public String getCjbm() {
        return cjbm;
    }

    public void setCjbm(String cjbm) {
        this.cjbm = cjbm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TPersonDuty that = (TPersonDuty) o;
        return id == that.id &&
                Objects.equals(ryid, that.ryid) &&
                Objects.equals(sszwlb, that.sszwlb) &&
                Objects.equals(xzqhmc, that.xzqhmc) &&
                Objects.equals(xzqhbm, that.xzqhbm) &&
                Objects.equals(zzjgmc, that.zzjgmc) &&
                Objects.equals(zzjgbm, that.zzjgbm) &&
                Objects.equals(jb, that.jb) &&
                Objects.equals(zwbm, that.zwbm) &&
                Objects.equals(zwmc, that.zwmc) &&
                Objects.equals(sfzz, that.sfzz) &&
                Objects.equals(zwszsf, that.zwszsf) &&
                Objects.equals(zwszcs, that.zwszcs) &&
                Objects.equals(zwszqx, that.zwszqx) &&
                Objects.equals(bm, that.bm) &&
                Objects.equals(cjsj, that.cjsj) &&
                Objects.equals(cjry, that.cjry) &&
                Objects.equals(cjryxm, that.cjryxm) &&
                Objects.equals(cjbmmc, that.cjbmmc) &&
                Objects.equals(gxsj, that.gxsj) &&
                Objects.equals(gxry, that.gxry) &&
                Objects.equals(gxryxm, that.gxryxm) &&
                Objects.equals(gxbm, that.gxbm) &&
                Objects.equals(gxbmmc, that.gxbmmc) &&
                Objects.equals(cjbm, that.cjbm);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, ryid, sszwlb, xzqhmc, xzqhbm, zzjgmc, zzjgbm, jb, zwbm, zwmc, sfzz, zwszsf, zwszcs, zwszqx, bm, cjsj, cjry, cjryxm, cjbmmc, gxsj, gxry, gxryxm, gxbm, gxbmmc, cjbm);
    }
}
