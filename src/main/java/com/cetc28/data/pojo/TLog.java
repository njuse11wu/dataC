package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_LOG", schema = "MEMBER", catalog = "")
public class TLog {
    private String id;
    private String name;
    private String log;
    private String inputvalue;
    private String returnvalue;
    private Time calltime;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @Column(name = "LOG")
    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    @Basic
    @Column(name = "INPUTVALUE")
    public String getInputvalue() {
        return inputvalue;
    }

    public void setInputvalue(String inputvalue) {
        this.inputvalue = inputvalue;
    }

    @Basic
    @Column(name = "RETURNVALUE")
    public String getReturnvalue() {
        return returnvalue;
    }

    public void setReturnvalue(String returnvalue) {
        this.returnvalue = returnvalue;
    }

    @Basic
    @Column(name = "CALLTIME")
    public Time getCalltime() {
        return calltime;
    }

    public void setCalltime(Time calltime) {
        this.calltime = calltime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TLog tLog = (TLog) o;
        return Objects.equals(id, tLog.id) &&
                Objects.equals(name, tLog.name) &&
                Objects.equals(log, tLog.log) &&
                Objects.equals(inputvalue, tLog.inputvalue) &&
                Objects.equals(returnvalue, tLog.returnvalue) &&
                Objects.equals(calltime, tLog.calltime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, log, inputvalue, returnvalue, calltime);
    }
}
