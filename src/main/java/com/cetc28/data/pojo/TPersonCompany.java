package com.cetc28.data.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T_PERSON_COMPANY", schema = "MEMBER", catalog = "")
public class TPersonCompany {
    private long id;
    private String ryid;
    private String qyid;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "QYID")
    public String getQyid() {
        return qyid;
    }

    public void setQyid(String qyid) {
        this.qyid = qyid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TPersonCompany that = (TPersonCompany) o;
        return id == that.id &&
                Objects.equals(ryid, that.ryid) &&
                Objects.equals(qyid, that.qyid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, ryid, qyid);
    }
}
