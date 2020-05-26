package com.example.demo.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.demo.dao.SightEventMapper;
import com.example.demo.entity.SightEvent;
@Service
public class SightEventService{

    @Resource
    private SightEventMapper sightEventMapper;

    
    public int deleteByPrimaryKey(Long id) {
        return sightEventMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(SightEvent record) {
        return sightEventMapper.insert(record);
    }

    
    public int insertOrUpdate(SightEvent record) {
        return sightEventMapper.insertOrUpdate(record);
    }

    
    public int insertOrUpdateSelective(SightEvent record) {
        return sightEventMapper.insertOrUpdateSelective(record);
    }

    
    public int insertSelective(SightEvent record) {
        return sightEventMapper.insertSelective(record);
    }

    
    public SightEvent selectByPrimaryKey(Long id) {
        return sightEventMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(SightEvent record) {
        return sightEventMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(SightEvent record) {
        return sightEventMapper.updateByPrimaryKey(record);
    }

    
    public int updateBatch(List<SightEvent> list) {
        return sightEventMapper.updateBatch(list);
    }

    
    public int batchInsert(List<SightEvent> list) {
        return sightEventMapper.batchInsert(list);
    }

}
