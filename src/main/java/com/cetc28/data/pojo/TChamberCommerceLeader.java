package com.cetc28.data.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T_CHAMBER_COMMERCE_LEADER", schema = "MEMBER", catalog = "")
public class TChamberCommerceLeader {
    private long id;
    private String shid;
    private String ryid;
    private String shldsfbm;
    private String shbm;
    private String sfzz;
    private String qyid;
    private String ldxm;
    private String lslx;

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
    @Column(name = "RYID")
    public String getRyid() {
        return ryid;
    }

    public void setRyid(String ryid) {
        this.ryid = ryid;
    }

    @Basic
    @Column(name = "SHLDSFBM")
    public String getShldsfbm() {
        return shldsfbm;
    }

    public void setShldsfbm(String shldsfbm) {
        this.shldsfbm = shldsfbm;
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
    @Column(name = "SFZZ")
    public String getSfzz() {
        return sfzz;
    }

    public void setSfzz(String sfzz) {
        this.sfzz = sfzz;
    }

    @Basic
    @Column(name = "QYID")
    public String getQyid() {
        return qyid;
    }

    public void setQyid(String qyid) {
        this.qyid = qyid;
    }

    @Basic
    @Column(name = "LDXM")
    public String getLdxm() {
        return ldxm;
    }

    public void setLdxm(String ldxm) {
        this.ldxm = ldxm;
    }

    @Basic
    @Column(name = "LSLX")
    public String getLslx() {
        return lslx;
    }

    public void setLslx(String lslx) {
        this.lslx = lslx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TChamberCommerceLeader that = (TChamberCommerceLeader) o;
        return id == that.id &&
                Objects.equals(shid, that.shid) &&
                Objects.equals(ryid, that.ryid) &&
                Objects.equals(shldsfbm, that.shldsfbm) &&
                Objects.equals(shbm, that.shbm) &&
                Objects.equals(sfzz, that.sfzz) &&
                Objects.equals(qyid, that.qyid) &&
                Objects.equals(ldxm, that.ldxm) &&
                Objects.equals(lslx, that.lslx);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, shid, ryid, shldsfbm, shbm, sfzz, qyid, ldxm, lslx);
    }
}
