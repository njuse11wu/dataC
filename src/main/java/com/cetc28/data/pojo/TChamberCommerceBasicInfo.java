package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_CHAMBER_COMMERCE_BASIC_INFO", schema = "MEMBER", catalog = "")
public class TChamberCommerceBasicInfo {
    private String shid;
    private String shmc;
    private String shbm;
    private String shlx;
    private String sfzmzbmdj;
    private String sfjldzz;
    private Long hys;
    private Long lss;
    private Long fhzs;
    private Long mscgzrys;
    private String bgdh;
    private String cz;
    private String shyx;
    private String sfqlzssh;
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
    private String yhid;
    private String sfshsh;
    private String xzjb;
    private String sheng;
    private String shi;
    private String xian;
    private Time clsj;
    private String ttfr;
    private String stfrzshm;
    private String stzzjgdmzhm;
    private String stlxr;
    private String sjhm;
    private String mzbmwdjyy;
    private Time dzzjlsj;
    private String dzzsj;
    private Long dysl;
    private String dzzwjlyy;
    private Time djsj;
    private String dataId;
    private String mhzzid;
    private String djgrdh;
    private String zzjln;
    private String dz;
    private String yb;
    private String wz;
    private Long px;
    private String js;
    private String wwyhmhzzid;
    private Long sxbz;

    @Id
    @Column(name = "SHID")
    public String getShid() {
        return shid;
    }

