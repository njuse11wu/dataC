package com.cetc28.data.pojo;

import javax.persistence.*;
import java.util.Date;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "T_PERSON_BASIC_INFO", schema = "MEMBER", catalog = "")
public class TPersonBasicInfo {
    private String ryid;
    private String yhid;
    private String ryfl;
    private String xm;
    private String xb;
    private Date csrq;
    private String mz;
    private String zjlx;
    private String zjhm;
    private String xl;
    private String xw;
    private String zzmm;
    private String gzdw;
    private String zw;
    private String txdz;
    private String lxdh;
    private String yx;
    private String jg;
    private String csd;
    private String zj;
    private String yb;
    private String cym;
    private String zp;
    private String qq;
    private String wx;
    private String sxzzbx;
    private String grjl;
    private Date cjsj;
    private String cjry;
    private String cjryxm;
    private String cjbmmc;
    private Date gxsj;
    private String gxry;
    private String gxryxm;
    private String gxbm;
    private String gxbmmc;
    private String cz;
    private String cjbm;
    private String shgatrs;
    private String sfqdwggj;
    private Date cjgzsj;
    private String gzdwszds;
    private String jcqk;
    private String fhzxh;
    private Date rdsj;
    private String lxrxm;
    private String isrealdata;
    private String msczw;
    private Date jrmscsj;
    private String dataId;
    private String gasf;
    private String shmc;
    private String shzch;
    private String photopath;
    private String gj;
    private String brsjhm;
    private String dwjzw;
    private Long sxbz;
    private Long zcze;
    private Long zgrs;
    private Date rhsj;

    @Id
    @Column(name = "RYID")
    public String getRyid() {
        return ryid;
    }

    public void setRyid(String ryid) {
        this.ryid = ryid;
    }

    @Basic
    @Column(name = "YHID")
    public String getYhid() {
        return yhid;
    }

    public void setYhid(String yhid) {
        this.yhid = yhid;
    }

    @Basic
    @Column(name = "RYFL")
    public String getRyfl() {
        return ryfl;
    }

    public void setRyfl(String ryfl) {
        this.ryfl = ryfl;
    }

    @Basic
    @Column(name = "XM")
    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    @Basic
    @Column(name = "XB")
    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    @Basic
    @Column(name = "CSRQ")
    public Date getCsrq() {
        return csrq;
    }

    public void setCsrq(Date csrq) {
        this.csrq = csrq;
    }

    @Basic
    @Column(name = "MZ")
    public String getMz() {
        return mz;
    }

    public void setMz(String mz) {
        this.mz = mz;
    }

    @Basic
    @Column(name = "ZJLX")
    public String getZjlx() {
        return zjlx;
    }

    public void setZjlx(String zjlx) {
        this.zjlx = zjlx;
    }

    @Basic
    @Column(name = "ZJHM")
    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

    @Basic
    @Column(name = "XL")
    public String getXl() {
        return xl;
    }

    public void setXl(String xl) {
        this.xl = xl;
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
    @Column(name = "ZZMM")
    public String getZzmm() {
        return zzmm;
    }

    public void setZzmm(String zzmm) {
        this.zzmm = zzmm;
    }

    @Basic
    @Column(name = "GZDW")
    public String getGzdw() {
        return gzdw;
    }

    public void setGzdw(String gzdw) {
        this.gzdw = gzdw;
    }

    @Basic
    @Column(name = "ZW")
    public String getZw() {
        return zw;
    }

    public void setZw(String zw) {
        this.zw = zw;
    }

    @Basic
    @Column(name = "TXDZ")
    public String getTxdz() {
        return txdz;
    }

    public void setTxdz(String txdz) {
        this.txdz = txdz;
    }

    @Basic
    @Column(name = "LXDH")
    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    @Basic
    @Column(name = "YX")
    public String getYx() {
        return yx;
    }

    public void setYx(String yx) {
        this.yx = yx;
    }

    @Basic
    @Column(name = "JG")
    public String getJg() {
        return jg;
    }

    public void setJg(String jg) {
        this.jg = jg;
    }

    @Basic
    @Column(name = "CSD")
    public String getCsd() {
        return csd;
    }

    public void setCsd(String csd) {
        this.csd = csd;
    }

    @Basic
    @Column(name = "ZJ")
    public String getZj() {
        return zj;
    }

    public void setZj(String zj) {
        this.zj = zj;
    }

    @Basic
    @Column(name = "YB")
    public String getYb() {
        return yb;
    }

    public void setYb(String yb) {
        this.yb = yb;
    }

    @Basic
    @Column(name = "CYM")
    public String getCym() {
        return cym;
    }

    public void setCym(String cym) {
        this.cym = cym;
    }

    @Basic
    @Column(name = "ZP")
    public String getZp() {
        return zp;
    }

    public void setZp(String zp) {
        this.zp = zp;
    }

    @Basic
    @Column(name = "QQ")
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Basic
    @Column(name = "WX")
    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx;
    }

