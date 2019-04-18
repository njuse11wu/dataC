package com.cetc28.data.dao;

import com.cetc28.data.pojo.TPersonGslMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author wq
 */
public interface PersonGslMapRepository extends JpaRepository<TPersonGslMap, String>,JpaSpecificationExecutor<TPersonGslMap> {
}
