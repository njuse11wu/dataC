package com.cetc28.data.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T_RECOMMEND_ORG", schema = "MEMBER", catalog = "")
public class TRecommendOrg {
    private String id;
    private String orgId;
    private String recoOrgName;
    private Integer px;
    private Long sfqy;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ORG_ID")
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Basic
    @Column(name = "RECO_ORG_NAME")
    public String getRecoOrgName() {
        return recoOrgName;
    }

    public void setRecoOrgName(String recoOrgName) {
        this.recoOrgName = recoOrgName;
    }

    @Basic
    @Column(name = "PX")
    public Integer getPx() {
        return px;
    }

    public void setPx(Integer px) {
        this.px = px;
    }

    @Basic
    @Column(name = "SFQY")
    public Long getSfqy() {
        return sfqy;
    }

    public void setSfqy(Long sfqy) {
        this.sfqy = sfqy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TRecommendOrg that = (TRecommendOrg) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(recoOrgName, that.recoOrgName) &&
                Objects.equals(px, that.px) &&
                Objects.equals(sfqy, that.sfqy);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, orgId, recoOrgName, px, sfqy);
    }
}
