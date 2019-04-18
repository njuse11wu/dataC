package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_UNION_CHANGE_STATE", schema = "MEMBER", catalog = "")
public class TUnionChangeState {
    private long id;
    private String ttid;
    private Time gxsj;
    private String gxry;
    private String gxryxm;
    private String gxbm;
    private String gxbmmc;
    private String zzid;
    private String zzmc;
    private String gxly;
    private Long gxtype;
    private String shid;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TTID")
    public String getTtid() {
        return ttid;
    }

    public void setTtid(String ttid) {
        this.ttid = ttid;
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
    @Column(name = "ZZID")
    public String getZzid() {
        return zzid;
    }

    public void setZzid(String zzid) {
        this.zzid = zzid;
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
    @Column(name = "GXLY")
    public String getGxly() {
        return gxly;
    }

    public void setGxly(String gxly) {
        this.gxly = gxly;
    }

    @Basic
    @Column(name = "GXTYPE")
    public Long getGxtype() {
        return gxtype;
    }

    public void setGxtype(Long gxtype) {
        this.gxtype = gxtype;
    }

    @Basic
    @Column(name = "SHID")
    public String getShid() {
        return shid;
    }

    public void setShid(String shid) {
        this.shid = shid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TUnionChangeState that = (TUnionChangeState) o;
        return id == that.id &&
                Objects.equals(ttid, that.ttid) &&
                Objects.equals(gxsj, that.gxsj) &&
                Objects.equals(gxry, that.gxry) &&
                Objects.equals(gxryxm, that.gxryxm) &&
                Objects.equals(gxbm, that.gxbm) &&
                Objects.equals(gxbmmc, that.gxbmmc) &&
                Objects.equals(zzid, that.zzid) &&
                Objects.equals(zzmc, that.zzmc) &&
                Objects.equals(gxly, that.gxly) &&
                Objects.equals(gxtype, that.gxtype) &&
                Objects.equals(shid, that.shid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, ttid, gxsj, gxry, gxryxm, gxbm, gxbmmc, zzid, zzmc, gxly, gxtype, shid);
    }
}
