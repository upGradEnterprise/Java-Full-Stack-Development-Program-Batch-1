package com.pms.dao;

import com.pms.bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class ProductDao {

    @Autowired
    DataSource ds;          // it check DataSource information in xml or java or properties file
    // byDefault byType. before spring framework we were using database source using JNDI lookup from application server

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


//    public List<Product> findAll(){
//    List<Product> productList = new ArrayList<Product>();
//        try{
//        Connection con = ds.getConnection();
//        PreparedStatement pstmt = con.prepareStatement("select * from product");
//        ResultSet rs = pstmt.executeQuery();
//        while (rs.next()) {
//            Product product = new Product();
//            product.setPid(rs.getInt(1));
//            product.setPname(rs.getString(2));
//            product.setPrice(rs.getFloat(3));
//            productList.add(product);
//        }
//    }catch(Exception e) {
//        System.err.println(e);
//    }
//        return productList;
//    }

    // retrieve product details as Map objects.
    public List<Map<String,Object>> findAllProductsAsMapObject() {
        try{
            return jdbcTemplate.queryForList("select * from product");
        }catch (Exception e){
            System.err.println(e);
            return null;
        }
    }

    public List<Product> findAllProductsAsListObjects() {
        return jdbcTemplate.query("select * from product",new MyRowMapper());
    }
}
// map each row and return T object ie Product
class MyRowMapper implements RowMapper<Product> {
    // convert each record to Product object ie T type
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
            Product product = new Product();
            product.setPid(rs.getInt("pid"));
            product.setPname(rs.getString("pname"));
            product.setPrice(rs.getFloat("price"));
            return product;
    }
}