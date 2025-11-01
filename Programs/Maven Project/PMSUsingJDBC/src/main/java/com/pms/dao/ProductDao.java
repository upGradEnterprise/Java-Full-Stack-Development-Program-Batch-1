package com.pms.dao;

import com.pms.bean.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    public int storeProduct(Product product){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/upgrade_db","root","root@123");
            PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
            pstmt.setInt(1,product.getPid());
            pstmt.setString(2,product.getPname());
            pstmt.setFloat(3,product.getPrice());
            return pstmt.executeUpdate();
        }catch (Exception e){
            System.err.println(e);
            return 0;
        }
    }

    public List<Product> findProduct() {
        List<Product> listOfProducts = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/upgrade_db","root","root@123");
            PreparedStatement pstmt = con.prepareStatement("select * from product");
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                // convert sql query in the form of objects.
                Product p = new Product();
                p.setPid(rs.getInt(1));
                p.setPname(rs.getString(2));
                p.setPrice(rs.getFloat(3));
                listOfProducts.add(p);
            }
        }catch (Exception e){
            System.err.println(e);
            return null;
        }
        return listOfProducts;
    }
}