    @Basic
    @Column(name = "SXZZBX")
    public String getSxzzbx() {
        return sxzzbx;
    }

    public void setSxzzbx(String sxzzbx) {
        this.sxzzbx = sxzzbx;
    }

    @Basic
    @Column(name = "GRJL")
    public String getGrjl() {
        return grjl;
    }

    public void setGrjl(String grjl) {
        this.grjl = grjl;
    }

    @Basic
    @Column(name = "CJSJ")
    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
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
    public Date getGxsj() {
        return gxsj;
    }

    public void setGxsj(Date gxsj) {
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
    @Column(name = "CZ")
    public String getCz() {
        return cz;
    }

    public void setCz(String cz) {
        this.cz = cz;
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
    @Column(name = "SHGATRS")
    public String getShgatrs() {
        return shgatrs;
    }

    public void setShgatrs(String shgatrs) {
        this.shgatrs = shgatrs;
    }

    @Basic
    @Column(name = "SFQDWGGJ")
    public String getSfqdwggj() {
        return sfqdwggj;
    }

    public void setSfqdwggj(String sfqdwggj) {
        this.sfqdwggj = sfqdwggj;
    }

    @Basic
    @Column(name = "CJGZSJ")
    public Date getCjgzsj() {
        return cjgzsj;
    }

    public void setCjgzsj(Date cjgzsj) {
        this.cjgzsj = cjgzsj;
    }

    @Basic
    @Column(name = "GZDWSZDS")
    public String getGzdwszds() {
        return gzdwszds;
    }

    public void setGzdwszds(String gzdwszds) {
        this.gzdwszds = gzdwszds;
    }

    @Basic
    @Column(name = "JCQK")
    public String getJcqk() {
        return jcqk;
    }

    public void setJcqk(String jcqk) {
        this.jcqk = jcqk;
    }

    @Basic
    @Column(name = "FHZXH")
    public String getFhzxh() {
        return fhzxh;
    }

    public void setFhzxh(String fhzxh) {
        this.fhzxh = fhzxh;
    }

    @Basic
    @Column(name = "RDSJ")
    public Date getRdsj() {
        return rdsj;
    }

    public void setRdsj(Date rdsj) {
        this.rdsj = rdsj;
    }

    @Basic
    @Column(name = "LXRXM")
    public String getLxrxm() {
        return lxrxm;
    }

    public void setLxrxm(String lxrxm) {
        this.lxrxm = lxrxm;
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
    @Column(name = "MSCZW")
    public String getMsczw() {
        return msczw;
    }

    public void setMsczw(String msczw) {
        this.msczw = msczw;
    }

    @Basic
    @Column(name = "JRMSCSJ")
    public Date getJrmscsj() {
        return jrmscsj;
    }

    public void setJrmscsj(Date jrmscsj) {
        this.jrmscsj = jrmscsj;
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
    @Column(name = "GASF")
    public String getGasf() {
        return gasf;
    }

    public void setGasf(String gasf) {
        this.gasf = gasf;
    }

    @Basic
    @Column(name = "SHMC")
    public String getShmc() {
        return shmc;
    }

    public void setShmc(String shmc) {
        this.shmc = shmc;
    }

    @Basic
    @Column(name = "SHZCH")
    public String getShzch() {
        return shzch;
    }

    public void setShzch(String shzch) {
        this.shzch = shzch;
    }

    @Basic
    @Column(name = "PHOTOPATH")
    public String getPhotopath() {
        return photopath;
    }

    public void setPhotopath(String photopath) {
        this.photopath = photopath;
    }

    @Basic
    @Column(name = "GJ")
    public String getGj() {
        return gj;
    }

    public void setGj(String gj) {
        this.gj = gj;
    }

    @Basic
    @Column(name = "BRSJHM")
    public String getBrsjhm() {
        return brsjhm;
    }

    public void setBrsjhm(String brsjhm) {
        this.brsjhm = brsjhm;
    }

    @Basic
    @Column(name = "DWJZW")
    public String getDwjzw() {
        return dwjzw;
    }

    public void setDwjzw(String dwjzw) {
        this.dwjzw = dwjzw;
    }

    @Basic
    @Column(name = "SXBZ")
    public Long getSxbz() {
        return sxbz;
    }

    public void setSxbz(Long sxbz) {
        this.sxbz = sxbz;
    }

    @Basic
    @Column(name = "ZCZE")
    public Long getZcze() {
        return zcze;
    }

    public void setZcze(Long zcze) {
        this.zcze = zcze;
    }

    @Basic
    @Column(name = "ZGRS")
    public Long getZgrs() {
        return zgrs;
    }

    public void setZgrs(Long zgrs) {
        this.zgrs = zgrs;
    }

    @Basic
    @Column(name = "RHSJ")
    public Date getRhsj() {
        return rhsj;
    }

    public void setRhsj(Date rhsj) {
        this.rhsj = rhsj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TPersonBasicInfo that = (TPersonBasicInfo) o;
        return Objects.equals(ryid, that.ryid) &&
                Objects.equals(yhid, that.yhid) &&
                Objects.equals(ryfl, that.ryfl) &&
                Objects.equals(xm, that.xm) &&
                Objects.equals(xb, that.xb) &&
                Objects.equals(csrq, that.csrq) &&
                Objects.equals(mz, that.mz) &&
                Objects.equals(zjlx, that.zjlx) &&
                Objects.equals(zjhm, that.zjhm) &&
                Objects.equals(xl, that.xl) &&
                Objects.equals(xw, that.xw) &&
                Objects.equals(zzmm, that.zzmm) &&
                Objects.equals(gzdw, that.gzdw) &&
                Objects.equals(zw, that.zw) &&
                Objects.equals(txdz, that.txdz) &&
                Objects.equals(lxdh, that.lxdh) &&
                Objects.equals(yx, that.yx) &&
                Objects.equals(jg, that.jg) &&
                Objects.equals(csd, that.csd) &&
                Objects.equals(zj, that.zj) &&
                Objects.equals(yb, that.yb) &&
                Objects.equals(cym, that.cym) &&
                Objects.equals(zp, that.zp) &&
                Objects.equals(qq, that.qq) &&
                Objects.equals(wx, that.wx) &&
                Objects.equals(sxzzbx, that.sxzzbx) &&
                Objects.equals(grjl, that.grjl) &&
                Objects.equals(cjsj, that.cjsj) &&
                Objects.equals(cjry, that.cjry) &&
                Objects.equals(cjryxm, that.cjryxm) &&
                Objects.equals(cjbmmc, that.cjbmmc) &&
                Objects.equals(gxsj, that.gxsj) &&
                Objects.equals(gxry, that.gxry) &&
                Objects.equals(gxryxm, that.gxryxm) &&
                Objects.equals(gxbm, that.gxbm) &&
                Objects.equals(gxbmmc, that.gxbmmc) &&
                Objects.equals(cz, that.cz) &&
                Objects.equals(cjbm, that.cjbm) &&
                Objects.equals(shgatrs, that.shgatrs) &&
                Objects.equals(sfqdwggj, that.sfqdwggj) &&
                Objects.equals(cjgzsj, that.cjgzsj) &&
                Objects.equals(gzdwszds, that.gzdwszds) &&
                Objects.equals(jcqk, that.jcqk) &&
                Objects.equals(fhzxh, that.fhzxh) &&
                Objects.equals(rdsj, that.rdsj) &&
                Objects.equals(lxrxm, that.lxrxm) &&
                Objects.equals(isrealdata, that.isrealdata) &&
                Objects.equals(msczw, that.msczw) &&
                Objects.equals(jrmscsj, that.jrmscsj) &&
                Objects.equals(dataId, that.dataId) &&
                Objects.equals(gasf, that.gasf) &&
                Objects.equals(shmc, that.shmc) &&
                Objects.equals(shzch, that.shzch) &&
                Objects.equals(photopath, that.photopath) &&
                Objects.equals(gj, that.gj) &&
                Objects.equals(brsjhm, that.brsjhm) &&
                Objects.equals(dwjzw, that.dwjzw) &&
                Objects.equals(sxbz, that.sxbz) &&
                Objects.equals(zcze, that.zcze) &&
                Objects.equals(zgrs, that.zgrs) &&
                Objects.equals(rhsj, that.rhsj);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ryid, yhid, ryfl, xm, xb, csrq, mz, zjlx, zjhm, xl, xw, zzmm, gzdw, zw, txdz, lxdh, yx, jg, csd, zj, yb, cym, zp, qq, wx, sxzzbx, grjl, cjsj, cjry, cjryxm, cjbmmc, gxsj, gxry, gxryxm, gxbm, gxbmmc, cz, cjbm, shgatrs, sfqdwggj, cjgzsj, gzdwszds, jcqk, fhzxh, rdsj, lxrxm, isrealdata, msczw, jrmscsj, dataId, gasf, shmc, shzch, photopath, gj, brsjhm, dwjzw, sxbz, zcze, zgrs, rhsj);
    }

}
