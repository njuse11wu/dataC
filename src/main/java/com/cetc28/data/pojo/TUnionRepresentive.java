package com.cetc28.data.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T_UNION_REPRESENTIVE", schema = "MEMBER", catalog = "")
public class TUnionRepresentive {
    private long id;
    private String ttid;
    private String ryid;
    private String zzid;
    private String zzmc;

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
    @Column(name = "RYID")
    public String getRyid() {
        return ryid;
    }

    public void setRyid(String ryid) {
        this.ryid = ryid;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TUnionRepresentive that = (TUnionRepresentive) o;
        return id == that.id &&
                Objects.equals(ttid, that.ttid) &&
                Objects.equals(ryid, that.ryid) &&
                Objects.equals(zzid, that.zzid) &&
                Objects.equals(zzmc, that.zzmc);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, ttid, ryid, zzid, zzmc);
    }
}
