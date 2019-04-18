package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_ORG_WORK_SITUATION", schema = "MEMBER", catalog = "")
public class TOrgWorkSituation {
    private long id;
    private String zzid;
    private Time zfrq;
    private String kzdzdgz;
    private String jsczwt;
    private String yjjy;
    private String ztpj;
    private String fzr;
    private String sslx;
    private Time cjsj;
    private String dqzzid;
    private Time gxsj;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "ZFRQ")
    public Time getZfrq() {
        return zfrq;
    }

    public void setZfrq(Time zfrq) {
        this.zfrq = zfrq;
    }

    @Basic
    @Column(name = "KZDZDGZ")
    public String getKzdzdgz() {
        return kzdzdgz;
    }

    public void setKzdzdgz(String kzdzdgz) {
        this.kzdzdgz = kzdzdgz;
    }

    @Basic
    @Column(name = "JSCZWT")
    public String getJsczwt() {
        return jsczwt;
    }

    public void setJsczwt(String jsczwt) {
        this.jsczwt = jsczwt;
    }

    @Basic
    @Column(name = "YJJY")
    public String getYjjy() {
        return yjjy;
    }

    public void setYjjy(String yjjy) {
        this.yjjy = yjjy;
    }

    @Basic
    @Column(name = "ZTPJ")
    public String getZtpj() {
        return ztpj;
    }

    public void setZtpj(String ztpj) {
        this.ztpj = ztpj;
    }

    @Basic
    @Column(name = "FZR")
    public String getFzr() {
        return fzr;
    }

    public void setFzr(String fzr) {
        this.fzr = fzr;
    }

    @Basic
    @Column(name = "SSLX")
    public String getSslx() {
        return sslx;
    }

    public void setSslx(String sslx) {
        this.sslx = sslx;
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
    @Column(name = "DQZZID")
    public String getDqzzid() {
        return dqzzid;
    }

    public void setDqzzid(String dqzzid) {
        this.dqzzid = dqzzid;
    }

    @Basic
    @Column(name = "GXSJ")
    public Time getGxsj() {
        return gxsj;
    }

    public void setGxsj(Time gxsj) {
        this.gxsj = gxsj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TOrgWorkSituation that = (TOrgWorkSituation) o;
        return id == that.id &&
                Objects.equals(zzid, that.zzid) &&
                Objects.equals(zfrq, that.zfrq) &&
                Objects.equals(kzdzdgz, that.kzdzdgz) &&
                Objects.equals(jsczwt, that.jsczwt) &&
                Objects.equals(yjjy, that.yjjy) &&
                Objects.equals(ztpj, that.ztpj) &&
                Objects.equals(fzr, that.fzr) &&
                Objects.equals(sslx, that.sslx) &&
                Objects.equals(cjsj, that.cjsj) &&
                Objects.equals(dqzzid, that.dqzzid) &&
                Objects.equals(gxsj, that.gxsj);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, zzid, zfrq, kzdzdgz, jsczwt, yjjy, ztpj, fzr, sslx, cjsj, dqzzid, gxsj);
    }
}
