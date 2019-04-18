package com.cetc28.data.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T_ORG_MEMBER", schema = "MEMBER", catalog = "")
public class TOrgMember {
    private String zzjgid;
    private String ryid;

    @Id
    @Column(name = "ZZJGID")
    public String getZzjgid() {
        return zzjgid;
    }

    public void setZzjgid(String zzjgid) {
        this.zzjgid = zzjgid;
    }

    @Basic
    @Column(name = "RYID")
    public String getRyid() {
        return ryid;
    }

    public void setRyid(String ryid) {
        this.ryid = ryid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TOrgMember that = (TOrgMember) o;
        return Objects.equals(zzjgid, that.zzjgid) &&
                Objects.equals(ryid, that.ryid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(zzjgid, ryid);
    }
}
