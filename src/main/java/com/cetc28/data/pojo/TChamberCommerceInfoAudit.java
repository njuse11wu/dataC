package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_CHAMBER_COMMERCE_INFO_AUDIT", schema = "MEMBER", catalog = "")
public class TChamberCommerceInfoAudit {
    private long id;
    private String shid;
    private String shjg;
    private Time shsj;
    private String yhid;
    private String shzt;
    private Time shpz;
    private Time sqsj;
    private String rhshjgmc;
    private String rhshpz;
    private String shrxm;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "SHID")
    public String getShid() {
        return shid;
    }

    public void setShid(String shid) {
        this.shid = shid;
    }

    @Basic
    @Column(name = "SHJG")
    public String getShjg() {
        return shjg;
    }

    public void setShjg(String shjg) {
        this.shjg = shjg;
    }

    @Basic
    @Column(name = "SHSJ")
    public Time getShsj() {
        return shsj;
    }

    public void setShsj(Time shsj) {
        this.shsj = shsj;
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
    @Column(name = "SHZT")
    public String getShzt() {
        return shzt;
    }

    public void setShzt(String shzt) {
        this.shzt = shzt;
    }

    @Basic
    @Column(name = "SHPZ")
    public Time getShpz() {
        return shpz;
    }

    public void setShpz(Time shpz) {
        this.shpz = shpz;
    }

    @Basic
    @Column(name = "SQSJ")
    public Time getSqsj() {
        return sqsj;
    }

    public void setSqsj(Time sqsj) {
        this.sqsj = sqsj;
    }

    @Basic
    @Column(name = "RHSHJGMC")
    public String getRhshjgmc() {
        return rhshjgmc;
    }

    public void setRhshjgmc(String rhshjgmc) {
        this.rhshjgmc = rhshjgmc;
    }

    @Basic
    @Column(name = "RHSHPZ")
    public String getRhshpz() {
        return rhshpz;
    }

    public void setRhshpz(String rhshpz) {
        this.rhshpz = rhshpz;
    }

    @Basic
    @Column(name = "SHRXM")
    public String getShrxm() {
        return shrxm;
    }

    public void setShrxm(String shrxm) {
        this.shrxm = shrxm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TChamberCommerceInfoAudit that = (TChamberCommerceInfoAudit) o;
        return id == that.id &&
                Objects.equals(shid, that.shid) &&
                Objects.equals(shjg, that.shjg) &&
                Objects.equals(shsj, that.shsj) &&
                Objects.equals(yhid, that.yhid) &&
                Objects.equals(shzt, that.shzt) &&
                Objects.equals(shpz, that.shpz) &&
                Objects.equals(sqsj, that.sqsj) &&
                Objects.equals(rhshjgmc, that.rhshjgmc) &&
                Objects.equals(rhshpz, that.rhshpz) &&
                Objects.equals(shrxm, that.shrxm);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, shid, shjg, shsj, yhid, shzt, shpz, sqsj, rhshjgmc, rhshpz, shrxm);
    }
}
