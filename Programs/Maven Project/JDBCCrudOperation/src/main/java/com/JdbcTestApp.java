package com;
import java.sql.*;
import java.util.Scanner;

public class JdbcTestApp {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded...");
            Connection con =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/upgrade_db", "root", "root@123");
            System.out.println("Connected successfully");
            //Statement stmt = con.createStatement();
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
//            ResultSet rs  = stmt.executeQuery("select * from Product");
//            while(rs.next()){
//                System.out.println("PId "+rs.getInt(1)+" PName is "+rs.getString(2)+" Price is "+rs.getFloat(3));
//            }

            //rs.close();
            Scanner sc = new Scanner(System.in);

//            // insert the recod using PreparedStatement
//            PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
//            System.out.println("Enter the id");
//            int pid = sc.nextInt();
//            pstmt.setInt(1,pid);
//
//            System.out.println("Enter the pname");
//            String pname = sc.next();
//            pstmt.setString(2,pname);
//
//            System.out.println("Enter the price");
//            float price = sc.nextFloat();
//            pstmt.setFloat(3,price);
//
//
//            int result = pstmt.executeUpdate();
//            if(result>0){
//                System.out.println("Record inserted successfully");
//            }


            // delete the recod using PreparedStatement
//            PreparedStatement pstmt = con.prepareStatement("delete from product where pid =?");
//            System.out.println("Enter the id");
//            int pid = sc.nextInt();
//            pstmt.setInt(1,pid);
//            int result = pstmt.executeUpdate();
//            if(result>0){
//                System.out.println("Record deleted successfully");
//            }else {
//                System.out.println("Record not present");
//            }


            // update the recod using PreparedStatement
//            PreparedStatement pstmt = con.prepareStatement("update product set price = ? where pid = ?");
//            System.out.println("Enter the id");
//            int pid = sc.nextInt();
//            pstmt.setInt(2,pid);
//
//            System.out.println("Enter the price");
//            float price = sc.nextFloat();
//            pstmt.setFloat(1,price);
//
//
//            int result = pstmt.executeUpdate();
//            if(result>0){
//                System.out.println("Record updated successfully");
//            }else {
//                System.out.println("Record not present");
//            }

            // retrieve record using pid
            PreparedStatement pstmt = con.prepareStatement("select * from product where pid = ?");
            System.out.println("Enter the id");
            int pid = sc.nextInt();
            pstmt.setInt(1,pid);

            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                System.out.println("Pid is "+rs.getInt("pid")+" PName is "+rs.getString(2)+" Price is "+rs.getFloat(3));
            }else {
                System.out.println("record not present");
            }

            //stmt.close();
            con.close();
        }   catch (Exception e){
            System.out.println(e);
        }


    }
}
