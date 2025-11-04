package com.mvc.dao;

import com.mvc.bean.Login;
import com.mvc.resource.DbResource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

    public boolean signIn(Login login){
        try{
            Connection con = DbResource.getDbConnection();
            PreparedStatement pstmt = con.prepareStatement("select * from login where emailid=? and password=?");
            pstmt.setString(1,login.getEmailid());
            pstmt.setString(2,login.getPassword());
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            System.err.println(e);
            return false;
        }
    }

    public int signUp(Login login){
        try{
            Connection con = DbResource.getDbConnection();
            PreparedStatement pstmt = con.prepareStatement("insert into login (emailid,password) values (?,?)");
            pstmt.setString(1,login.getEmailid());
            pstmt.setString(2,login.getPassword());
            return pstmt.executeUpdate();
        }catch (Exception e){
            System.err.println(e);
            return 0;
        }
    }
}
