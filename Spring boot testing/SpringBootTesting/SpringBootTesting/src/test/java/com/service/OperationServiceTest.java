package com.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OperationServiceTest {

    @Autowired
    OperationService operationService;

    @Test
    public void testAdd(){
        int result = operationService.add(100,200);
        Assertions.assertEquals(300,result);
    }

    @Test
    public void testSub(){
        int result = operationService.sub(1000,500);
        Assertions.assertEquals(500,result);
    }
    @Test
    public void testMul(){
        int result = operationService.mul(10,2);
        Assertions.assertEquals(20,result);
    }
    @Test
    public void testDiv(){
        int result = operationService.div(1000,200);
        Assertions.assertEquals(5,result);
    }
}
