package com.pms.dao;

import com.pms.bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDao {

    @Autowired
    DataSource ds;          // it check DataSource information in xml or java or properties file
    // byDefault byType. before spring framework we were using database source using JNDI lookup from application server

    public int storeProduct(Product product) {
        try {
            Connection con = ds.getConnection();
            PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
            pstmt.setInt(1, product.getPid());
            pstmt.setString(2, product.getPname());
            pstmt.setFloat(3, product.getPrice());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            System.err.println(e);
            return 0;
        }
    }

    public List<Product> findAll(){
    List<Product> productList = new ArrayList<Product>();
        try{
        Connection con = ds.getConnection();
        PreparedStatement pstmt = con.prepareStatement("select * from product");
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            Product product = new Product();
            product.setPid(rs.getInt(1));
            product.setPname(rs.getString(2));
            product.setPrice(rs.getFloat(3));
            productList.add(product);
        }
    }catch(Exception e) {
        System.err.println(e);
    }
        return productList;
    }

}
