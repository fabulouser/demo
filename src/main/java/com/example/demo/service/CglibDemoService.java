package com.example.demo.service;

import com.example.demo.dao.RecordMapper;
import com.example.demo.entity.Record;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CglibDemoService {

    @Autowired
    private RecordMapper recordMapper;

    @Transactional(rollbackFor = Exception.class)
    public void testThisTransaction(){
        this.insertSomeThing();
        AopContext.currentProxy();
    }

    @Transactional(rollbackFor = Exception.class)
    public void insertSomeThing(){
        Record record = new Record();
        record.setType(9);
        record.setName("测试this使用的是不是代理对象");
        record.setNo("测试this使用的是不是代理对象");
        recordMapper.insert(record);
        throw new IllegalStateException("错误");
    }



}
