package com.example.demo.dao;
import java.util.List;

import com.example.demo.entity.Record;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

@Repository
@Mapper()
public interface RecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Record record);

    int insertSelective(Record record);

    Record selectByPrimaryKey(@Param("id") Integer id);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(@Param("record") Record record);

    int updateByPrimaryKey222(@Param("record") Record record,@Param("num") Integer num);

    List<Record> selectByName(@Param("name")String name);




}