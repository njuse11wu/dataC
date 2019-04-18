package com.cetc28.data.dao;

import com.cetc28.data.pojo.DDictionary;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//import java.util.List;

/**
 * @author wq
 */
public interface DDictionaryRepository extends JpaRepository<DDictionary, String> {


    /**
     * 根据typeCode,code获取中文名称
     * @param typeCode typeCode
     * @param code code
     * @return name
     */

    @Query(value = "select NAME from D_DICTIONARY where TYPE_CODE = ?1 and CODE = ?2", nativeQuery = true)
    String getNameByTypeCodeAndCode(String typeCode, String code);
}
