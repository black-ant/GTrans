package com.gang.gexpro.core.persistence.mybatis.dao;

import com.gang.gexpro.core.persistence.mybatis.entity.mapper.TestMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ExampleDAO {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    TestMapper testMapper;

    public void test() {

    }
}
