package com.cetc28.data.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T_FIC_LEADER", schema = "MEMBER", catalog = "")
public class TFicLeader {
    private String zzid;
    private String gslldsfbm;
    private String ldlxbm;
    private String ryid;
    private String ldxm;
    private long id;
    private String lrnf;

    @Basic
    @Column(name = "ZZID")
    public String getZzid() {
        return zzid;
    }

    public void setZzid(String zzid) {
        this.zzid = zzid;
    }

    @Basic
    @Column(name = "GSLLDSFBM")
    public String getGslldsfbm() {
        return gslldsfbm;
    }

    public void setGslldsfbm(String gslldsfbm) {
        this.gslldsfbm = gslldsfbm;
    }

    @Basic
    @Column(name = "LDLXBM")
    public String getLdlxbm() {
        return ldlxbm;
    }

    public void setLdlxbm(String ldlxbm) {
        this.ldlxbm = ldlxbm;
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
    @Column(name = "LDXM")
    public String getLdxm() {
        return ldxm;
    }

    public void setLdxm(String ldxm) {
        this.ldxm = ldxm;
    }

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "LRNF")
    public String getLrnf() {
        return lrnf;
    }

    public void setLrnf(String lrnf) {
        this.lrnf = lrnf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TFicLeader that = (TFicLeader) o;
        return id == that.id &&
                Objects.equals(zzid, that.zzid) &&
                Objects.equals(gslldsfbm, that.gslldsfbm) &&
                Objects.equals(ldlxbm, that.ldlxbm) &&
                Objects.equals(ryid, that.ryid) &&
                Objects.equals(ldxm, that.ldxm) &&
                Objects.equals(lrnf, that.lrnf);
    }

    @Override
    public int hashCode() {

        return Objects.hash(zzid, gslldsfbm, ldlxbm, ryid, ldxm, id, lrnf);
    }
}
