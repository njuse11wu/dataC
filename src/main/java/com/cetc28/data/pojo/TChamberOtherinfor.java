package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_CHAMBER_OTHERINFOR", schema = "MEMBER", catalog = "")
public class TChamberOtherinfor {
    private String shid;
    private String nd;
    private String gjsh;
    private String sjsh;
    private String shijsh;
    private String xjsh;
    private String njcllj;
    private Time njclscsj;
    private String tjcllj;
    private Time tjclscsj;
    private String qggslyxzhsh;
    private String tjfilename;
    private String njfilename;

    @Id
    @Column(name = "SHID")
    public String getShid() {
        return shid;
    }

    public void setShid(String shid) {
        this.shid = shid;
    }

    @Basic
    @Column(name = "ND")
    public String getNd() {
        return nd;
    }

    public void setNd(String nd) {
        this.nd = nd;
    }

    @Basic
    @Column(name = "GJSH")
    public String getGjsh() {
        return gjsh;
    }

    public void setGjsh(String gjsh) {
        this.gjsh = gjsh;
    }

    @Basic
    @Column(name = "SJSH")
    public String getSjsh() {
        return sjsh;
    }

    public void setSjsh(String sjsh) {
        this.sjsh = sjsh;
    }

    @Basic
    @Column(name = "SHIJSH")
    public String getShijsh() {
        return shijsh;
    }

    public void setShijsh(String shijsh) {
        this.shijsh = shijsh;
    }

    @Basic
    @Column(name = "XJSH")
    public String getXjsh() {
        return xjsh;
    }

    public void setXjsh(String xjsh) {
        this.xjsh = xjsh;
    }

    @Basic
    @Column(name = "NJCLLJ")
    public String getNjcllj() {
        return njcllj;
    }

    public void setNjcllj(String njcllj) {
        this.njcllj = njcllj;
    }

    @Basic
    @Column(name = "NJCLSCSJ")
    public Time getNjclscsj() {
        return njclscsj;
    }

    public void setNjclscsj(Time njclscsj) {
        this.njclscsj = njclscsj;
    }

    @Basic
    @Column(name = "TJCLLJ")
    public String getTjcllj() {
        return tjcllj;
    }

    public void setTjcllj(String tjcllj) {
        this.tjcllj = tjcllj;
    }

    @Basic
    @Column(name = "TJCLSCSJ")
    public Time getTjclscsj() {
        return tjclscsj;
    }

    public void setTjclscsj(Time tjclscsj) {
        this.tjclscsj = tjclscsj;
    }

    @Basic
    @Column(name = "QGGSLYXZHSH")
    public String getQggslyxzhsh() {
        return qggslyxzhsh;
    }

    public void setQggslyxzhsh(String qggslyxzhsh) {
        this.qggslyxzhsh = qggslyxzhsh;
    }

    @Basic
    @Column(name = "TJFILENAME")
    public String getTjfilename() {
        return tjfilename;
    }

    public void setTjfilename(String tjfilename) {
        this.tjfilename = tjfilename;
    }

    @Basic
    @Column(name = "NJFILENAME")
    public String getNjfilename() {
        return njfilename;
    }

    public void setNjfilename(String njfilename) {
        this.njfilename = njfilename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TChamberOtherinfor that = (TChamberOtherinfor) o;
        return Objects.equals(shid, that.shid) &&
                Objects.equals(nd, that.nd) &&
                Objects.equals(gjsh, that.gjsh) &&
                Objects.equals(sjsh, that.sjsh) &&
                Objects.equals(shijsh, that.shijsh) &&
                Objects.equals(xjsh, that.xjsh) &&
                Objects.equals(njcllj, that.njcllj) &&
                Objects.equals(njclscsj, that.njclscsj) &&
                Objects.equals(tjcllj, that.tjcllj) &&
                Objects.equals(tjclscsj, that.tjclscsj) &&
                Objects.equals(qggslyxzhsh, that.qggslyxzhsh) &&
                Objects.equals(tjfilename, that.tjfilename) &&
                Objects.equals(njfilename, that.njfilename);
    }

    @Override
    public int hashCode() {

        return Objects.hash(shid, nd, gjsh, sjsh, shijsh, xjsh, njcllj, njclscsj, tjcllj, tjclscsj, qggslyxzhsh, tjfilename, njfilename);
    }
}
