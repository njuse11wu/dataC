package com.cetc28.data.pojo;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author cetc28
 */
@Entity
@Table(name = "T_PERSON_EXPORT", schema = "MEMBER")
public class TPersonExport {
    private String ryid;
    private String xm;
    private String zzmc;
    private String ryfl;
    private String xb;
    private String csrq;
    private String mz;
    private String zjlx;
    private String zjhm;
    private String jg;
    private String csd;
    private String cym;
    private String zzmm;
    private String xl;
    private String lxdh;
    private String txdz;
    private String zj;
    private String yb;
    private String yx;
    private String qq;
    private String wx;
    private String gslzwl;
    private String rdzwl;
    private String zfzwl;
    private String zxzwl;
    private String qyzwl;
    private String qtzwl;
    private String grzyry;
    private String shmc;

    @Id
    @Column(name = "RYID")
    public String getRyid() {
        return ryid;
    }

    public TPersonExport setRyid(String ryid) {
        this.ryid = ryid;
        return this;
    }

    @Basic
    @Column(name = "XM")
    public String getXm() {
        return xm;
    }

    public TPersonExport setXm(String xm) {
        this.xm = xm;
        return this;
    }

    @Basic
    @Column(name = "ZZMC")
    public String getZzmc() {
        return zzmc;
    }

    public TPersonExport setZzmc(String zzmc) {
        this.zzmc = zzmc;
        return this;
    }

    @Basic
    @Column(name = "RYFL")
    public String getRyfl() {
        return ryfl;
    }

    public TPersonExport setRyfl(String ryfl) {
        this.ryfl = ryfl;
        return this;
    }

    @Basic
    @Column(name = "XB")
    public String getXb() {
        return xb;
    }

    public TPersonExport setXb(String xb) {
        this.xb = xb;
        return this;
    }

    @Basic
    @Column(name = "CSRQ")
    public String getCsrq() {
        return csrq;
    }

    public TPersonExport setCsrq(String csrq) {
        this.csrq = csrq;
        return this;
    }

    @Basic
    @Column(name = "MZ")
    public String getMz() {
        return mz;
    }

    public TPersonExport setMz(String mz) {
        this.mz = mz;
        return this;
    }

    @Basic
    @Column(name = "ZJLX")
    public String getZjlx() {
        return zjlx;
    }

    public TPersonExport setZjlx(String zjlx) {
        this.zjlx = zjlx;
        return this;
    }

    @Basic
    @Column(name = "ZJHM")
    public String getZjhm() {
        return zjhm;
    }

    public TPersonExport setZjhm(String zjhm) {
        this.zjhm = zjhm;
        return this;
    }

    @Basic
    @Column(name = "JG")
    public String getJg() {
        return jg;
    }

    public TPersonExport setJg(String jg) {
        this.jg = jg;
        return this;
    }

    @Basic
    @Column(name = "CSD")
    public String getCsd() {
        return csd;
    }

    public TPersonExport setCsd(String csd) {
        this.csd = csd;
        return this;
    }

    @Basic
    @Column(name = "CYM")
    public String getCym() {
        return cym;
    }

    public TPersonExport setCym(String cym) {
        this.cym = cym;
        return this;
    }

    @Basic
    @Column(name = "ZZMM")
    public String getZzmm() {
        return zzmm;
    }

    public TPersonExport setZzmm(String zzmm) {
        this.zzmm = zzmm;
        return this;
    }

    @Basic
    @Column(name = "XL")
    public String getXl() {
        return xl;
    }

    public TPersonExport setXl(String xl) {
        this.xl = xl;
        return this;
    }

    @Basic
    @Column(name = "LXDH")
    public String getLxdh() {
        return lxdh;
    }

    public TPersonExport setLxdh(String lxdh) {
        this.lxdh = lxdh;
        return this;
    }

    @Basic
    @Column(name = "TXDZ")
    public String getTxdz() {
        return txdz;
    }

    public TPersonExport setTxdz(String txdz) {
        this.txdz = txdz;
        return this;
    }

    @Basic
    @Column(name = "ZJ")
    public String getZj() {
        return zj;
    }

    public TPersonExport setZj(String zj) {
        this.zj = zj;
        return this;
    }

    @Basic
    @Column(name = "YB")
    public String getYb() {
        return yb;
    }

    public TPersonExport setYb(String yb) {
        this.yb = yb;
        return this;
    }

    @Basic
    @Column(name = "YX")
    public String getYx() {
        return yx;
    }

    public TPersonExport setYx(String yx) {
        this.yx = yx;
        return this;
    }

    @Basic
    @Column(name = "QQ")
    public String getQq() {
        return qq;
    }

    public TPersonExport setQq(String qq) {
        this.qq = qq;
        return this;
    }

    @Basic
    @Column(name = "WX")
    public String getWx() {
        return wx;
    }

    public TPersonExport setWx(String wx) {
        this.wx = wx;
        return this;
    }

    @Basic
    @Column(name = "GSLZWL")
    public String getGslzwl() {
        return gslzwl;
    }

    public TPersonExport setGslzwl(String gslzwl) {
        this.gslzwl = gslzwl;
        return this;
    }

    @Basic
    @Column(name = "RDZWL")
    public String getRdzwl() {
        return rdzwl;
    }

    public TPersonExport setRdzwl(String rdzwl) {
        this.rdzwl = rdzwl;
        return this;
    }

    @Basic
    @Column(name = "ZFZWL")
    public String getZfzwl() {
        return zfzwl;
    }

    public TPersonExport setZfzwl(String zfzwl) {
        this.zfzwl = zfzwl;
        return this;
    }

    @Basic
    @Column(name = "ZXZWL")
    public String getZxzwl() {
        return zxzwl;
    }

    public TPersonExport setZxzwl(String zxzwl) {
        this.zxzwl = zxzwl;
        return this;
    }

    @Basic
    @Column(name = "QYZWL")
    public String getQyzwl() {
        return qyzwl;
    }

    public TPersonExport setQyzwl(String qyzwl) {
        this.qyzwl = qyzwl;
        return this;
    }

    @Basic
    @Column(name = "QTZWL")
    public String getQtzwl() {
        return qtzwl;
    }

    public TPersonExport setQtzwl(String qtzwl) {
        this.qtzwl = qtzwl;
        return this;
    }

    @Basic
    @Column(name = "GRZYRY")
    public String getGrzyry() {
        return grzyry;
    }

    public TPersonExport setGrzyry(String grzyry) {
        this.grzyry = grzyry;
        return this;
    }

    @Basic
    @Column(name = "SHMC")
    public String getShmc() {
        return shmc;
    }

    public TPersonExport setShmc(String shmc) {
        this.shmc = shmc;
        return this;
    }


}
