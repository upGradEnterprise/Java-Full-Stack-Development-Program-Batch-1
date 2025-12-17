package com.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.dao.SimpleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class SimpleService {
    @Autowired
    SimpleDao simpleDao;

    @Cacheable(value = "simpleCache")
    public String getDataFromService() {
        return simpleDao.getDataFromDb();
    }
    @Cacheable(value = "productCache",key = "#pid")
    public String findProductFromDao(int pid){
        System.out.println("Find product id in service layer");
        return simpleDao.findProductFromDb(pid);
    }
    @CachePut(value = "productCache",key = "#pid")
    public String updateCache(int pid){
        System.out.println("Update product id in service layer");
        return simpleDao.updateProductInDb(pid);
    }
}
