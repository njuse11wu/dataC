package com.cetc28.data.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class DDictionaryPK implements Serializable {
    private String typeCode;
    private String code;

    @Column(name = "TYPE_CODE")
    @Id
    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    @Column(name = "CODE")
    @Id
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DDictionaryPK that = (DDictionaryPK) o;
        return Objects.equals(typeCode, that.typeCode) &&
                Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {

        return Objects.hash(typeCode, code);
    }
}
