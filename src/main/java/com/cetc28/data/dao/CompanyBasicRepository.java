package com.cetc28.data.dao;

import com.cetc28.data.pojo.TCompanyBasicInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wq
 */
public interface CompanyBasicRepository extends JpaRepository<TCompanyBasicInfo,String> {
}
