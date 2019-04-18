package com.cetc28.data.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T_CHAMBER_ZWH", schema = "MEMBER", catalog = "")
public class TChamberZwh {
    private long id;
    private String shid;
    private String zwhmc;

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
    @Column(name = "ZWHMC")
    public String getZwhmc() {
        return zwhmc;
    }

    public void setZwhmc(String zwhmc) {
        this.zwhmc = zwhmc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TChamberZwh that = (TChamberZwh) o;
        return id == that.id &&
                Objects.equals(shid, that.shid) &&
                Objects.equals(zwhmc, that.zwhmc);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, shid, zwhmc);
    }
}
