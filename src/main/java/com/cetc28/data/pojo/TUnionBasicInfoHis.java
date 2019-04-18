package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_UNION_BASIC_INFO_HIS", schema = "MEMBER", catalog = "")
public class TUnionBasicInfoHis {
    private String ttid;
    private String yhid;
    private String ttszqy;
    private String ttfl;
    private String zwmc;
    private String ywmc;
    private Time clrq;
    private String ttfr;
    private String ywzgbm;
    private String pzdjjg;
    private String tyshxydm;
    private String stlxr;
    private String bgdh;
    private String sjhm;
    private String dzyx;
    private String txdz;
    private String cz;
    private String yzbm;
    private String ttwz;
    private Long xsqyhysl;
    private Long xstthysl;
    private Long xsgrhysl;
    private String ttjj;
    private String ryid;
    private Time cjsj;
    private String cjry;
    private String cjryxm;
    private String cjbm;
    private String cjbmmc;
    private Time gxsj;
    private String gxry;
    private String gxryxm;
    private String gxbm;
    private String gxbmmc;
    private String ttszsf;
    private String ttszcs;
    private String ttszqx;
    private Long sxbz;
    private Time rhsj;

    @Id
    @Column(name = "TTID")
    public String getTtid() {
        return ttid;
    }

    public void setTtid(String ttid) {
        this.ttid = ttid;
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
    @Column(name = "TTSZQY")
    public String getTtszqy() {
        return ttszqy;
    }

    public void setTtszqy(String ttszqy) {
        this.ttszqy = ttszqy;
    }

    @Basic
    @Column(name = "TTFL")
    public String getTtfl() {
        return ttfl;
    }

    public void setTtfl(String ttfl) {
        this.ttfl = ttfl;
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
    @Column(name = "YWMC")
    public String getYwmc() {
        return ywmc;
    }

    public void setYwmc(String ywmc) {
        this.ywmc = ywmc;
    }

    @Basic
    @Column(name = "CLRQ")
    public Time getClrq() {
        return clrq;
    }

    public void setClrq(Time clrq) {
        this.clrq = clrq;
    }

    @Basic
    @Column(name = "TTFR")
    public String getTtfr() {
        return ttfr;
    }

    public void setTtfr(String ttfr) {
        this.ttfr = ttfr;
    }

    @Basic
    @Column(name = "YWZGBM")
    public String getYwzgbm() {
        return ywzgbm;
    }

    public void setYwzgbm(String ywzgbm) {
        this.ywzgbm = ywzgbm;
    }

    @Basic
    @Column(name = "PZDJJG")
    public String getPzdjjg() {
        return pzdjjg;
    }

    public void setPzdjjg(String pzdjjg) {
        this.pzdjjg = pzdjjg;
    }

    @Basic
    @Column(name = "TYSHXYDM")
    public String getTyshxydm() {
        return tyshxydm;
    }

    public void setTyshxydm(String tyshxydm) {
        this.tyshxydm = tyshxydm;
    }

    @Basic
    @Column(name = "STLXR")
    public String getStlxr() {
        return stlxr;
    }

    public void setStlxr(String stlxr) {
        this.stlxr = stlxr;
    }

    @Basic
    @Column(name = "BGDH")
    public String getBgdh() {
        return bgdh;
    }

    public void setBgdh(String bgdh) {
        this.bgdh = bgdh;
    }

    @Basic
    @Column(name = "SJHM")
    public String getSjhm() {
        return sjhm;
    }

    public void setSjhm(String sjhm) {
        this.sjhm = sjhm;
    }

    @Basic
    @Column(name = "DZYX")
    public String getDzyx() {
        return dzyx;
    }

    public void setDzyx(String dzyx) {
        this.dzyx = dzyx;
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
    @Column(name = "CZ")
    public String getCz() {
        return cz;
    }

    public void setCz(String cz) {
        this.cz = cz;
    }

    @Basic
    @Column(name = "YZBM")
    public String getYzbm() {
        return yzbm;
    }

    public void setYzbm(String yzbm) {
        this.yzbm = yzbm;
    }

    @Basic
    @Column(name = "TTWZ")
    public String getTtwz() {
        return ttwz;
    }

    public void setTtwz(String ttwz) {
        this.ttwz = ttwz;
    }

    @Basic
    @Column(name = "XSQYHYSL")
    public Long getXsqyhysl() {
        return xsqyhysl;
    }

    public void setXsqyhysl(Long xsqyhysl) {
        this.xsqyhysl = xsqyhysl;
    }

    @Basic
    @Column(name = "XSTTHYSL")
    public Long getXstthysl() {
        return xstthysl;
    }

    public void setXstthysl(Long xstthysl) {
        this.xstthysl = xstthysl;
    }

    @Basic
    @Column(name = "XSGRHYSL")
    public Long getXsgrhysl() {
        return xsgrhysl;
    }

    public void setXsgrhysl(Long xsgrhysl) {
        this.xsgrhysl = xsgrhysl;
    }

    @Basic
    @Column(name = "TTJJ")
    public String getTtjj() {
        return ttjj;
    }

    public void setTtjj(String ttjj) {
        this.ttjj = ttjj;
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
    @Column(name = "TTSZSF")
    public String getTtszsf() {
        return ttszsf;
    }

    public void setTtszsf(String ttszsf) {
        this.ttszsf = ttszsf;
    }

    @Basic
    @Column(name = "TTSZCS")
    public String getTtszcs() {
        return ttszcs;
    }

    public void setTtszcs(String ttszcs) {
        this.ttszcs = ttszcs;
    }

    @Basic
    @Column(name = "TTSZQX")
    public String getTtszqx() {
        return ttszqx;
    }

    public void setTtszqx(String ttszqx) {
        this.ttszqx = ttszqx;
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
    @Column(name = "RHSJ")
    public Time getRhsj() {
        return rhsj;
    }

    public void setRhsj(Time rhsj) {
        this.rhsj = rhsj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TUnionBasicInfoHis that = (TUnionBasicInfoHis) o;
        return Objects.equals(ttid, that.ttid) &&
                Objects.equals(yhid, that.yhid) &&
                Objects.equals(ttszqy, that.ttszqy) &&
                Objects.equals(ttfl, that.ttfl) &&
                Objects.equals(zwmc, that.zwmc) &&
                Objects.equals(ywmc, that.ywmc) &&
                Objects.equals(clrq, that.clrq) &&
                Objects.equals(ttfr, that.ttfr) &&
                Objects.equals(ywzgbm, that.ywzgbm) &&
                Objects.equals(pzdjjg, that.pzdjjg) &&
                Objects.equals(tyshxydm, that.tyshxydm) &&
                Objects.equals(stlxr, that.stlxr) &&
                Objects.equals(bgdh, that.bgdh) &&
                Objects.equals(sjhm, that.sjhm) &&
                Objects.equals(dzyx, that.dzyx) &&
                Objects.equals(txdz, that.txdz) &&
                Objects.equals(cz, that.cz) &&
                Objects.equals(yzbm, that.yzbm) &&
                Objects.equals(ttwz, that.ttwz) &&
                Objects.equals(xsqyhysl, that.xsqyhysl) &&
                Objects.equals(xstthysl, that.xstthysl) &&
                Objects.equals(xsgrhysl, that.xsgrhysl) &&
                Objects.equals(ttjj, that.ttjj) &&
                Objects.equals(ryid, that.ryid) &&
                Objects.equals(cjsj, that.cjsj) &&
                Objects.equals(cjry, that.cjry) &&
                Objects.equals(cjryxm, that.cjryxm) &&
                Objects.equals(cjbm, that.cjbm) &&
                Objects.equals(cjbmmc, that.cjbmmc) &&
                Objects.equals(gxsj, that.gxsj) &&
                Objects.equals(gxry, that.gxry) &&
                Objects.equals(gxryxm, that.gxryxm) &&
                Objects.equals(gxbm, that.gxbm) &&
                Objects.equals(gxbmmc, that.gxbmmc) &&
                Objects.equals(ttszsf, that.ttszsf) &&
                Objects.equals(ttszcs, that.ttszcs) &&
                Objects.equals(ttszqx, that.ttszqx) &&
                Objects.equals(sxbz, that.sxbz) &&
                Objects.equals(rhsj, that.rhsj);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ttid, yhid, ttszqy, ttfl, zwmc, ywmc, clrq, ttfr, ywzgbm, pzdjjg, tyshxydm, stlxr, bgdh, sjhm, dzyx, txdz, cz, yzbm, ttwz, xsqyhysl, xstthysl, xsgrhysl, ttjj, ryid, cjsj, cjry, cjryxm, cjbm, cjbmmc, gxsj, gxry, gxryxm, gxbm, gxbmmc, ttszsf, ttszcs, ttszqx, sxbz, rhsj);
    }
}
