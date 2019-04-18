package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_COMPANY_FIC_MAP", schema = "MEMBER", catalog = "")
public class TCompanyFicMap {
    private long id;
    private String ssgslbm;
    private String ssgslmc;
    private Time jrsj;
    private String sfhzqy;
    private String zhpjyj;
    private String tjdwyj;
    private Time cjsj;
    private String cjry;
    private String cjryxm;
    private String cjbm;
    private String cjbmmc;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "SSGSLBM")
    public String getSsgslbm() {
        return ssgslbm;
    }

    public void setSsgslbm(String ssgslbm) {
        this.ssgslbm = ssgslbm;
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
    @Column(name = "JRSJ")
    public Time getJrsj() {
        return jrsj;
    }

    public void setJrsj(Time jrsj) {
        this.jrsj = jrsj;
    }

    @Basic
    @Column(name = "SFHZQY")
    public String getSfhzqy() {
        return sfhzqy;
    }

    public void setSfhzqy(String sfhzqy) {
        this.sfhzqy = sfhzqy;
    }

    @Basic
    @Column(name = "ZHPJYJ")
    public String getZhpjyj() {
        return zhpjyj;
    }

    public void setZhpjyj(String zhpjyj) {
        this.zhpjyj = zhpjyj;
    }

    @Basic
    @Column(name = "TJDWYJ")
    public String getTjdwyj() {
        return tjdwyj;
    }

    public void setTjdwyj(String tjdwyj) {
        this.tjdwyj = tjdwyj;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TCompanyFicMap that = (TCompanyFicMap) o;
        return id == that.id &&
                Objects.equals(ssgslbm, that.ssgslbm) &&
                Objects.equals(ssgslmc, that.ssgslmc) &&
                Objects.equals(jrsj, that.jrsj) &&
                Objects.equals(sfhzqy, that.sfhzqy) &&
                Objects.equals(zhpjyj, that.zhpjyj) &&
                Objects.equals(tjdwyj, that.tjdwyj) &&
                Objects.equals(cjsj, that.cjsj) &&
                Objects.equals(cjry, that.cjry) &&
                Objects.equals(cjryxm, that.cjryxm) &&
                Objects.equals(cjbm, that.cjbm) &&
                Objects.equals(cjbmmc, that.cjbmmc);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, ssgslbm, ssgslmc, jrsj, sfhzqy, zhpjyj, tjdwyj, cjsj, cjry, cjryxm, cjbm, cjbmmc);
    }
}
