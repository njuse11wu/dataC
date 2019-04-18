package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_COMPANY_JOIN_INSUR", schema = "MEMBER", catalog = "")
public class TCompanyJoinInsur {
    private long id;
    private String qyid;
    private Long nf;
    private String shbxcjlx;
    private Long shbxcjrs;
    private Long shbxcbl;
    private Long shbxyje;
    private Long shbxsje;
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
    @Column(name = "QYID")
    public String getQyid() {
        return qyid;
    }

    public void setQyid(String qyid) {
        this.qyid = qyid;
    }

    @Basic
    @Column(name = "NF")
    public Long getNf() {
        return nf;
    }

    public void setNf(Long nf) {
        this.nf = nf;
    }

    @Basic
    @Column(name = "SHBXCJLX")
    public String getShbxcjlx() {
        return shbxcjlx;
    }

    public void setShbxcjlx(String shbxcjlx) {
        this.shbxcjlx = shbxcjlx;
    }

    @Basic
    @Column(name = "SHBXCJRS")
    public Long getShbxcjrs() {
        return shbxcjrs;
    }

    public void setShbxcjrs(Long shbxcjrs) {
        this.shbxcjrs = shbxcjrs;
    }

    @Basic
    @Column(name = "SHBXCBL")
    public Long getShbxcbl() {
        return shbxcbl;
    }

    public void setShbxcbl(Long shbxcbl) {
        this.shbxcbl = shbxcbl;
    }

    @Basic
    @Column(name = "SHBXYJE")
    public Long getShbxyje() {
        return shbxyje;
    }

    public void setShbxyje(Long shbxyje) {
        this.shbxyje = shbxyje;
    }

    @Basic
    @Column(name = "SHBXSJE")
    public Long getShbxsje() {
        return shbxsje;
    }

    public void setShbxsje(Long shbxsje) {
        this.shbxsje = shbxsje;
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
        TCompanyJoinInsur that = (TCompanyJoinInsur) o;
        return id == that.id &&
                Objects.equals(qyid, that.qyid) &&
                Objects.equals(nf, that.nf) &&
                Objects.equals(shbxcjlx, that.shbxcjlx) &&
                Objects.equals(shbxcjrs, that.shbxcjrs) &&
                Objects.equals(shbxcbl, that.shbxcbl) &&
                Objects.equals(shbxyje, that.shbxyje) &&
                Objects.equals(shbxsje, that.shbxsje) &&
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

        return Objects.hash(id, qyid, nf, shbxcjlx, shbxcjrs, shbxcbl, shbxyje, shbxsje, cjsj, cjry, cjryxm, cjbmmc, gxsj, gxry, gxryxm, gxbm, gxbmmc, cjbm);
    }
}
