package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_PERSON_CHANGE_STATE", schema = "MEMBER", catalog = "")
public class TPersonChangeState {
    private long id;
    private String ryid;
    private Time gxsj;
    private String gxry;
    private String gxryxm;
    private String gxbm;
    private String gxbmmc;
    private String zzid;
    private String zzmc;
    private String f1;
    private String f2;
    private String f3;
    private String f4;
    private String f5;
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
    @Column(name = "RYID")
    public String getRyid() {
        return ryid;
    }

    public void setRyid(String ryid) {
        this.ryid = ryid;
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
    @Column(name = "F1")
    public String getF1() {
        return f1;
    }

    public void setF1(String f1) {
        this.f1 = f1;
    }

    @Basic
    @Column(name = "F2")
    public String getF2() {
        return f2;
    }

    public void setF2(String f2) {
        this.f2 = f2;
    }

    @Basic
    @Column(name = "F3")
    public String getF3() {
        return f3;
    }

    public void setF3(String f3) {
        this.f3 = f3;
    }

    @Basic
    @Column(name = "F4")
    public String getF4() {
        return f4;
    }

    public void setF4(String f4) {
        this.f4 = f4;
    }

    @Basic
    @Column(name = "F5")
    public String getF5() {
        return f5;
    }

    public void setF5(String f5) {
        this.f5 = f5;
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
        TPersonChangeState that = (TPersonChangeState) o;
        return id == that.id &&
                Objects.equals(ryid, that.ryid) &&
                Objects.equals(gxsj, that.gxsj) &&
                Objects.equals(gxry, that.gxry) &&
                Objects.equals(gxryxm, that.gxryxm) &&
                Objects.equals(gxbm, that.gxbm) &&
                Objects.equals(gxbmmc, that.gxbmmc) &&
                Objects.equals(zzid, that.zzid) &&
                Objects.equals(zzmc, that.zzmc) &&
                Objects.equals(f1, that.f1) &&
                Objects.equals(f2, that.f2) &&
                Objects.equals(f3, that.f3) &&
                Objects.equals(f4, that.f4) &&
                Objects.equals(f5, that.f5) &&
                Objects.equals(gxly, that.gxly) &&
                Objects.equals(gxtype, that.gxtype) &&
                Objects.equals(shid, that.shid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, ryid, gxsj, gxry, gxryxm, gxbm, gxbmmc, zzid, zzmc, f1, f2, f3, f4, f5, gxly, gxtype, shid);
    }
}
