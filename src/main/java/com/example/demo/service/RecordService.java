package com.example.demo.service;

import com.example.demo.dao.RecordMapper;
import com.example.demo.entity.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/01/03.
 */
@Service
public class RecordService {
    @Resource
    private RecordMapper recordMapper;
    @Resource
    private  DemoService demoService;


    @Transactional(rollbackFor = Exception.class)
    public void transactionTest(){
        Record record = new Record();
        record.setType(1);
        record.setName("testTransaction");
        record.setNo("testTransaction");
        recordMapper.insert(record);

        demoService.transactionTest();


    }
}
