package com.cetc28.data.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T_EXPORT_COLUMN", schema = "MEMBER", catalog = "")
public class TExportColumn {
    private long id;
    private String exportType;
    private String exportColCode;
    private String exportColName;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "EXPORT_TYPE")
    public String getExportType() {
        return exportType;
    }

    public void setExportType(String exportType) {
        this.exportType = exportType;
    }

    @Basic
    @Column(name = "EXPORT_COL_CODE")
    public String getExportColCode() {
        return exportColCode;
    }

    public void setExportColCode(String exportColCode) {
        this.exportColCode = exportColCode;
    }

    @Basic
    @Column(name = "EXPORT_COL_NAME")
    public String getExportColName() {
        return exportColName;
    }

    public void setExportColName(String exportColName) {
        this.exportColName = exportColName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TExportColumn that = (TExportColumn) o;
        return id == that.id &&
                Objects.equals(exportType, that.exportType) &&
                Objects.equals(exportColCode, that.exportColCode) &&
                Objects.equals(exportColName, that.exportColName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, exportType, exportColCode, exportColName);
    }
}
