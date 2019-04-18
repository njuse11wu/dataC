package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_DELETE_TABLE_RECORD", schema = "MEMBER", catalog = "")
public class TDeleteTableRecord {
    private String tableName;
    private String tableRecordId;
    private long id;
    private Time deleteTime;

    @Basic
    @Column(name = "TABLE_NAME")
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "TABLE_RECORD_ID")
    public String getTableRecordId() {
        return tableRecordId;
    }

    public void setTableRecordId(String tableRecordId) {
        this.tableRecordId = tableRecordId;
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
    @Column(name = "DELETE_TIME")
    public Time getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Time deleteTime) {
        this.deleteTime = deleteTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TDeleteTableRecord that = (TDeleteTableRecord) o;
        return id == that.id &&
                Objects.equals(tableName, that.tableName) &&
                Objects.equals(tableRecordId, that.tableRecordId) &&
                Objects.equals(deleteTime, that.deleteTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tableName, tableRecordId, id, deleteTime);
    }
}
