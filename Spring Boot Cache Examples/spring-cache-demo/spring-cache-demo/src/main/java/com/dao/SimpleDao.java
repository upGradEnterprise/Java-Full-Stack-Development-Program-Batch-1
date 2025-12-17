package com.dao;

import org.springframework.stereotype.Repository;

@Repository
public class SimpleDao {

    public String getDataFromDb() {
        System.out.println("I Came in Db layer");
        try{
            Thread.sleep(5000);
        }catch (Exception e){

        }
        return "Data retrieved from DB";
    }

    public String findProductFromDb(int pid) {
        System.out.println("I Came in Db layer for retreive "+pid);
        try{
            Thread.sleep(3000);
        }catch (Exception e){

        }
        return "Data retrieved from DB with pid "+pid;
    }

    public String updateProductInDb(int pid) {
        System.out.println("I Came in Db layer for update "+pid);
        return "Updated product in db"+pid;
    }

    public String deleteProductInDb(int pid) {
        System.out.println("I Came in Db layer for delete "+pid);
        return "deleted product in db"+pid;
    }

    public String removeAllProduct() {
        return "All Data removed from DB";
    }
}
