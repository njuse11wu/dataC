package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_PERSON_HONOUR_HIS", schema = "MEMBER", catalog = "")
public class TPersonHonourHis {
    private long id;
    private String ryid;
    private String zyrylb;
    private String jie;
    private Time hqsj;
    private String ryzsbh;
    private String bfdw;
    private String hdyy;
    private String remark;
    private String ryjb;
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
    @Column(name = "ZYRYLB")
    public String getZyrylb() {
        return zyrylb;
    }

    public void setZyrylb(String zyrylb) {
        this.zyrylb = zyrylb;
    }

    @Basic
    @Column(name = "JIE")
    public String getJie() {
        return jie;
    }

    public void setJie(String jie) {
        this.jie = jie;
    }

    @Basic
    @Column(name = "HQSJ")
    public Time getHqsj() {
        return hqsj;
    }

    public void setHqsj(Time hqsj) {
        this.hqsj = hqsj;
    }

    @Basic
    @Column(name = "RYZSBH")
    public String getRyzsbh() {
        return ryzsbh;
    }

    public void setRyzsbh(String ryzsbh) {
        this.ryzsbh = ryzsbh;
    }

    @Basic
    @Column(name = "BFDW")
    public String getBfdw() {
        return bfdw;
    }

    public void setBfdw(String bfdw) {
        this.bfdw = bfdw;
    }

    @Basic
    @Column(name = "HDYY")
    public String getHdyy() {
        return hdyy;
    }

    public void setHdyy(String hdyy) {
        this.hdyy = hdyy;
    }

    @Basic
    @Column(name = "REMARK")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "RYJB")
    public String getRyjb() {
        return ryjb;
    }

    public void setRyjb(String ryjb) {
        this.ryjb = ryjb;
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
        TPersonHonourHis that = (TPersonHonourHis) o;
        return id == that.id &&
                Objects.equals(ryid, that.ryid) &&
                Objects.equals(zyrylb, that.zyrylb) &&
                Objects.equals(jie, that.jie) &&
                Objects.equals(hqsj, that.hqsj) &&
                Objects.equals(ryzsbh, that.ryzsbh) &&
                Objects.equals(bfdw, that.bfdw) &&
                Objects.equals(hdyy, that.hdyy) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(ryjb, that.ryjb) &&
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

        return Objects.hash(id, ryid, zyrylb, jie, hqsj, ryzsbh, bfdw, hdyy, remark, ryjb, cjsj, cjry, cjryxm, cjbmmc, gxsj, gxry, gxryxm, gxbm, gxbmmc, cjbm);
    }
}
