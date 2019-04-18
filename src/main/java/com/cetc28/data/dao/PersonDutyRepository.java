package com.cetc28.data.dao;

import com.cetc28.data.pojo.TPersonDuty;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author wq
 */
public interface PersonDutyRepository extends JpaRepository<TPersonDuty, Long>, JpaSpecificationExecutor<TPersonDuty> {
}
