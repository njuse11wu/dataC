package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_MEM_INFO_AUDIT", schema = "MEMBER", catalog = "")
public class TMemInfoAudit {
    private long id;
    private String shhyid;
    private String shdhylx;
    private String sfyrz;
    private Time rhsqsj;
    private String rhshjg;
    private Time rhshsj;
    private String rhshjig;
    private String rhshr;
    private String rhshpz;
    private String rhshjgmc;
    private String shhydl;
    private String shid;
    private String shmc;
    private String rhshrxm;
    private String tjshzhid;
    private String tjshzhname;
    private String lshtjsh;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "SHHYID")
    public String getShhyid() {
        return shhyid;
    }

    public void setShhyid(String shhyid) {
        this.shhyid = shhyid;
    }

    @Basic
    @Column(name = "SHDHYLX")
    public String getShdhylx() {
        return shdhylx;
    }

    public void setShdhylx(String shdhylx) {
        this.shdhylx = shdhylx;
    }

    @Basic
    @Column(name = "SFYRZ")
    public String getSfyrz() {
        return sfyrz;
    }

    public void setSfyrz(String sfyrz) {
        this.sfyrz = sfyrz;
    }

    @Basic
    @Column(name = "RHSQSJ")
    public Time getRhsqsj() {
        return rhsqsj;
    }

    public void setRhsqsj(Time rhsqsj) {
        this.rhsqsj = rhsqsj;
    }

    @Basic
    @Column(name = "RHSHJG")
    public String getRhshjg() {
        return rhshjg;
    }

    public void setRhshjg(String rhshjg) {
        this.rhshjg = rhshjg;
    }

    @Basic
    @Column(name = "RHSHSJ")
    public Time getRhshsj() {
        return rhshsj;
    }

    public void setRhshsj(Time rhshsj) {
        this.rhshsj = rhshsj;
    }

    @Basic
    @Column(name = "RHSHJIG")
    public String getRhshjig() {
        return rhshjig;
    }

    public void setRhshjig(String rhshjig) {
        this.rhshjig = rhshjig;
    }

    @Basic
    @Column(name = "RHSHR")
    public String getRhshr() {
        return rhshr;
    }

    public void setRhshr(String rhshr) {
        this.rhshr = rhshr;
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
    @Column(name = "RHSHJGMC")
    public String getRhshjgmc() {
        return rhshjgmc;
    }

    public void setRhshjgmc(String rhshjgmc) {
        this.rhshjgmc = rhshjgmc;
    }

    @Basic
    @Column(name = "SHHYDL")
    public String getShhydl() {
        return shhydl;
    }

    public void setShhydl(String shhydl) {
        this.shhydl = shhydl;
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
    @Column(name = "SHMC")
    public String getShmc() {
        return shmc;
    }

    public void setShmc(String shmc) {
        this.shmc = shmc;
    }

    @Basic
    @Column(name = "RHSHRXM")
    public String getRhshrxm() {
        return rhshrxm;
    }

    public void setRhshrxm(String rhshrxm) {
        this.rhshrxm = rhshrxm;
    }

    @Basic
    @Column(name = "TJSHZHID")
    public String getTjshzhid() {
        return tjshzhid;
    }

    public void setTjshzhid(String tjshzhid) {
        this.tjshzhid = tjshzhid;
    }

    @Basic
    @Column(name = "TJSHZHNAME")
    public String getTjshzhname() {
        return tjshzhname;
    }

    public void setTjshzhname(String tjshzhname) {
        this.tjshzhname = tjshzhname;
    }

    @Basic
    @Column(name = "LSHTJSH")
    public String getLshtjsh() {
        return lshtjsh;
    }

    public void setLshtjsh(String lshtjsh) {
        this.lshtjsh = lshtjsh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TMemInfoAudit that = (TMemInfoAudit) o;
        return id == that.id &&
                Objects.equals(shhyid, that.shhyid) &&
                Objects.equals(shdhylx, that.shdhylx) &&
                Objects.equals(sfyrz, that.sfyrz) &&
                Objects.equals(rhsqsj, that.rhsqsj) &&
                Objects.equals(rhshjg, that.rhshjg) &&
                Objects.equals(rhshsj, that.rhshsj) &&
                Objects.equals(rhshjig, that.rhshjig) &&
                Objects.equals(rhshr, that.rhshr) &&
                Objects.equals(rhshpz, that.rhshpz) &&
                Objects.equals(rhshjgmc, that.rhshjgmc) &&
                Objects.equals(shhydl, that.shhydl) &&
                Objects.equals(shid, that.shid) &&
                Objects.equals(shmc, that.shmc) &&
                Objects.equals(rhshrxm, that.rhshrxm) &&
                Objects.equals(tjshzhid, that.tjshzhid) &&
                Objects.equals(tjshzhname, that.tjshzhname) &&
                Objects.equals(lshtjsh, that.lshtjsh);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, shhyid, shdhylx, sfyrz, rhsqsj, rhshjg, rhshsj, rhshjig, rhshr, rhshpz, rhshjgmc, shhydl, shid, shmc, rhshrxm, tjshzhid, tjshzhname, lshtjsh);
    }
}
