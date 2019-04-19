package com.cetc28.data.dao;

import com.cetc28.data.pojo.TPersonBasicInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

/**
 * @author wq
 */
public interface PersonBasicRepository extends JpaRepository<TPersonBasicInfo, String>, ICountDown {

    /**
     * 获取所有的id
     *
     * @return ids
     */
    @Query(value = "select g.ryid from T_PERSON_GSL_MAP g inner join T_PERSON_BASIC_INFO t on g.RYID = t.RYID", nativeQuery = true)
    List<String> findAllId();

    /**
     * 获取更新时间大于 ? 的id
     *
     * @param gxsj 更新时间
     * @return ids
     */
    @Query(value = "select g.ryid from T_PERSON_BASIC_INFO t inner join T_PERSON_GSL_MAP g on t.RYID = g.RYID  where t.GXSJ >= ?1", nativeQuery = true)
    List<String> findUpdateRyid(Date gxsj);

    @Query(value = "select * from T_PERSON_BASIC_INFO where ROWNUM < 5000", nativeQuery = true)
    List<TPersonBasicInfo> findAllTest();


    @Override
    @Query(value = "select RYID from (select ROWNUM as rn ,g.ryid from T_PERSON_GSL_MAP g inner join T_PERSON_BASIC_INFO t on g.RYID = t.RYID) where  rn > ?1 and rn <= ?2", nativeQuery = true)
    List<String> getIds(Integer start, Integer end);

    @Override
    @Query(value = "select count(g.ryid) from T_PERSON_GSL_MAP g inner join T_PERSON_BASIC_INFO t on g.RYID = t.RYID", nativeQuery = true)
    int getIdCount();


}
