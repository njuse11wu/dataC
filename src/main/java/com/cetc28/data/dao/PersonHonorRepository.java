package com.cetc28.data.dao;

import com.cetc28.data.pojo.TPersonHonour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author wq
 */
public interface PersonHonorRepository extends JpaRepository<TPersonHonour, String>, JpaSpecificationExecutor<TPersonHonour> {
}
