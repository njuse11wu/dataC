package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_CHAMBER_LNHZXX", schema = "MEMBER", catalog = "")
public class TChamberLnhzxx {
    private long id;
    private String shid;
    private String xm;
    private Time rzksrq;
    private Time rzjsrq;
    private String dw;
    private String zw;
    private String sflb;

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
    @Column(name = "XM")
    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    @Basic
    @Column(name = "RZKSRQ")
    public Time getRzksrq() {
        return rzksrq;
    }

    public void setRzksrq(Time rzksrq) {
        this.rzksrq = rzksrq;
    }

    @Basic
    @Column(name = "RZJSRQ")
    public Time getRzjsrq() {
        return rzjsrq;
    }

    public void setRzjsrq(Time rzjsrq) {
        this.rzjsrq = rzjsrq;
    }

    @Basic
    @Column(name = "DW")
    public String getDw() {
        return dw;
    }

    public void setDw(String dw) {
        this.dw = dw;
    }

    @Basic
    @Column(name = "ZW")
    public String getZw() {
        return zw;
    }

    public void setZw(String zw) {
        this.zw = zw;
    }

    @Basic
    @Column(name = "SFLB")
    public String getSflb() {
        return sflb;
    }

    public void setSflb(String sflb) {
        this.sflb = sflb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TChamberLnhzxx that = (TChamberLnhzxx) o;
        return id == that.id &&
                Objects.equals(shid, that.shid) &&
                Objects.equals(xm, that.xm) &&
                Objects.equals(rzksrq, that.rzksrq) &&
                Objects.equals(rzjsrq, that.rzjsrq) &&
                Objects.equals(dw, that.dw) &&
                Objects.equals(zw, that.zw) &&
                Objects.equals(sflb, that.sflb);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, shid, xm, rzksrq, rzjsrq, dw, zw, sflb);
    }
}
