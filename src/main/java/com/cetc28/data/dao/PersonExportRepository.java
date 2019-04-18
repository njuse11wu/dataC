package com.cetc28.data.dao;

import com.cetc28.data.pojo.TPersonExport;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wq
 */
public interface PersonExportRepository extends JpaRepository<TPersonExport,String> {
}
