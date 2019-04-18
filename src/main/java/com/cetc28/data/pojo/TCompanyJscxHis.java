package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_COMPANY_JSCX_HIS", schema = "MEMBER", catalog = "")
public class TCompanyJscxHis {
    private String qyid;
    private Long yfslgjj;
    private Long yfslsj;
    private Long yfslsxj;
    private Long kjjbjgjj;
    private Long kjjbjsj;
    private Long kjjbjsxj;
    private Long fmzlsl;
    private Long yffyzxssrbl;
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
    @Column(name = "QYID")
    public String getQyid() {
        return qyid;
    }

    public void setQyid(String qyid) {
        this.qyid = qyid;
    }

    @Basic
    @Column(name = "YFSLGJJ")
    public Long getYfslgjj() {
        return yfslgjj;
    }

    public void setYfslgjj(Long yfslgjj) {
        this.yfslgjj = yfslgjj;
    }

    @Basic
    @Column(name = "YFSLSJ")
    public Long getYfslsj() {
        return yfslsj;
    }

    public void setYfslsj(Long yfslsj) {
        this.yfslsj = yfslsj;
    }

    @Basic
    @Column(name = "YFSLSXJ")
    public Long getYfslsxj() {
        return yfslsxj;
    }

    public void setYfslsxj(Long yfslsxj) {
        this.yfslsxj = yfslsxj;
    }

    @Basic
    @Column(name = "KJJBJGJJ")
    public Long getKjjbjgjj() {
        return kjjbjgjj;
    }

    public void setKjjbjgjj(Long kjjbjgjj) {
        this.kjjbjgjj = kjjbjgjj;
    }

    @Basic
    @Column(name = "KJJBJSJ")
    public Long getKjjbjsj() {
        return kjjbjsj;
    }

    public void setKjjbjsj(Long kjjbjsj) {
        this.kjjbjsj = kjjbjsj;
    }

    @Basic
    @Column(name = "KJJBJSXJ")
    public Long getKjjbjsxj() {
        return kjjbjsxj;
    }

    public void setKjjbjsxj(Long kjjbjsxj) {
        this.kjjbjsxj = kjjbjsxj;
    }

    @Basic
    @Column(name = "FMZLSL")
    public Long getFmzlsl() {
        return fmzlsl;
    }

    public void setFmzlsl(Long fmzlsl) {
        this.fmzlsl = fmzlsl;
    }

    @Basic
    @Column(name = "YFFYZXSSRBL")
    public Long getYffyzxssrbl() {
        return yffyzxssrbl;
    }

    public void setYffyzxssrbl(Long yffyzxssrbl) {
        this.yffyzxssrbl = yffyzxssrbl;
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
        TCompanyJscxHis that = (TCompanyJscxHis) o;
        return Objects.equals(qyid, that.qyid) &&
                Objects.equals(yfslgjj, that.yfslgjj) &&
                Objects.equals(yfslsj, that.yfslsj) &&
                Objects.equals(yfslsxj, that.yfslsxj) &&
                Objects.equals(kjjbjgjj, that.kjjbjgjj) &&
                Objects.equals(kjjbjsj, that.kjjbjsj) &&
                Objects.equals(kjjbjsxj, that.kjjbjsxj) &&
                Objects.equals(fmzlsl, that.fmzlsl) &&
                Objects.equals(yffyzxssrbl, that.yffyzxssrbl) &&
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

        return Objects.hash(qyid, yfslgjj, yfslsj, yfslsxj, kjjbjgjj, kjjbjsj, kjjbjsxj, fmzlsl, yffyzxssrbl, cjsj, cjry, cjryxm, cjbmmc, gxsj, gxry, gxryxm, gxbm, gxbmmc, cjbm);
    }
}
