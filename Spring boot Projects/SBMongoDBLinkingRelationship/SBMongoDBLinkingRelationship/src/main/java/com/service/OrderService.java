package com.service;

import com.document.Orders;
import com.document.Product;
import com.repository.OrdersRepository;
import com.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrdersRepository ordersRepository;

    @Autowired
    ProductRepository productRepository;
    public String orderPlace(Orders order){
        order.setOrderDateTime(LocalDateTime.now());
        System.out.println(order);
        // using product id find the product details and check the qty
        // verify order place qty and actual qty and
        // sub and find the total amount
        // set the total amount.
        //ordersRepository.save(order);
        float total = 0;
        try {
            for (Product orderProduct : order.getListOfProducts()) {
                Product p = productRepository.findById(orderProduct.getId()).orElseThrow(() -> new RuntimeException("product not found"));
                if(p.getQty() >= orderProduct.getQty()){
                    p.setQty(p.getQty() - orderProduct.getQty());
                    productRepository.save(p);      // reduce the qty
                    total=total+orderProduct.getQty()*p.getPrice();
                }else {
                    throw new RuntimeException("product qty not enough");
                }
            }
            order.setOrderPrice(total);
            ordersRepository.save(order);
            return "order placed successfully";
        }catch(Exception e){
            System.out.println(e);
            return e.getMessage();
        }
    }

    public List<Orders> getOrders(){
        return ordersRepository.findAll();
    }
}