    public void setShid(String shid) {
        this.shid = shid;
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
    @Column(name = "SHBM")
    public String getShbm() {
        return shbm;
    }

    public void setShbm(String shbm) {
        this.shbm = shbm;
    }

    @Basic
    @Column(name = "SHLX")
    public String getShlx() {
        return shlx;
    }

    public void setShlx(String shlx) {
        this.shlx = shlx;
    }

    @Basic
    @Column(name = "SFZMZBMDJ")
    public String getSfzmzbmdj() {
        return sfzmzbmdj;
    }

    public void setSfzmzbmdj(String sfzmzbmdj) {
        this.sfzmzbmdj = sfzmzbmdj;
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
    @Column(name = "HYS")
    public Long getHys() {
        return hys;
    }

    public void setHys(Long hys) {
        this.hys = hys;
    }

    @Basic
    @Column(name = "LSS")
    public Long getLss() {
        return lss;
    }

    public void setLss(Long lss) {
        this.lss = lss;
    }

    @Basic
    @Column(name = "FHZS")
    public Long getFhzs() {
        return fhzs;
    }

    public void setFhzs(Long fhzs) {
        this.fhzs = fhzs;
    }

    @Basic
    @Column(name = "MSCGZRYS")
    public Long getMscgzrys() {
        return mscgzrys;
    }

    public void setMscgzrys(Long mscgzrys) {
        this.mscgzrys = mscgzrys;
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
    @Column(name = "CZ")
    public String getCz() {
        return cz;
    }

    public void setCz(String cz) {
        this.cz = cz;
    }

    @Basic
    @Column(name = "SHYX")
    public String getShyx() {
        return shyx;
    }

    public void setShyx(String shyx) {
        this.shyx = shyx;
    }

    @Basic
    @Column(name = "SFQLZSSH")
    public String getSfqlzssh() {
        return sfqlzssh;
    }

    public void setSfqlzssh(String sfqlzssh) {
        this.sfqlzssh = sfqlzssh;
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
    @Column(name = "YHID")
    public String getYhid() {
        return yhid;
    }

    public void setYhid(String yhid) {
        this.yhid = yhid;
    }

    @Basic
    @Column(name = "SFSHSH")
    public String getSfshsh() {
        return sfshsh;
    }

    public void setSfshsh(String sfshsh) {
        this.sfshsh = sfshsh;
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
    @Column(name = "CLSJ")
    public Time getClsj() {
        return clsj;
    }

    public void setClsj(Time clsj) {
        this.clsj = clsj;
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
    @Column(name = "STFRZSHM")
    public String getStfrzshm() {
        return stfrzshm;
    }

    public void setStfrzshm(String stfrzshm) {
        this.stfrzshm = stfrzshm;
    }

    @Basic
    @Column(name = "STZZJGDMZHM")
    public String getStzzjgdmzhm() {
        return stzzjgdmzhm;
    }

    public void setStzzjgdmzhm(String stzzjgdmzhm) {
        this.stzzjgdmzhm = stzzjgdmzhm;
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
    @Column(name = "SJHM")
    public String getSjhm() {
        return sjhm;
    }

    public void setSjhm(String sjhm) {
        this.sjhm = sjhm;
    }

    @Basic
    @Column(name = "MZBMWDJYY")
    public String getMzbmwdjyy() {
        return mzbmwdjyy;
    }

    public void setMzbmwdjyy(String mzbmwdjyy) {
        this.mzbmwdjyy = mzbmwdjyy;
    }

    @Basic
    @Column(name = "DZZJLSJ")
    public Time getDzzjlsj() {
        return dzzjlsj;
    }

    public void setDzzjlsj(Time dzzjlsj) {
        this.dzzjlsj = dzzjlsj;
    }

    @Basic
    @Column(name = "DZZSJ")
    public String getDzzsj() {
        return dzzsj;
    }

    public void setDzzsj(String dzzsj) {
        this.dzzsj = dzzsj;
    }

    @Basic
    @Column(name = "DYSL")
    public Long getDysl() {
        return dysl;
    }

    public void setDysl(Long dysl) {
        this.dysl = dysl;
    }

    @Basic
    @Column(name = "DZZWJLYY")
    public String getDzzwjlyy() {
        return dzzwjlyy;
    }

    public void setDzzwjlyy(String dzzwjlyy) {
        this.dzzwjlyy = dzzwjlyy;
    }

    @Basic
    @Column(name = "DJSJ")
    public Time getDjsj() {
        return djsj;
    }

    public void setDjsj(Time djsj) {
        this.djsj = djsj;
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
    @Column(name = "DJGRDH")
    public String getDjgrdh() {
        return djgrdh;
    }

    public void setDjgrdh(String djgrdh) {
        this.djgrdh = djgrdh;
    }

    @Basic
    @Column(name = "ZZJLN")
    public String getZzjln() {
        return zzjln;
    }

    public void setZzjln(String zzjln) {
        this.zzjln = zzjln;
    }

    @Basic
    @Column(name = "DZ")
    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz;
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
    @Column(name = "WZ")
    public String getWz() {
        return wz;
    }

    public void setWz(String wz) {
        this.wz = wz;
    }

    @Basic
    @Column(name = "PX")
    public Long getPx() {
        return px;
    }

    public void setPx(Long px) {
        this.px = px;
    }

    @Basic
    @Column(name = "JS")
    public String getJs() {
        return js;
    }

    public void setJs(String js) {
        this.js = js;
    }

    @Basic
    @Column(name = "WWYHMHZZID")
    public String getWwyhmhzzid() {
        return wwyhmhzzid;
    }

    public void setWwyhmhzzid(String wwyhmhzzid) {
        this.wwyhmhzzid = wwyhmhzzid;
    }

    @Basic
    @Column(name = "SXBZ")
    public Long getSxbz() {
        return sxbz;
    }

    public void setSxbz(Long sxbz) {
        this.sxbz = sxbz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TChamberCommerceBasicInfo that = (TChamberCommerceBasicInfo) o;
        return Objects.equals(shid, that.shid) &&
                Objects.equals(shmc, that.shmc) &&
                Objects.equals(shbm, that.shbm) &&
                Objects.equals(shlx, that.shlx) &&
                Objects.equals(sfzmzbmdj, that.sfzmzbmdj) &&
                Objects.equals(sfjldzz, that.sfjldzz) &&
                Objects.equals(hys, that.hys) &&
                Objects.equals(lss, that.lss) &&
                Objects.equals(fhzs, that.fhzs) &&
                Objects.equals(mscgzrys, that.mscgzrys) &&
                Objects.equals(bgdh, that.bgdh) &&
                Objects.equals(cz, that.cz) &&
                Objects.equals(shyx, that.shyx) &&
                Objects.equals(sfqlzssh, that.sfqlzssh) &&
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
                Objects.equals(yhid, that.yhid) &&
                Objects.equals(sfshsh, that.sfshsh) &&
                Objects.equals(xzjb, that.xzjb) &&
                Objects.equals(sheng, that.sheng) &&
                Objects.equals(shi, that.shi) &&
                Objects.equals(xian, that.xian) &&
                Objects.equals(clsj, that.clsj) &&
                Objects.equals(ttfr, that.ttfr) &&
                Objects.equals(stfrzshm, that.stfrzshm) &&
                Objects.equals(stzzjgdmzhm, that.stzzjgdmzhm) &&
                Objects.equals(stlxr, that.stlxr) &&
                Objects.equals(sjhm, that.sjhm) &&
                Objects.equals(mzbmwdjyy, that.mzbmwdjyy) &&
                Objects.equals(dzzjlsj, that.dzzjlsj) &&
                Objects.equals(dzzsj, that.dzzsj) &&
                Objects.equals(dysl, that.dysl) &&
                Objects.equals(dzzwjlyy, that.dzzwjlyy) &&
                Objects.equals(djsj, that.djsj) &&
                Objects.equals(dataId, that.dataId) &&
                Objects.equals(mhzzid, that.mhzzid) &&
                Objects.equals(djgrdh, that.djgrdh) &&
                Objects.equals(zzjln, that.zzjln) &&
                Objects.equals(dz, that.dz) &&
                Objects.equals(yb, that.yb) &&
                Objects.equals(wz, that.wz) &&
                Objects.equals(px, that.px) &&
                Objects.equals(js, that.js) &&
                Objects.equals(wwyhmhzzid, that.wwyhmhzzid) &&
                Objects.equals(sxbz, that.sxbz);
    }

    @Override
    public int hashCode() {

        return Objects.hash(shid, shmc, shbm, shlx, sfzmzbmdj, sfjldzz, hys, lss, fhzs, mscgzrys, bgdh, cz, shyx, sfqlzssh, cjsj, cjry, cjryxm, cjbm, cjbmmc, gxsj, gxry, gxryxm, gxbm, gxbmmc, yhid, sfshsh, xzjb, sheng, shi, xian, clsj, ttfr, stfrzshm, stzzjgdmzhm, stlxr, sjhm, mzbmwdjyy, dzzjlsj, dzzsj, dysl, dzzwjlyy, djsj, dataId, mhzzid, djgrdh, zzjln, dz, yb, wz, px, js, wwyhmhzzid, sxbz);
    }
}
