package com.dao;

import com.bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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
    public List<Product> findAllProducts() {
        try{
        return jdbcTemplate.query("select * from product",
                (ResultSet rs,int numRow)->new Product(rs.getInt("pid"),rs.getString("pname"),rs.getFloat("price")));
        }catch (Exception e){
            System.err.println(e);
            return null;
        }
    }
}

//class MyRowMapper implements RowMapper<Product> {
//    @Override
//    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
//        return null;
//    }
//}