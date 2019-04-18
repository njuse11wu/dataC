package com.cetc28.data.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T_ORG_DEFAULT_REP_JIE", schema = "MEMBER", catalog = "")
public class TOrgDefaultRepJie {
    private long id;
    private String orgId;
    private Long repJie;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ORG_ID")
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Basic
    @Column(name = "REP_JIE")
    public Long getRepJie() {
        return repJie;
    }

    public void setRepJie(Long repJie) {
        this.repJie = repJie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TOrgDefaultRepJie that = (TOrgDefaultRepJie) o;
        return id == that.id &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(repJie, that.repJie);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, orgId, repJie);
    }
}
