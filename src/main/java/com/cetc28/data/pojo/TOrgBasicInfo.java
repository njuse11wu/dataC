package com.cetc28.data.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T_ORG_BASIC_INFO", schema = "MEMBER", catalog = "")
public class TOrgBasicInfo {
    private String zzid;
    private String fzzid;
    private String zzmc;
    private String zzbm;
    private String zzlx;
    private String zzjgzt;
    private String lyzj;
    private String xzqh;
    private String sheng;
    private String shi;
    private String xian;
    private String xiang;
    private String cun;
    private String oldSystemId;
    private String xzjb;
    private String dataId;
    private String mhzzid;
    private String sfgsl;
    private Long showseq;
    private String wwyhmhzzid;

    @Id
    @Column(name = "ZZID")
    public String getZzid() {
        return zzid;
    }

    public void setZzid(String zzid) {
        this.zzid = zzid;
    }

    @Basic
    @Column(name = "FZZID")
    public String getFzzid() {
        return fzzid;
    }

    public void setFzzid(String fzzid) {
        this.fzzid = fzzid;
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
    @Column(name = "ZZBM")
    public String getZzbm() {
        return zzbm;
    }

    public void setZzbm(String zzbm) {
        this.zzbm = zzbm;
    }

    @Basic
    @Column(name = "ZZLX")
    public String getZzlx() {
        return zzlx;
    }

    public void setZzlx(String zzlx) {
        this.zzlx = zzlx;
    }

    @Basic
    @Column(name = "ZZJGZT")
    public String getZzjgzt() {
        return zzjgzt;
    }

    public void setZzjgzt(String zzjgzt) {
        this.zzjgzt = zzjgzt;
    }

    @Basic
    @Column(name = "LYZJ")
    public String getLyzj() {
        return lyzj;
    }

    public void setLyzj(String lyzj) {
        this.lyzj = lyzj;
    }

    @Basic
    @Column(name = "XZQH")
    public String getXzqh() {
        return xzqh;
    }

    public void setXzqh(String xzqh) {
        this.xzqh = xzqh;
    }

    @Basic
    @Column(name = "SHENG")
    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng;
    }

    @Basic
    @Column(name = "SHI")
    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi;
    }

    @Basic
    @Column(name = "XIAN")
    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }

    @Basic
    @Column(name = "XIANG")
    public String getXiang() {
        return xiang;
    }

    public void setXiang(String xiang) {
        this.xiang = xiang;
    }

    @Basic
    @Column(name = "CUN")
    public String getCun() {
        return cun;
    }

    public void setCun(String cun) {
        this.cun = cun;
    }

    @Basic
    @Column(name = "OLD_SYSTEM_ID")
    public String getOldSystemId() {
        return oldSystemId;
    }

    public void setOldSystemId(String oldSystemId) {
        this.oldSystemId = oldSystemId;
    }

    @Basic
    @Column(name = "XZJB")
    public String getXzjb() {
        return xzjb;
    }

    public void setXzjb(String xzjb) {
        this.xzjb = xzjb;
    }

    @Basic
    @Column(name = "DATA_ID")
    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    @Basic
    @Column(name = "MHZZID")
    public String getMhzzid() {
        return mhzzid;
    }

    public void setMhzzid(String mhzzid) {
        this.mhzzid = mhzzid;
    }

    @Basic
    @Column(name = "SFGSL")
    public String getSfgsl() {
        return sfgsl;
    }

    public void setSfgsl(String sfgsl) {
        this.sfgsl = sfgsl;
    }

    @Basic
    @Column(name = "SHOWSEQ")
    public Long getShowseq() {
        return showseq;
    }

    public void setShowseq(Long showseq) {
        this.showseq = showseq;
    }

    @Basic
    @Column(name = "WWYHMHZZID")
    public String getWwyhmhzzid() {
        return wwyhmhzzid;
    }

    public void setWwyhmhzzid(String wwyhmhzzid) {
        this.wwyhmhzzid = wwyhmhzzid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TOrgBasicInfo that = (TOrgBasicInfo) o;
        return Objects.equals(zzid, that.zzid) &&
                Objects.equals(fzzid, that.fzzid) &&
                Objects.equals(zzmc, that.zzmc) &&
                Objects.equals(zzbm, that.zzbm) &&
                Objects.equals(zzlx, that.zzlx) &&
                Objects.equals(zzjgzt, that.zzjgzt) &&
                Objects.equals(lyzj, that.lyzj) &&
                Objects.equals(xzqh, that.xzqh) &&
                Objects.equals(sheng, that.sheng) &&
                Objects.equals(shi, that.shi) &&
                Objects.equals(xian, that.xian) &&
                Objects.equals(xiang, that.xiang) &&
                Objects.equals(cun, that.cun) &&
                Objects.equals(oldSystemId, that.oldSystemId) &&
                Objects.equals(xzjb, that.xzjb) &&
                Objects.equals(dataId, that.dataId) &&
                Objects.equals(mhzzid, that.mhzzid) &&
                Objects.equals(sfgsl, that.sfgsl) &&
                Objects.equals(showseq, that.showseq) &&
                Objects.equals(wwyhmhzzid, that.wwyhmhzzid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(zzid, fzzid, zzmc, zzbm, zzlx, zzjgzt, lyzj, xzqh, sheng, shi, xian, xiang, cun, oldSystemId, xzjb, dataId, mhzzid, sfgsl, showseq, wwyhmhzzid);
    }
}
