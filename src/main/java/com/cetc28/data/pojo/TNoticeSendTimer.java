package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_NOTICE_SEND_TIMER", schema = "MEMBER", catalog = "")
public class TNoticeSendTimer {
    private String noticeId;
    private String noticeTimeType;
    private Time noticeStartDate;
    private Time noticeEndDate;
    private Time noticeSendTime;
    private String noticeSendFreq;
    private String completeFlag;
    private long id;

    @Basic
    @Column(name = "NOTICE_ID")
    public String getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId;
    }

    @Basic
    @Column(name = "NOTICE_TIME_TYPE")
    public String getNoticeTimeType() {
        return noticeTimeType;
    }

    public void setNoticeTimeType(String noticeTimeType) {
        this.noticeTimeType = noticeTimeType;
    }

    @Basic
    @Column(name = "NOTICE_START_DATE")
    public Time getNoticeStartDate() {
        return noticeStartDate;
    }

    public void setNoticeStartDate(Time noticeStartDate) {
        this.noticeStartDate = noticeStartDate;
    }

    @Basic
    @Column(name = "NOTICE_END_DATE")
    public Time getNoticeEndDate() {
        return noticeEndDate;
    }

    public void setNoticeEndDate(Time noticeEndDate) {
        this.noticeEndDate = noticeEndDate;
    }

    @Basic
    @Column(name = "NOTICE_SEND_TIME")
    public Time getNoticeSendTime() {
        return noticeSendTime;
    }

    public void setNoticeSendTime(Time noticeSendTime) {
        this.noticeSendTime = noticeSendTime;
    }

    @Basic
    @Column(name = "NOTICE_SEND_FREQ")
    public String getNoticeSendFreq() {
        return noticeSendFreq;
    }

    public void setNoticeSendFreq(String noticeSendFreq) {
        this.noticeSendFreq = noticeSendFreq;
    }

    @Basic
    @Column(name = "COMPLETE_FLAG")
    public String getCompleteFlag() {
        return completeFlag;
    }

    public void setCompleteFlag(String completeFlag) {
        this.completeFlag = completeFlag;
    }

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TNoticeSendTimer that = (TNoticeSendTimer) o;
        return id == that.id &&
                Objects.equals(noticeId, that.noticeId) &&
                Objects.equals(noticeTimeType, that.noticeTimeType) &&
                Objects.equals(noticeStartDate, that.noticeStartDate) &&
                Objects.equals(noticeEndDate, that.noticeEndDate) &&
                Objects.equals(noticeSendTime, that.noticeSendTime) &&
                Objects.equals(noticeSendFreq, that.noticeSendFreq) &&
                Objects.equals(completeFlag, that.completeFlag);
    }

    @Override
    public int hashCode() {

        return Objects.hash(noticeId, noticeTimeType, noticeStartDate, noticeEndDate, noticeSendTime, noticeSendFreq, completeFlag, id);
    }
}
