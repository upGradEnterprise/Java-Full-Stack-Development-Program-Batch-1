package com;
import java.sql.*;
public class TryWithMultipleCatchBlock {
    public static void main(String[] args) {
//        try{
//
//        } catch(Exception e) {
//           // Generic exception
//        }catch(ArithmeticException e) {
//           // Specific
//        }catch(NumberFormatException e) {
//           // Specific
//        }catch(ArrayIndexOutOfBoundsException e) {
//           // Specific
//        }

        try{
            Connection con = DriverManager.getConnection("","","");
        }catch(SQLException e) {

        }catch(RuntimeException e) {

        }catch(Exception e) {

        }


    }
}
