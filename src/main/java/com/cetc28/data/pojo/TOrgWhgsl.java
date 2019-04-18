package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_ORG_WHGSL", schema = "MEMBER", catalog = "")
public class TOrgWhgsl {
    private String zzid;
    private long nf;
    private String sfwhgsl;
    private String whgslcllj;
    private Time clscsj;
    private long id;
    private String sfsjwhgsl;
    private String filename;

    @Basic
    @Column(name = "ZZID")
    public String getZzid() {
        return zzid;
    }

    public void setZzid(String zzid) {
        this.zzid = zzid;
    }

    @Basic
    @Column(name = "NF")
    public long getNf() {
        return nf;
    }

    public void setNf(long nf) {
        this.nf = nf;
    }

    @Basic
    @Column(name = "SFWHGSL")
    public String getSfwhgsl() {
        return sfwhgsl;
    }

    public void setSfwhgsl(String sfwhgsl) {
        this.sfwhgsl = sfwhgsl;
    }

    @Basic
    @Column(name = "WHGSLCLLJ")
    public String getWhgslcllj() {
        return whgslcllj;
    }

    public void setWhgslcllj(String whgslcllj) {
        this.whgslcllj = whgslcllj;
    }

    @Basic
    @Column(name = "CLSCSJ")
    public Time getClscsj() {
        return clscsj;
    }

    public void setClscsj(Time clscsj) {
        this.clscsj = clscsj;
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
    @Column(name = "SFSJWHGSL")
    public String getSfsjwhgsl() {
        return sfsjwhgsl;
    }

    public void setSfsjwhgsl(String sfsjwhgsl) {
        this.sfsjwhgsl = sfsjwhgsl;
    }

    @Basic
    @Column(name = "FILENAME")
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TOrgWhgsl tOrgWhgsl = (TOrgWhgsl) o;
        return nf == tOrgWhgsl.nf &&
                id == tOrgWhgsl.id &&
                Objects.equals(zzid, tOrgWhgsl.zzid) &&
                Objects.equals(sfwhgsl, tOrgWhgsl.sfwhgsl) &&
                Objects.equals(whgslcllj, tOrgWhgsl.whgslcllj) &&
                Objects.equals(clscsj, tOrgWhgsl.clscsj) &&
                Objects.equals(sfsjwhgsl, tOrgWhgsl.sfsjwhgsl) &&
                Objects.equals(filename, tOrgWhgsl.filename);
    }

    @Override
    public int hashCode() {

        return Objects.hash(zzid, nf, sfwhgsl, whgslcllj, clscsj, id, sfsjwhgsl, filename);
    }
}
