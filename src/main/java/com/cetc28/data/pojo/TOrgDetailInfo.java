package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_ORG_DETAIL_INFO", schema = "MEMBER", catalog = "")
public class TOrgDetailInfo {
    private long id;
    private String zzid;
    private Long bzrs;
    private Long sjzbrs;
    private Long bwrs;
    private Long jfzs;
    private Long hfsr;
    private Long czbk;
    private String czbkbh;
    private Long qtjf;
    private String sfzkyxhy;
    private String qgwhxjgsljssfd;
    private String qggslldlxd;
    private String bgcs;
    private String bgtj;
    private String lrnf;
    private String cz;
    private String dzyx;
    private String lxdh;
    private String yb;
    private String txdz;
    private String tbrxm;
    private String tbrsj;
    private String zxsfkq;
    private String sjsfkq;
    private String sfsldz;
    private String zx;
    private String msz;
    private String hz;
    private String hzsfkq;
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
    private String fzxrs;
    private String zzfzxrs;
    private String fgjfzxrs;
    private String jjjfzxrs;
    private String gajfzxrs;
    private String qtlfzxrs;
    private Long fgcwrs;
    private Long cwrs;
    private Long fgzwrs;
    private Long zwrs;
    private Long fgfhzrs;
    private Long fhzrs;
    private Long dzrs;
    private String ldgz;
    private String tcwt;
    private String yjjy;
    private String ztpj;
    private String dyfzr;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "BZRS")
    public Long getBzrs() {
        return bzrs;
    }

    public void setBzrs(Long bzrs) {
        this.bzrs = bzrs;
    }

    @Basic
    @Column(name = "SJZBRS")
    public Long getSjzbrs() {
        return sjzbrs;
    }

    public void setSjzbrs(Long sjzbrs) {
        this.sjzbrs = sjzbrs;
    }

    @Basic
    @Column(name = "BWRS")
    public Long getBwrs() {
        return bwrs;
    }

    public void setBwrs(Long bwrs) {
        this.bwrs = bwrs;
    }

    @Basic
    @Column(name = "JFZS")
    public Long getJfzs() {
        return jfzs;
    }

    public void setJfzs(Long jfzs) {
        this.jfzs = jfzs;
    }

    @Basic
    @Column(name = "HFSR")
    public Long getHfsr() {
        return hfsr;
    }

    public void setHfsr(Long hfsr) {
        this.hfsr = hfsr;
    }

    @Basic
    @Column(name = "CZBK")
    public Long getCzbk() {
        return czbk;
    }

    public void setCzbk(Long czbk) {
        this.czbk = czbk;
    }

    @Basic
    @Column(name = "CZBKBH")
    public String getCzbkbh() {
        return czbkbh;
    }

    public void setCzbkbh(String czbkbh) {
        this.czbkbh = czbkbh;
    }

    @Basic
    @Column(name = "QTJF")
    public Long getQtjf() {
        return qtjf;
    }

    public void setQtjf(Long qtjf) {
        this.qtjf = qtjf;
    }

    @Basic
    @Column(name = "SFZKYXHY")
    public String getSfzkyxhy() {
        return sfzkyxhy;
    }

    public void setSfzkyxhy(String sfzkyxhy) {
        this.sfzkyxhy = sfzkyxhy;
    }

    @Basic
    @Column(name = "QGWHXJGSLJSSFD")
    public String getQgwhxjgsljssfd() {
        return qgwhxjgsljssfd;
    }

    public void setQgwhxjgsljssfd(String qgwhxjgsljssfd) {
        this.qgwhxjgsljssfd = qgwhxjgsljssfd;
    }

    @Basic
    @Column(name = "QGGSLLDLXD")
    public String getQggslldlxd() {
        return qggslldlxd;
    }

    public void setQggslldlxd(String qggslldlxd) {
        this.qggslldlxd = qggslldlxd;
    }

    @Basic
    @Column(name = "BGCS")
    public String getBgcs() {
        return bgcs;
    }

    public void setBgcs(String bgcs) {
        this.bgcs = bgcs;
    }

    @Basic
    @Column(name = "BGTJ")
    public String getBgtj() {
        return bgtj;
    }

    public void setBgtj(String bgtj) {
        this.bgtj = bgtj;
    }

    @Basic
    @Column(name = "LRNF")
    public String getLrnf() {
        return lrnf;
    }

    public void setLrnf(String lrnf) {
        this.lrnf = lrnf;
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
    @Column(name = "DZYX")
    public String getDzyx() {
        return dzyx;
    }

    public void setDzyx(String dzyx) {
        this.dzyx = dzyx;
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
    @Column(name = "YB")
    public String getYb() {
        return yb;
    }

    public void setYb(String yb) {
        this.yb = yb;
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
    @Column(name = "TBRXM")
    public String getTbrxm() {
        return tbrxm;
    }

    public void setTbrxm(String tbrxm) {
        this.tbrxm = tbrxm;
    }

    @Basic
    @Column(name = "TBRSJ")
    public String getTbrsj() {
        return tbrsj;
    }

    public void setTbrsj(String tbrsj) {
        this.tbrsj = tbrsj;
    }

    @Basic
    @Column(name = "ZXSFKQ")
    public String getZxsfkq() {
        return zxsfkq;
    }

    public void setZxsfkq(String zxsfkq) {
        this.zxsfkq = zxsfkq;
    }

    @Basic
    @Column(name = "SJSFKQ")
    public String getSjsfkq() {
        return sjsfkq;
    }

    public void setSjsfkq(String sjsfkq) {
        this.sjsfkq = sjsfkq;
    }

    @Basic
    @Column(name = "SFSLDZ")
    public String getSfsldz() {
        return sfsldz;
    }

    public void setSfsldz(String sfsldz) {
        this.sfsldz = sfsldz;
    }

    @Basic
    @Column(name = "ZX")
    public String getZx() {
        return zx;
    }

    public void setZx(String zx) {
        this.zx = zx;
    }

    @Basic
    @Column(name = "MSZ")
    public String getMsz() {
        return msz;
    }

    public void setMsz(String msz) {
        this.msz = msz;
    }

    @Basic
    @Column(name = "HZ")
    public String getHz() {
        return hz;
    }

    public void setHz(String hz) {
        this.hz = hz;
    }

    @Basic
    @Column(name = "HZSFKQ")
    public String getHzsfkq() {
        return hzsfkq;
    }

    public void setHzsfkq(String hzsfkq) {
        this.hzsfkq = hzsfkq;
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
    @Column(name = "FZXRS")
    public String getFzxrs() {
        return fzxrs;
    }

    public void setFzxrs(String fzxrs) {
        this.fzxrs = fzxrs;
    }

    @Basic
    @Column(name = "ZZFZXRS")
    public String getZzfzxrs() {
        return zzfzxrs;
    }

    public void setZzfzxrs(String zzfzxrs) {
        this.zzfzxrs = zzfzxrs;
    }

    @Basic
    @Column(name = "FGJFZXRS")
    public String getFgjfzxrs() {
        return fgjfzxrs;
    }

    public void setFgjfzxrs(String fgjfzxrs) {
        this.fgjfzxrs = fgjfzxrs;
    }

    @Basic
    @Column(name = "JJJFZXRS")
    public String getJjjfzxrs() {
        return jjjfzxrs;
    }

    public void setJjjfzxrs(String jjjfzxrs) {
        this.jjjfzxrs = jjjfzxrs;
    }

    @Basic
    @Column(name = "GAJFZXRS")
    public String getGajfzxrs() {
        return gajfzxrs;
    }

    public void setGajfzxrs(String gajfzxrs) {
        this.gajfzxrs = gajfzxrs;
    }

    @Basic
    @Column(name = "QTLFZXRS")
    public String getQtlfzxrs() {
        return qtlfzxrs;
    }

    public void setQtlfzxrs(String qtlfzxrs) {
        this.qtlfzxrs = qtlfzxrs;
    }

    @Basic
    @Column(name = "FGCWRS")
    public Long getFgcwrs() {
        return fgcwrs;
    }

    public void setFgcwrs(Long fgcwrs) {
        this.fgcwrs = fgcwrs;
    }

    @Basic
    @Column(name = "CWRS")
    public Long getCwrs() {
        return cwrs;
    }

    public void setCwrs(Long cwrs) {
        this.cwrs = cwrs;
    }

    @Basic
    @Column(name = "FGZWRS")
    public Long getFgzwrs() {
        return fgzwrs;
    }

    public void setFgzwrs(Long fgzwrs) {
        this.fgzwrs = fgzwrs;
    }

    @Basic
    @Column(name = "ZWRS")
    public Long getZwrs() {
        return zwrs;
    }

    public void setZwrs(Long zwrs) {
        this.zwrs = zwrs;
    }

    @Basic
    @Column(name = "FGFHZRS")
    public Long getFgfhzrs() {
        return fgfhzrs;
    }

    public void setFgfhzrs(Long fgfhzrs) {
        this.fgfhzrs = fgfhzrs;
    }

    @Basic
    @Column(name = "FHZRS")
    public Long getFhzrs() {
        return fhzrs;
    }

    public void setFhzrs(Long fhzrs) {
        this.fhzrs = fhzrs;
    }

    @Basic
    @Column(name = "DZRS")
    public Long getDzrs() {
        return dzrs;
    }

    public void setDzrs(Long dzrs) {
        this.dzrs = dzrs;
    }

    @Basic
    @Column(name = "LDGZ")
    public String getLdgz() {
        return ldgz;
    }

    public void setLdgz(String ldgz) {
        this.ldgz = ldgz;
    }

    @Basic
    @Column(name = "TCWT")
    public String getTcwt() {
        return tcwt;
    }

    public void setTcwt(String tcwt) {
        this.tcwt = tcwt;
    }

    @Basic
    @Column(name = "YJJY")
    public String getYjjy() {
        return yjjy;
    }

    public void setYjjy(String yjjy) {
        this.yjjy = yjjy;
    }

    @Basic
    @Column(name = "ZTPJ")
    public String getZtpj() {
        return ztpj;
    }

    public void setZtpj(String ztpj) {
        this.ztpj = ztpj;
    }

    @Basic
    @Column(name = "DYFZR")
    public String getDyfzr() {
        return dyfzr;
    }

    public void setDyfzr(String dyfzr) {
        this.dyfzr = dyfzr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TOrgDetailInfo that = (TOrgDetailInfo) o;
        return id == that.id &&
                Objects.equals(zzid, that.zzid) &&
                Objects.equals(bzrs, that.bzrs) &&
                Objects.equals(sjzbrs, that.sjzbrs) &&
                Objects.equals(bwrs, that.bwrs) &&
                Objects.equals(jfzs, that.jfzs) &&
                Objects.equals(hfsr, that.hfsr) &&
                Objects.equals(czbk, that.czbk) &&
                Objects.equals(czbkbh, that.czbkbh) &&
                Objects.equals(qtjf, that.qtjf) &&
                Objects.equals(sfzkyxhy, that.sfzkyxhy) &&
                Objects.equals(qgwhxjgsljssfd, that.qgwhxjgsljssfd) &&
                Objects.equals(qggslldlxd, that.qggslldlxd) &&
                Objects.equals(bgcs, that.bgcs) &&
                Objects.equals(bgtj, that.bgtj) &&
                Objects.equals(lrnf, that.lrnf) &&
                Objects.equals(cz, that.cz) &&
                Objects.equals(dzyx, that.dzyx) &&
                Objects.equals(lxdh, that.lxdh) &&
                Objects.equals(yb, that.yb) &&
                Objects.equals(txdz, that.txdz) &&
                Objects.equals(tbrxm, that.tbrxm) &&
                Objects.equals(tbrsj, that.tbrsj) &&
                Objects.equals(zxsfkq, that.zxsfkq) &&
                Objects.equals(sjsfkq, that.sjsfkq) &&
                Objects.equals(sfsldz, that.sfsldz) &&
                Objects.equals(zx, that.zx) &&
                Objects.equals(msz, that.msz) &&
                Objects.equals(hz, that.hz) &&
                Objects.equals(hzsfkq, that.hzsfkq) &&
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
                Objects.equals(fzxrs, that.fzxrs) &&
                Objects.equals(zzfzxrs, that.zzfzxrs) &&
                Objects.equals(fgjfzxrs, that.fgjfzxrs) &&
                Objects.equals(jjjfzxrs, that.jjjfzxrs) &&
                Objects.equals(gajfzxrs, that.gajfzxrs) &&
                Objects.equals(qtlfzxrs, that.qtlfzxrs) &&
                Objects.equals(fgcwrs, that.fgcwrs) &&
                Objects.equals(cwrs, that.cwrs) &&
                Objects.equals(fgzwrs, that.fgzwrs) &&
                Objects.equals(zwrs, that.zwrs) &&
                Objects.equals(fgfhzrs, that.fgfhzrs) &&
                Objects.equals(fhzrs, that.fhzrs) &&
                Objects.equals(dzrs, that.dzrs) &&
                Objects.equals(ldgz, that.ldgz) &&
                Objects.equals(tcwt, that.tcwt) &&
                Objects.equals(yjjy, that.yjjy) &&
                Objects.equals(ztpj, that.ztpj) &&
                Objects.equals(dyfzr, that.dyfzr);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, zzid, bzrs, sjzbrs, bwrs, jfzs, hfsr, czbk, czbkbh, qtjf, sfzkyxhy, qgwhxjgsljssfd, qggslldlxd, bgcs, bgtj, lrnf, cz, dzyx, lxdh, yb, txdz, tbrxm, tbrsj, zxsfkq, sjsfkq, sfsldz, zx, msz, hz, hzsfkq, cjsj, cjry, cjryxm, cjbm, cjbmmc, gxsj, gxry, gxryxm, gxbm, gxbmmc, fzxrs, zzfzxrs, fgjfzxrs, jjjfzxrs, gajfzxrs, qtlfzxrs, fgcwrs, cwrs, fgzwrs, zwrs, fgfhzrs, fhzrs, dzrs, ldgz, tcwt, yjjy, ztpj, dyfzr);
    }
}
