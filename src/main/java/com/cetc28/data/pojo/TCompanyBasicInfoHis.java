package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_COMPANY_BASIC_INFO_HIS", schema = "MEMBER", catalog = "")
public class TCompanyBasicInfoHis {
    private String qyid;
    private String yhid;
    private String qyjc;
    private String qygsdjmc;
    private String gsdjzclx;
    private String qyszxzqy;
    private String qydmlx;
    private String qydmh;
    private String hyfl;
    private String qygm;
    private Time clsj;
    private String qyshbxdjh;
    private String qywz;
    private String qyfrid;
    private String lxr;
    private String bgdh;
    private String sjhm;
    private String dzyx;
    private String qytxdz;
    private String sfbrzwgxjsqy;
    private String rzbm;
    private String sfhdwmjckq;
    private String msxm;
    private String zyyw;
    private String zycpyfw;
    private String pzbm;
    private String qytctd;
    private String hydwjyx;
    private String sfjldzz;
    private String dzzjg;
    private Long dyrs;
    private String dwsjxm;
    private Time dzzclsj;
    private String sfjltzz;
    private String tzzjg;
    private Long tyrs;
    private String twsjxm;
    private Time tzzclsj;
    private String sfjlghzz;
    private Long ghhyrs;
    private Long zzgsbl;
    private String ghzxxm;
    private Time ghclsj;
    private String qyjbqkjj;
    private String sfynsxyjb;
    private Integer zgzrs;
    private Long zgldhtqdl;
    private String qyqdjthtqk;
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
    private String qyszsf;
    private String qyszcs;
    private String qyszqx;
    private String dbrsqyfl;
    private String yb;
    private String qyfrxm;
    private Long zczj;
    private String isrealdata;
    private String frzw;
    private String frdh;
    private String frsj;
    private String lxrdh;
    private String lxrzw;
    private String dataId;
    private String tyshxydm;
    private String dataZj;
    private Long sxbz;
    private Time rhsj;
    private String ssgj;
    private String qygjbmlx;
    private Long dqzzcze;

    @Id
    @Column(name = "QYID")
    public String getQyid() {
        return qyid;
    }

