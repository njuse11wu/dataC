package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_COMPANY_SOCIETY_PUB_HIS", schema = "MEMBER", catalog = "")
public class TCompanySocietyPubHis {
    private long id;
    private String qyid;
    private String sj;
    private String cydw;
    private String szdx;
    private String jzxm;
    private Long sjjkje;
    private String sjjw;
    private Time cjsj;
    private String cjry;
    private String cjryxm;
    private String cjbmmc;
    private Time gxsj;
    private String gxry;
    private String gxryxm;
    private String gxbm;
    private String gxbmmc;
    private String cjbm;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "SJ")
    public String getSj() {
        return sj;
    }

    public void setSj(String sj) {
        this.sj = sj;
    }

    @Basic
    @Column(name = "CYDW")
    public String getCydw() {
        return cydw;
    }

    public void setCydw(String cydw) {
        this.cydw = cydw;
    }

    @Basic
    @Column(name = "SZDX")
    public String getSzdx() {
        return szdx;
    }

    public void setSzdx(String szdx) {
        this.szdx = szdx;
    }

    @Basic
    @Column(name = "JZXM")
    public String getJzxm() {
        return jzxm;
    }

    public void setJzxm(String jzxm) {
        this.jzxm = jzxm;
    }

    @Basic
    @Column(name = "SJJKJE")
    public Long getSjjkje() {
        return sjjkje;
    }

    public void setSjjkje(Long sjjkje) {
        this.sjjkje = sjjkje;
    }

    @Basic
    @Column(name = "SJJW")
    public String getSjjw() {
        return sjjw;
    }

    public void setSjjw(String sjjw) {
        this.sjjw = sjjw;
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
    @Column(name = "CJBM")
    public String getCjbm() {
        return cjbm;
    }

    public void setCjbm(String cjbm) {
        this.cjbm = cjbm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TCompanySocietyPubHis that = (TCompanySocietyPubHis) o;
        return id == that.id &&
                Objects.equals(qyid, that.qyid) &&
                Objects.equals(sj, that.sj) &&
                Objects.equals(cydw, that.cydw) &&
                Objects.equals(szdx, that.szdx) &&
                Objects.equals(jzxm, that.jzxm) &&
                Objects.equals(sjjkje, that.sjjkje) &&
                Objects.equals(sjjw, that.sjjw) &&
                Objects.equals(cjsj, that.cjsj) &&
                Objects.equals(cjry, that.cjry) &&
                Objects.equals(cjryxm, that.cjryxm) &&
                Objects.equals(cjbmmc, that.cjbmmc) &&
                Objects.equals(gxsj, that.gxsj) &&
                Objects.equals(gxry, that.gxry) &&
                Objects.equals(gxryxm, that.gxryxm) &&
                Objects.equals(gxbm, that.gxbm) &&
                Objects.equals(gxbmmc, that.gxbmmc) &&
                Objects.equals(cjbm, that.cjbm);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, qyid, sj, cydw, szdx, jzxm, sjjkje, sjjw, cjsj, cjry, cjryxm, cjbmmc, gxsj, gxry, gxryxm, gxbm, gxbmmc, cjbm);
    }
}
