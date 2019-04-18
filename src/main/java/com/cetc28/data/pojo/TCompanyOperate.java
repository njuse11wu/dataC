package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_COMPANY_OPERATE", schema = "MEMBER", catalog = "")
public class TCompanyOperate {
    private long id;
    private String qyid;
    private long nf;
    private Long zczj;
    private Long zzc;
    private Long jzc;
    private Long zcfzl;
    private Long xsze;
    private Long yysrze;
    private Long lrze;
    private Long nsze;
    private String syzqy;
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
    public long getNf() {
        return nf;
    }

    public void setNf(long nf) {
        this.nf = nf;
    }

    @Basic
    @Column(name = "ZCZJ")
    public Long getZczj() {
        return zczj;
    }

    public void setZczj(Long zczj) {
        this.zczj = zczj;
    }

    @Basic
    @Column(name = "ZZC")
    public Long getZzc() {
        return zzc;
    }

    public void setZzc(Long zzc) {
        this.zzc = zzc;
    }

    @Basic
    @Column(name = "JZC")
    public Long getJzc() {
        return jzc;
    }

    public void setJzc(Long jzc) {
        this.jzc = jzc;
    }

    @Basic
    @Column(name = "ZCFZL")
    public Long getZcfzl() {
        return zcfzl;
    }

    public void setZcfzl(Long zcfzl) {
        this.zcfzl = zcfzl;
    }

    @Basic
    @Column(name = "XSZE")
    public Long getXsze() {
        return xsze;
    }

    public void setXsze(Long xsze) {
        this.xsze = xsze;
    }

    @Basic
    @Column(name = "YYSRZE")
    public Long getYysrze() {
        return yysrze;
    }

    public void setYysrze(Long yysrze) {
        this.yysrze = yysrze;
    }

    @Basic
    @Column(name = "LRZE")
    public Long getLrze() {
        return lrze;
    }

    public void setLrze(Long lrze) {
        this.lrze = lrze;
    }

    @Basic
    @Column(name = "NSZE")
    public Long getNsze() {
        return nsze;
    }

    public void setNsze(Long nsze) {
        this.nsze = nsze;
    }

    @Basic
    @Column(name = "SYZQY")
    public String getSyzqy() {
        return syzqy;
    }

    public void setSyzqy(String syzqy) {
        this.syzqy = syzqy;
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
        TCompanyOperate that = (TCompanyOperate) o;
        return id == that.id &&
                nf == that.nf &&
                Objects.equals(qyid, that.qyid) &&
                Objects.equals(zczj, that.zczj) &&
                Objects.equals(zzc, that.zzc) &&
                Objects.equals(jzc, that.jzc) &&
                Objects.equals(zcfzl, that.zcfzl) &&
                Objects.equals(xsze, that.xsze) &&
                Objects.equals(yysrze, that.yysrze) &&
                Objects.equals(lrze, that.lrze) &&
                Objects.equals(nsze, that.nsze) &&
                Objects.equals(syzqy, that.syzqy) &&
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

        return Objects.hash(id, qyid, nf, zczj, zzc, jzc, zcfzl, xsze, yysrze, lrze, nsze, syzqy, cjsj, cjry, cjryxm, cjbmmc, gxsj, gxry, gxryxm, gxbm, gxbmmc, cjbm);
    }
}
