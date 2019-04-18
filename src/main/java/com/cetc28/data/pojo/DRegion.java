package com.cetc28.data.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "D_REGION", schema = "MEMBER", catalog = "")
public class DRegion {
    private String code;
    private String name;
    private String available;
    private String sequence;
    private String parentCode;

    @Id
    @Column(name = "CODE")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "AVAILABLE")
    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    @Basic
    @Column(name = "SEQUENCE")
    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    @Basic
    @Column(name = "PARENT_CODE")
    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DRegion dRegion = (DRegion) o;
        return Objects.equals(code, dRegion.code) &&
                Objects.equals(name, dRegion.name) &&
                Objects.equals(available, dRegion.available) &&
                Objects.equals(sequence, dRegion.sequence) &&
                Objects.equals(parentCode, dRegion.parentCode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(code, name, available, sequence, parentCode);
    }
}
