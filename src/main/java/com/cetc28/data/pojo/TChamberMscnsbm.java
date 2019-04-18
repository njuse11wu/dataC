package com.cetc28.data.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T_CHAMBER_MSCNSBM", schema = "MEMBER", catalog = "")
public class TChamberMscnsbm {
    private long id;
    private String shid;
    private String mscnsbmmc;

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
    @Column(name = "MSCNSBMMC")
    public String getMscnsbmmc() {
        return mscnsbmmc;
    }

    public void setMscnsbmmc(String mscnsbmmc) {
        this.mscnsbmmc = mscnsbmmc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TChamberMscnsbm that = (TChamberMscnsbm) o;
        return id == that.id &&
                Objects.equals(shid, that.shid) &&
                Objects.equals(mscnsbmmc, that.mscnsbmmc);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, shid, mscnsbmmc);
    }
}
