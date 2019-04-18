package com.cetc28.data.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T_COMPANY_EXPORT", schema = "MEMBER", catalog = "")
public class TCompanyExport {
    private String qyid;
    private String qygsdjmc;
    private String gsdjzclx;
    private String qyszxzqy;
    private String qydmlx;
    private String qydmh;
    private String hyfl;
    private String qygm;
    private String clsj;
    private String qyshbxdjh;
    private String qywz;
    private String dzyx;
    private String qytxdz;
    private String sfbrzwgxjsqy;
    private String rzbm;
    private String zyyw;
    private String zycpyfw;
    private String qytctd;
    private String sfjldzz;
    private String dzzjg;
    private String dzzclsj;
    private String tyrs;
    private String twsjxm;
    private String sfjlghzz;
    private String ghhyrs;
    private String zzgsbl;
    private String ghzxxm;
    private String ghclsj;
    private String sfynsxyjb;
    private String zgzrs;
    private String zgldhtqdl;
    private String qyfrxm;
    private String frzw;
    private String frdh;
    private String frsj;
    private String tyshxydm;
    private String ssgslmc;
    private String lxrxx;
    private String qyzczj;
    private String qyjbqqkjj;
    private String hydwhyx;
    private String qyjyqk;
    private String zyxsqy;
    private String cjshbxqk;
    private String shgy;
    private String nsxyjb;
    private String qyjscx;
    private String qydbr;
    private String shmc;

    @Id
    @Column(name = "QYID")
    public String getQyid() {
        return qyid;
    }

