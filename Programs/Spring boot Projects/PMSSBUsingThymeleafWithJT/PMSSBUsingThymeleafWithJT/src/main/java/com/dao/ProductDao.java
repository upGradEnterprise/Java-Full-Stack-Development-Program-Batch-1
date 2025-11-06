package com.dao;

import com.bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public int storeProduct(Product product) {
        try{
            return jdbcTemplate.update("insert into product values(?,?,?)",product.getPid(),product.getPname(),product.getPrice());
        }catch (Exception e){
            System.err.println(e);
            return 0;
        }
    }
}
