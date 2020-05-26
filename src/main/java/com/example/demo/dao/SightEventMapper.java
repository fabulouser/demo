package com.example.demo.dao;

import com.example.demo.entity.SightEvent;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SightEventMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SightEvent record);

    int insertOrUpdate(SightEvent record);

    int insertOrUpdateSelective(SightEvent record);

    int insertSelective(SightEvent record);

    SightEvent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SightEvent record);

    int updateByPrimaryKey(SightEvent record);

    int updateBatch(List<SightEvent> list);

    int batchInsert(@Param("list") List<SightEvent> list);
}