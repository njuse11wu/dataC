package com.cetc28.data.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "T_NOTICE", schema = "MEMBER", catalog = "")
public class TNotice {
    private String noticeId;
    private String noticeTitle;
    private String noticeTypeCode;
    private String noticeTypeName;
    private String noticePlatform;
    private String noticeContent;
    private String noticeTimeType;
    private String sendOrgId;
    private String sendOrgName;
    private String sendPersonId;
    private String sendPersonName;
    private Time sendTime;

    @Id
    @Column(name = "NOTICE_ID")
    public String getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId;
    }

    @Basic
    @Column(name = "NOTICE_TITLE")
    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    @Basic
    @Column(name = "NOTICE_TYPE_CODE")
    public String getNoticeTypeCode() {
        return noticeTypeCode;
    }

    public void setNoticeTypeCode(String noticeTypeCode) {
        this.noticeTypeCode = noticeTypeCode;
    }

    @Basic
    @Column(name = "NOTICE_TYPE_NAME")
    public String getNoticeTypeName() {
        return noticeTypeName;
    }

    public void setNoticeTypeName(String noticeTypeName) {
        this.noticeTypeName = noticeTypeName;
    }

    @Basic
    @Column(name = "NOTICE_PLATFORM")
    public String getNoticePlatform() {
        return noticePlatform;
    }

    public void setNoticePlatform(String noticePlatform) {
        this.noticePlatform = noticePlatform;
    }

    @Basic
    @Column(name = "NOTICE_CONTENT")
    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
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
    @Column(name = "SEND_ORG_ID")
    public String getSendOrgId() {
        return sendOrgId;
    }

    public void setSendOrgId(String sendOrgId) {
        this.sendOrgId = sendOrgId;
    }

    @Basic
    @Column(name = "SEND_ORG_NAME")
    public String getSendOrgName() {
        return sendOrgName;
    }

    public void setSendOrgName(String sendOrgName) {
        this.sendOrgName = sendOrgName;
    }

    @Basic
    @Column(name = "SEND_PERSON_ID")
    public String getSendPersonId() {
        return sendPersonId;
    }

    public void setSendPersonId(String sendPersonId) {
        this.sendPersonId = sendPersonId;
    }

    @Basic
    @Column(name = "SEND_PERSON_NAME")
    public String getSendPersonName() {
        return sendPersonName;
    }

    public void setSendPersonName(String sendPersonName) {
        this.sendPersonName = sendPersonName;
    }

    @Basic
    @Column(name = "SEND_TIME")
    public Time getSendTime() {
        return sendTime;
    }

    public void setSendTime(Time sendTime) {
        this.sendTime = sendTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TNotice tNotice = (TNotice) o;
        return Objects.equals(noticeId, tNotice.noticeId) &&
                Objects.equals(noticeTitle, tNotice.noticeTitle) &&
                Objects.equals(noticeTypeCode, tNotice.noticeTypeCode) &&
                Objects.equals(noticeTypeName, tNotice.noticeTypeName) &&
                Objects.equals(noticePlatform, tNotice.noticePlatform) &&
                Objects.equals(noticeContent, tNotice.noticeContent) &&
                Objects.equals(noticeTimeType, tNotice.noticeTimeType) &&
                Objects.equals(sendOrgId, tNotice.sendOrgId) &&
                Objects.equals(sendOrgName, tNotice.sendOrgName) &&
                Objects.equals(sendPersonId, tNotice.sendPersonId) &&
                Objects.equals(sendPersonName, tNotice.sendPersonName) &&
                Objects.equals(sendTime, tNotice.sendTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(noticeId, noticeTitle, noticeTypeCode, noticeTypeName, noticePlatform, noticeContent, noticeTimeType, sendOrgId, sendOrgName, sendPersonId, sendPersonName, sendTime);
    }
}