    public void setQyid(String qyid) {
        this.qyid = qyid;
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
    @Column(name = "QYJC")
    public String getQyjc() {
        return qyjc;
    }

    public void setQyjc(String qyjc) {
        this.qyjc = qyjc;
    }

    @Basic
    @Column(name = "QYGSDJMC")
    public String getQygsdjmc() {
        return qygsdjmc;
    }

    public void setQygsdjmc(String qygsdjmc) {
        this.qygsdjmc = qygsdjmc;
    }

    @Basic
    @Column(name = "GSDJZCLX")
    public String getGsdjzclx() {
        return gsdjzclx;
    }

    public void setGsdjzclx(String gsdjzclx) {
        this.gsdjzclx = gsdjzclx;
    }

    @Basic
    @Column(name = "QYSZXZQY")
    public String getQyszxzqy() {
        return qyszxzqy;
    }

    public void setQyszxzqy(String qyszxzqy) {
        this.qyszxzqy = qyszxzqy;
    }

    @Basic
    @Column(name = "QYDMLX")
    public String getQydmlx() {
        return qydmlx;
    }

    public void setQydmlx(String qydmlx) {
        this.qydmlx = qydmlx;
    }

    @Basic
    @Column(name = "QYDMH")
    public String getQydmh() {
        return qydmh;
    }

    public void setQydmh(String qydmh) {
        this.qydmh = qydmh;
    }

    @Basic
    @Column(name = "HYFL")
    public String getHyfl() {
        return hyfl;
    }

    public void setHyfl(String hyfl) {
        this.hyfl = hyfl;
    }

    @Basic
    @Column(name = "QYGM")
    public String getQygm() {
        return qygm;
    }

    public void setQygm(String qygm) {
        this.qygm = qygm;
    }

    @Basic
    @Column(name = "CLSJ")
    public Time getClsj() {
        return clsj;
    }

    public void setClsj(Time clsj) {
        this.clsj = clsj;
    }

    @Basic
    @Column(name = "QYSHBXDJH")
    public String getQyshbxdjh() {
        return qyshbxdjh;
    }

    public void setQyshbxdjh(String qyshbxdjh) {
        this.qyshbxdjh = qyshbxdjh;
    }

    @Basic
    @Column(name = "QYWZ")
    public String getQywz() {
        return qywz;
    }

    public void setQywz(String qywz) {
        this.qywz = qywz;
    }

    @Basic
    @Column(name = "QYFRID")
    public String getQyfrid() {
        return qyfrid;
    }

    public void setQyfrid(String qyfrid) {
        this.qyfrid = qyfrid;
    }

    @Basic
    @Column(name = "LXR")
    public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr;
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
    @Column(name = "QYTXDZ")
    public String getQytxdz() {
        return qytxdz;
    }

    public void setQytxdz(String qytxdz) {
        this.qytxdz = qytxdz;
    }

    @Basic
    @Column(name = "SFBRZWGXJSQY")
    public String getSfbrzwgxjsqy() {
        return sfbrzwgxjsqy;
    }

    public void setSfbrzwgxjsqy(String sfbrzwgxjsqy) {
        this.sfbrzwgxjsqy = sfbrzwgxjsqy;
    }

    @Basic
    @Column(name = "RZBM")
    public String getRzbm() {
        return rzbm;
    }

    public void setRzbm(String rzbm) {
        this.rzbm = rzbm;
    }

    @Basic
    @Column(name = "SFHDWMJCKQ")
    public String getSfhdwmjckq() {
        return sfhdwmjckq;
    }

    public void setSfhdwmjckq(String sfhdwmjckq) {
        this.sfhdwmjckq = sfhdwmjckq;
    }

    @Basic
    @Column(name = "MSXM")
    public String getMsxm() {
        return msxm;
    }

    public void setMsxm(String msxm) {
        this.msxm = msxm;
    }

    @Basic
    @Column(name = "ZYYW")
    public String getZyyw() {
        return zyyw;
    }

    public void setZyyw(String zyyw) {
        this.zyyw = zyyw;
    }

    @Basic
    @Column(name = "ZYCPYFW")
    public String getZycpyfw() {
        return zycpyfw;
    }

    public void setZycpyfw(String zycpyfw) {
        this.zycpyfw = zycpyfw;
    }

    @Basic
    @Column(name = "PZBM")
    public String getPzbm() {
        return pzbm;
    }

    public void setPzbm(String pzbm) {
        this.pzbm = pzbm;
    }

    @Basic
    @Column(name = "QYTCTD")
    public String getQytctd() {
        return qytctd;
    }

    public void setQytctd(String qytctd) {
        this.qytctd = qytctd;
    }

    @Basic
    @Column(name = "HYDWJYX")
    public String getHydwjyx() {
        return hydwjyx;
    }

    public void setHydwjyx(String hydwjyx) {
        this.hydwjyx = hydwjyx;
    }

    @Basic
    @Column(name = "SFJLDZZ")
    public String getSfjldzz() {
        return sfjldzz;
    }

    public void setSfjldzz(String sfjldzz) {
        this.sfjldzz = sfjldzz;
    }

    @Basic
    @Column(name = "DZZJG")
    public String getDzzjg() {
        return dzzjg;
    }

    public void setDzzjg(String dzzjg) {
        this.dzzjg = dzzjg;
    }

    @Basic
    @Column(name = "DYRS")
    public Long getDyrs() {
        return dyrs;
    }

    public void setDyrs(Long dyrs) {
        this.dyrs = dyrs;
    }

    @Basic
    @Column(name = "DWSJXM")
    public String getDwsjxm() {
        return dwsjxm;
    }

    public void setDwsjxm(String dwsjxm) {
        this.dwsjxm = dwsjxm;
    }

    @Basic
    @Column(name = "DZZCLSJ")
    public Time getDzzclsj() {
        return dzzclsj;
    }

    public void setDzzclsj(Time dzzclsj) {
        this.dzzclsj = dzzclsj;
    }

    @Basic
    @Column(name = "SFJLTZZ")
    public String getSfjltzz() {
        return sfjltzz;
    }

    public void setSfjltzz(String sfjltzz) {
        this.sfjltzz = sfjltzz;
    }

    @Basic
    @Column(name = "TZZJG")
    public String getTzzjg() {
        return tzzjg;
    }

    public void setTzzjg(String tzzjg) {
        this.tzzjg = tzzjg;
    }

    @Basic
    @Column(name = "TYRS")
    public Long getTyrs() {
        return tyrs;
    }

    public void setTyrs(Long tyrs) {
        this.tyrs = tyrs;
    }

    @Basic
    @Column(name = "TWSJXM")
    public String getTwsjxm() {
        return twsjxm;
    }

    public void setTwsjxm(String twsjxm) {
        this.twsjxm = twsjxm;
    }

    @Basic
    @Column(name = "TZZCLSJ")
    public Time getTzzclsj() {
        return tzzclsj;
    }

    public void setTzzclsj(Time tzzclsj) {
        this.tzzclsj = tzzclsj;
    }

    @Basic
    @Column(name = "SFJLGHZZ")
    public String getSfjlghzz() {
        return sfjlghzz;
    }

    public void setSfjlghzz(String sfjlghzz) {
        this.sfjlghzz = sfjlghzz;
    }

    @Basic
    @Column(name = "GHHYRS")
    public Long getGhhyrs() {
        return ghhyrs;
    }

    public void setGhhyrs(Long ghhyrs) {
        this.ghhyrs = ghhyrs;
    }

    @Basic
    @Column(name = "ZZGSBL")
    public Long getZzgsbl() {
        return zzgsbl;
    }

    public void setZzgsbl(Long zzgsbl) {
        this.zzgsbl = zzgsbl;
    }

    @Basic
    @Column(name = "GHZXXM")
    public String getGhzxxm() {
        return ghzxxm;
    }

    public void setGhzxxm(String ghzxxm) {
        this.ghzxxm = ghzxxm;
    }

    @Basic
    @Column(name = "GHCLSJ")
    public Time getGhclsj() {
        return ghclsj;
    }

    public void setGhclsj(Time ghclsj) {
        this.ghclsj = ghclsj;
    }

    @Basic
    @Column(name = "QYJBQKJJ")
    public String getQyjbqkjj() {
        return qyjbqkjj;
    }

    public void setQyjbqkjj(String qyjbqkjj) {
        this.qyjbqkjj = qyjbqkjj;
    }

    @Basic
    @Column(name = "SFYNSXYJB")
    public String getSfynsxyjb() {
        return sfynsxyjb;
    }

    public void setSfynsxyjb(String sfynsxyjb) {
        this.sfynsxyjb = sfynsxyjb;
    }

    @Basic
    @Column(name = "ZGZRS")
    public Integer getZgzrs() {
        return zgzrs;
    }

    public void setZgzrs(Integer zgzrs) {
        this.zgzrs = zgzrs;
    }

    @Basic
    @Column(name = "ZGLDHTQDL")
    public Long getZgldhtqdl() {
        return zgldhtqdl;
    }

    public void setZgldhtqdl(Long zgldhtqdl) {
        this.zgldhtqdl = zgldhtqdl;
    }

    @Basic
    @Column(name = "QYQDJTHTQK")
    public String getQyqdjthtqk() {
        return qyqdjthtqk;
    }

    public void setQyqdjthtqk(String qyqdjthtqk) {
        this.qyqdjthtqk = qyqdjthtqk;
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
    @Column(name = "QYSZSF")
    public String getQyszsf() {
        return qyszsf;
    }

    public void setQyszsf(String qyszsf) {
        this.qyszsf = qyszsf;
    }

    @Basic
    @Column(name = "QYSZCS")
    public String getQyszcs() {
        return qyszcs;
    }

    public void setQyszcs(String qyszcs) {
        this.qyszcs = qyszcs;
    }

    @Basic
    @Column(name = "QYSZQX")
    public String getQyszqx() {
        return qyszqx;
    }

    public void setQyszqx(String qyszqx) {
        this.qyszqx = qyszqx;
    }

    @Basic
    @Column(name = "DBRSQYFL")
    public String getDbrsqyfl() {
        return dbrsqyfl;
    }

    public void setDbrsqyfl(String dbrsqyfl) {
        this.dbrsqyfl = dbrsqyfl;
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
    @Column(name = "QYFRXM")
    public String getQyfrxm() {
        return qyfrxm;
    }

    public void setQyfrxm(String qyfrxm) {
        this.qyfrxm = qyfrxm;
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
    @Column(name = "ISREALDATA")
    public String getIsrealdata() {
        return isrealdata;
    }

    public void setIsrealdata(String isrealdata) {
        this.isrealdata = isrealdata;
    }

    @Basic
    @Column(name = "FRZW")
    public String getFrzw() {
        return frzw;
    }

    public void setFrzw(String frzw) {
        this.frzw = frzw;
    }

    @Basic
    @Column(name = "FRDH")
    public String getFrdh() {
        return frdh;
    }

    public void setFrdh(String frdh) {
        this.frdh = frdh;
    }

    @Basic
    @Column(name = "FRSJ")
    public String getFrsj() {
        return frsj;
    }

    public void setFrsj(String frsj) {
        this.frsj = frsj;
    }

    @Basic
    @Column(name = "LXRDH")
    public String getLxrdh() {
        return lxrdh;
    }

    public void setLxrdh(String lxrdh) {
        this.lxrdh = lxrdh;
    }

    @Basic
    @Column(name = "LXRZW")
    public String getLxrzw() {
        return lxrzw;
    }

    public void setLxrzw(String lxrzw) {
        this.lxrzw = lxrzw;
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
    @Column(name = "TYSHXYDM")
    public String getTyshxydm() {
        return tyshxydm;
    }

    public void setTyshxydm(String tyshxydm) {
        this.tyshxydm = tyshxydm;
    }

    @Basic
    @Column(name = "DATA_ZJ")
    public String getDataZj() {
        return dataZj;
    }

    public void setDataZj(String dataZj) {
        this.dataZj = dataZj;
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

    @Basic
    @Column(name = "SSGJ")
    public String getSsgj() {
        return ssgj;
    }

    public void setSsgj(String ssgj) {
        this.ssgj = ssgj;
    }

    @Basic
    @Column(name = "QYGJBMLX")
    public String getQygjbmlx() {
        return qygjbmlx;
    }

    public void setQygjbmlx(String qygjbmlx) {
        this.qygjbmlx = qygjbmlx;
    }

    @Basic
    @Column(name = "DQZZCZE")
    public Long getDqzzcze() {
        return dqzzcze;
    }

    public void setDqzzcze(Long dqzzcze) {
        this.dqzzcze = dqzzcze;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TCompanyBasicInfoHis that = (TCompanyBasicInfoHis) o;
        return Objects.equals(qyid, that.qyid) &&
                Objects.equals(yhid, that.yhid) &&
                Objects.equals(qyjc, that.qyjc) &&
                Objects.equals(qygsdjmc, that.qygsdjmc) &&
                Objects.equals(gsdjzclx, that.gsdjzclx) &&
                Objects.equals(qyszxzqy, that.qyszxzqy) &&
                Objects.equals(qydmlx, that.qydmlx) &&
                Objects.equals(qydmh, that.qydmh) &&
                Objects.equals(hyfl, that.hyfl) &&
                Objects.equals(qygm, that.qygm) &&
                Objects.equals(clsj, that.clsj) &&
                Objects.equals(qyshbxdjh, that.qyshbxdjh) &&
                Objects.equals(qywz, that.qywz) &&
                Objects.equals(qyfrid, that.qyfrid) &&
                Objects.equals(lxr, that.lxr) &&
                Objects.equals(bgdh, that.bgdh) &&
                Objects.equals(sjhm, that.sjhm) &&
                Objects.equals(dzyx, that.dzyx) &&
                Objects.equals(qytxdz, that.qytxdz) &&
                Objects.equals(sfbrzwgxjsqy, that.sfbrzwgxjsqy) &&
                Objects.equals(rzbm, that.rzbm) &&
                Objects.equals(sfhdwmjckq, that.sfhdwmjckq) &&
                Objects.equals(msxm, that.msxm) &&
                Objects.equals(zyyw, that.zyyw) &&
                Objects.equals(zycpyfw, that.zycpyfw) &&
                Objects.equals(pzbm, that.pzbm) &&
                Objects.equals(qytctd, that.qytctd) &&
                Objects.equals(hydwjyx, that.hydwjyx) &&
                Objects.equals(sfjldzz, that.sfjldzz) &&
                Objects.equals(dzzjg, that.dzzjg) &&
                Objects.equals(dyrs, that.dyrs) &&
                Objects.equals(dwsjxm, that.dwsjxm) &&
                Objects.equals(dzzclsj, that.dzzclsj) &&
                Objects.equals(sfjltzz, that.sfjltzz) &&
                Objects.equals(tzzjg, that.tzzjg) &&
                Objects.equals(tyrs, that.tyrs) &&
                Objects.equals(twsjxm, that.twsjxm) &&
                Objects.equals(tzzclsj, that.tzzclsj) &&
                Objects.equals(sfjlghzz, that.sfjlghzz) &&
                Objects.equals(ghhyrs, that.ghhyrs) &&
                Objects.equals(zzgsbl, that.zzgsbl) &&
                Objects.equals(ghzxxm, that.ghzxxm) &&
                Objects.equals(ghclsj, that.ghclsj) &&
                Objects.equals(qyjbqkjj, that.qyjbqkjj) &&
                Objects.equals(sfynsxyjb, that.sfynsxyjb) &&
                Objects.equals(zgzrs, that.zgzrs) &&
                Objects.equals(zgldhtqdl, that.zgldhtqdl) &&
                Objects.equals(qyqdjthtqk, that.qyqdjthtqk) &&
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
                Objects.equals(qyszsf, that.qyszsf) &&
                Objects.equals(qyszcs, that.qyszcs) &&
                Objects.equals(qyszqx, that.qyszqx) &&
                Objects.equals(dbrsqyfl, that.dbrsqyfl) &&
                Objects.equals(yb, that.yb) &&
                Objects.equals(qyfrxm, that.qyfrxm) &&
                Objects.equals(zczj, that.zczj) &&
                Objects.equals(isrealdata, that.isrealdata) &&
                Objects.equals(frzw, that.frzw) &&
                Objects.equals(frdh, that.frdh) &&
                Objects.equals(frsj, that.frsj) &&
                Objects.equals(lxrdh, that.lxrdh) &&
                Objects.equals(lxrzw, that.lxrzw) &&
                Objects.equals(dataId, that.dataId) &&
                Objects.equals(tyshxydm, that.tyshxydm) &&
                Objects.equals(dataZj, that.dataZj) &&
                Objects.equals(sxbz, that.sxbz) &&
                Objects.equals(rhsj, that.rhsj) &&
                Objects.equals(ssgj, that.ssgj) &&
                Objects.equals(qygjbmlx, that.qygjbmlx) &&
                Objects.equals(dqzzcze, that.dqzzcze);
    }

    @Override
    public int hashCode() {

        return Objects.hash(qyid, yhid, qyjc, qygsdjmc, gsdjzclx, qyszxzqy, qydmlx, qydmh, hyfl, qygm, clsj, qyshbxdjh, qywz, qyfrid, lxr, bgdh, sjhm, dzyx, qytxdz, sfbrzwgxjsqy, rzbm, sfhdwmjckq, msxm, zyyw, zycpyfw, pzbm, qytctd, hydwjyx, sfjldzz, dzzjg, dyrs, dwsjxm, dzzclsj, sfjltzz, tzzjg, tyrs, twsjxm, tzzclsj, sfjlghzz, ghhyrs, zzgsbl, ghzxxm, ghclsj, qyjbqkjj, sfynsxyjb, zgzrs, zgldhtqdl, qyqdjthtqk, cjsj, cjry, cjryxm, cjbm, cjbmmc, gxsj, gxry, gxryxm, gxbm, gxbmmc, qyszsf, qyszcs, qyszqx, dbrsqyfl, yb, qyfrxm, zczj, isrealdata, frzw, frdh, frsj, lxrdh, lxrzw, dataId, tyshxydm, dataZj, sxbz, rhsj, ssgj, qygjbmlx, dqzzcze);
    }
}
