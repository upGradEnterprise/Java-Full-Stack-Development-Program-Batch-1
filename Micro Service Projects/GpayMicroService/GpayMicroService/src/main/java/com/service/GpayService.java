package com.service;

import com.document.Gpay;
import com.repository.GpayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class GpayService {


    @Autowired
    GpayRepository gpayRepository;

    @Autowired                  // DI
    RestTemplate restTemplate;

    public String createGpayAccount(Gpay gpay){ // emailId
        String emailId = gpay.getEmailid();
        //Integer accno = restTemplate.getForObject("http://localhost:8282/account/findAccountNumber/"+emailId,Integer.class);
        Integer accno = restTemplate.getForObject("http://ACCOUNTMICROSERVICE/account/findAccountNumber/"+emailId,Integer.class);
        if(accno==-1){
            return "Account Not Found with provided emailId as "+emailId;
        }else {
            gpay.setAccno(accno);
            gpayRepository.save(gpay);
            return "Gpay Account created successfully";
        }
    }

    public String findBalance(String gpayId){
        Optional<Gpay> result = gpayRepository.findById(gpayId);
        if(result.isPresent()){
            Gpay gpay = result.get();
            int accno = gpay.getAccno();
            //float amount = restTemplate.getForObject("http://localhost:8282/account/findBalanceUsingAccNo/"+accno,Float.class);
            float amount = restTemplate.getForObject("http://ACCOUNTMICROSERVICE/account/findBalanceUsingAccNo/"+accno,Float.class);
            return "Your balance is "+amount+"with account number as "+accno;
        }else {
            return "Gpay account not found";
        }

    }
}


