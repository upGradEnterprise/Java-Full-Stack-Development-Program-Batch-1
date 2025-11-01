package com;
import java.sql.*;
public class JdbcTestApp {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded...");
            Connection con =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/upgrade_db","root","root@123");
            System.out.println("Connected successfully");
            Statement stmt = con.createStatement();
            // create table product(pid int primary key,pname varchar(30), price float);
            // insert query


//            int result  = stmt.executeUpdate("insert into product values(3,'Laptop',87000)");
//            if(result>0){
//                System.out.println("Record inserted successfully");
//            }

            // update query

//            int result  = stmt.executeUpdate("update product set price=48000 where pid=1");
//            if(result>0){
//                System.out.println("Record updated successfully");
//            }else {
//                System.out.println("record not present");
//            }

            // delete query
//            int result  = stmt.executeUpdate("delete from product where pid=3");
//            if(result>0){
//                System.out.println("Record deleted successfully");
//            }else {
//                System.out.println("record not present");
//            }

            // retrieve query
            ResultSet rs  = stmt.executeQuery("select * from Product");
            while(rs.next()){
                System.out.println("PId "+rs.getInt(1)+" PName is "+rs.getString(2)+" Price is "+rs.getFloat(3));
            }
            rs.close();
            stmt.close();
            con.close();
        }   catch (Exception e){
            System.out.println(e);
        }
    }
}
