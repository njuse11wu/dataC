package com.cetc28.data.dao;

import com.cetc28.data.pojo.TOrgBasicInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author wq
 */
public interface OrgBasicRepository extends JpaRepository<TOrgBasicInfo, String> {
    @Query(value = "select zzmc from T_ORG_BASIC_INFO where zzid = ?1",nativeQuery = true)
    String getMcByZzid(String zzid);
}
