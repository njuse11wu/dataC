package com.cetc28.data.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "D_DICTIONARY", schema = "MEMBER", catalog = "")
@IdClass(DDictionaryPK.class)
public class DDictionary {
    private String typeCode;
    private String code;
    private String name;
    private String active;
    private String remark;
    private String showCon;
    private String parentCode;

    @Id
    @Column(name = "TYPE_CODE")
    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

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
    @Column(name = "ACTIVE")
    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @Basic
    @Column(name = "REMARK")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "SHOW_CON")
    public String getShowCon() {
        return showCon;
    }

    public void setShowCon(String showCon) {
        this.showCon = showCon;
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
        DDictionary that = (DDictionary) o;
        return Objects.equals(typeCode, that.typeCode) &&
                Objects.equals(code, that.code) &&
                Objects.equals(name, that.name) &&
                Objects.equals(active, that.active) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(showCon, that.showCon) &&
                Objects.equals(parentCode, that.parentCode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(typeCode, code, name, active, remark, showCon, parentCode);
    }
}
