package com.cetc28.data.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T_NOTICE_TARGET", schema = "MEMBER", catalog = "")
public class TNoticeTarget {
    private String noticeId;
    private String noticeTargetType;
    private String noticeFicId;
    private String noticeLowerFic;
    private String noticeTargetDetailType;
    private String noticeTargetPeriod;
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
    @Column(name = "NOTICE_TARGET_TYPE")
    public String getNoticeTargetType() {
        return noticeTargetType;
    }

    public void setNoticeTargetType(String noticeTargetType) {
        this.noticeTargetType = noticeTargetType;
    }

    @Basic
    @Column(name = "NOTICE_FIC_ID")
    public String getNoticeFicId() {
        return noticeFicId;
    }

    public void setNoticeFicId(String noticeFicId) {
        this.noticeFicId = noticeFicId;
    }

    @Basic
    @Column(name = "NOTICE_LOWER_FIC")
    public String getNoticeLowerFic() {
        return noticeLowerFic;
    }

    public void setNoticeLowerFic(String noticeLowerFic) {
        this.noticeLowerFic = noticeLowerFic;
    }

    @Basic
    @Column(name = "NOTICE_TARGET_DETAIL_TYPE")
    public String getNoticeTargetDetailType() {
        return noticeTargetDetailType;
    }

    public void setNoticeTargetDetailType(String noticeTargetDetailType) {
        this.noticeTargetDetailType = noticeTargetDetailType;
    }

    @Basic
    @Column(name = "NOTICE_TARGET_PERIOD")
    public String getNoticeTargetPeriod() {
        return noticeTargetPeriod;
    }

    public void setNoticeTargetPeriod(String noticeTargetPeriod) {
        this.noticeTargetPeriod = noticeTargetPeriod;
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
        TNoticeTarget that = (TNoticeTarget) o;
        return id == that.id &&
                Objects.equals(noticeId, that.noticeId) &&
                Objects.equals(noticeTargetType, that.noticeTargetType) &&
                Objects.equals(noticeFicId, that.noticeFicId) &&
                Objects.equals(noticeLowerFic, that.noticeLowerFic) &&
                Objects.equals(noticeTargetDetailType, that.noticeTargetDetailType) &&
                Objects.equals(noticeTargetPeriod, that.noticeTargetPeriod);
    }

    @Override
    public int hashCode() {

        return Objects.hash(noticeId, noticeTargetType, noticeFicId, noticeLowerFic, noticeTargetDetailType, noticeTargetPeriod, id);
    }
}