    public void setQyid(String qyid) {
        this.qyid = qyid;
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
    public String getClsj() {
        return clsj;
    }

    public void setClsj(String clsj) {
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
    @Column(name = "QYTCTD")
    public String getQytctd() {
        return qytctd;
    }

    public void setQytctd(String qytctd) {
        this.qytctd = qytctd;
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
    @Column(name = "DZZCLSJ")
    public String getDzzclsj() {
        return dzzclsj;
    }

    public void setDzzclsj(String dzzclsj) {
        this.dzzclsj = dzzclsj;
    }

    @Basic
    @Column(name = "TYRS")
    public String getTyrs() {
        return tyrs;
    }

    public void setTyrs(String tyrs) {
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
    @Column(name = "SFJLGHZZ")
    public String getSfjlghzz() {
        return sfjlghzz;
    }

    public void setSfjlghzz(String sfjlghzz) {
        this.sfjlghzz = sfjlghzz;
    }

    @Basic
    @Column(name = "GHHYRS")
    public String getGhhyrs() {
        return ghhyrs;
    }

    public void setGhhyrs(String ghhyrs) {
        this.ghhyrs = ghhyrs;
    }

    @Basic
    @Column(name = "ZZGSBL")
    public String getZzgsbl() {
        return zzgsbl;
    }

    public void setZzgsbl(String zzgsbl) {
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
    public String getGhclsj() {
        return ghclsj;
    }

    public void setGhclsj(String ghclsj) {
        this.ghclsj = ghclsj;
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
    public String getZgzrs() {
        return zgzrs;
    }

    public void setZgzrs(String zgzrs) {
        this.zgzrs = zgzrs;
    }

    @Basic
    @Column(name = "ZGLDHTQDL")
    public String getZgldhtqdl() {
        return zgldhtqdl;
    }

    public void setZgldhtqdl(String zgldhtqdl) {
        this.zgldhtqdl = zgldhtqdl;
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
    @Column(name = "TYSHXYDM")
    public String getTyshxydm() {
        return tyshxydm;
    }

    public void setTyshxydm(String tyshxydm) {
        this.tyshxydm = tyshxydm;
    }

    @Basic
    @Column(name = "SSGSLMC")
    public String getSsgslmc() {
        return ssgslmc;
    }

    public void setSsgslmc(String ssgslmc) {
        this.ssgslmc = ssgslmc;
    }

    @Basic
    @Column(name = "LXRXX")
    public String getLxrxx() {
        return lxrxx;
    }

    public void setLxrxx(String lxrxx) {
        this.lxrxx = lxrxx;
    }

    @Basic
    @Column(name = "QYZCZJ")
    public String getQyzczj() {
        return qyzczj;
    }

    public void setQyzczj(String qyzczj) {
        this.qyzczj = qyzczj;
    }

    @Basic
    @Column(name = "QYJBQQKJJ")
    public String getQyjbqqkjj() {
        return qyjbqqkjj;
    }

    public void setQyjbqqkjj(String qyjbqqkjj) {
        this.qyjbqqkjj = qyjbqqkjj;
    }

    @Basic
    @Column(name = "HYDWHYX")
    public String getHydwhyx() {
        return hydwhyx;
    }

    public void setHydwhyx(String hydwhyx) {
        this.hydwhyx = hydwhyx;
    }

    @Basic
    @Column(name = "QYJYQK")
    public String getQyjyqk() {
        return qyjyqk;
    }

    public void setQyjyqk(String qyjyqk) {
        this.qyjyqk = qyjyqk;
    }

    @Basic
    @Column(name = "ZYXSQY")
    public String getZyxsqy() {
        return zyxsqy;
    }

    public void setZyxsqy(String zyxsqy) {
        this.zyxsqy = zyxsqy;
    }

    @Basic
    @Column(name = "CJSHBXQK")
    public String getCjshbxqk() {
        return cjshbxqk;
    }

    public void setCjshbxqk(String cjshbxqk) {
        this.cjshbxqk = cjshbxqk;
    }

    @Basic
    @Column(name = "SHGY")
    public String getShgy() {
        return shgy;
    }

    public void setShgy(String shgy) {
        this.shgy = shgy;
    }

    @Basic
    @Column(name = "NSXYJB")
    public String getNsxyjb() {
        return nsxyjb;
    }

    public void setNsxyjb(String nsxyjb) {
        this.nsxyjb = nsxyjb;
    }

    @Basic
    @Column(name = "QYJSCX")
    public String getQyjscx() {
        return qyjscx;
    }

    public void setQyjscx(String qyjscx) {
        this.qyjscx = qyjscx;
    }

    @Basic
    @Column(name = "QYDBR")
    public String getQydbr() {
        return qydbr;
    }

    public void setQydbr(String qydbr) {
        this.qydbr = qydbr;
    }

    @Basic
    @Column(name = "SHMC")
    public String getShmc() {
        return shmc;
    }

    public void setShmc(String shmc) {
        this.shmc = shmc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TCompanyExport that = (TCompanyExport) o;
        return Objects.equals(qyid, that.qyid) &&
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
                Objects.equals(dzyx, that.dzyx) &&
                Objects.equals(qytxdz, that.qytxdz) &&
                Objects.equals(sfbrzwgxjsqy, that.sfbrzwgxjsqy) &&
                Objects.equals(rzbm, that.rzbm) &&
                Objects.equals(zyyw, that.zyyw) &&
                Objects.equals(zycpyfw, that.zycpyfw) &&
                Objects.equals(qytctd, that.qytctd) &&
                Objects.equals(sfjldzz, that.sfjldzz) &&
                Objects.equals(dzzjg, that.dzzjg) &&
                Objects.equals(dzzclsj, that.dzzclsj) &&
                Objects.equals(tyrs, that.tyrs) &&
                Objects.equals(twsjxm, that.twsjxm) &&
                Objects.equals(sfjlghzz, that.sfjlghzz) &&
                Objects.equals(ghhyrs, that.ghhyrs) &&
                Objects.equals(zzgsbl, that.zzgsbl) &&
                Objects.equals(ghzxxm, that.ghzxxm) &&
                Objects.equals(ghclsj, that.ghclsj) &&
                Objects.equals(sfynsxyjb, that.sfynsxyjb) &&
                Objects.equals(zgzrs, that.zgzrs) &&
                Objects.equals(zgldhtqdl, that.zgldhtqdl) &&
                Objects.equals(qyfrxm, that.qyfrxm) &&
                Objects.equals(frzw, that.frzw) &&
                Objects.equals(frdh, that.frdh) &&
                Objects.equals(frsj, that.frsj) &&
                Objects.equals(tyshxydm, that.tyshxydm) &&
                Objects.equals(ssgslmc, that.ssgslmc) &&
                Objects.equals(lxrxx, that.lxrxx) &&
                Objects.equals(qyzczj, that.qyzczj) &&
                Objects.equals(qyjbqqkjj, that.qyjbqqkjj) &&
                Objects.equals(hydwhyx, that.hydwhyx) &&
                Objects.equals(qyjyqk, that.qyjyqk) &&
                Objects.equals(zyxsqy, that.zyxsqy) &&
                Objects.equals(cjshbxqk, that.cjshbxqk) &&
                Objects.equals(shgy, that.shgy) &&
                Objects.equals(nsxyjb, that.nsxyjb) &&
                Objects.equals(qyjscx, that.qyjscx) &&
                Objects.equals(qydbr, that.qydbr) &&
                Objects.equals(shmc, that.shmc);
    }

    @Override
    public int hashCode() {

        return Objects.hash(qyid, qygsdjmc, gsdjzclx, qyszxzqy, qydmlx, qydmh, hyfl, qygm, clsj, qyshbxdjh, qywz, dzyx, qytxdz, sfbrzwgxjsqy, rzbm, zyyw, zycpyfw, qytctd, sfjldzz, dzzjg, dzzclsj, tyrs, twsjxm, sfjlghzz, ghhyrs, zzgsbl, ghzxxm, ghclsj, sfynsxyjb, zgzrs, zgldhtqdl, qyfrxm, frzw, frdh, frsj, tyshxydm, ssgslmc, lxrxx, qyzczj, qyjbqqkjj, hydwhyx, qyjyqk, zyxsqy, cjshbxqk, shgy, nsxyjb, qyjscx, qydbr, shmc);
    }
}
