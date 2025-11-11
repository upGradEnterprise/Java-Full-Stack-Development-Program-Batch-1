package com.service;

import com.bean.Account;
import com.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    public String createAccount(Account account){
        Optional<Account> result = accountRepository.findById(account.getAccNo());
        if(result.isPresent()){
            return "Account already exists";
        }else {
            accountRepository.save(account);
            return "Account created";
        }
    }

    public float findBalance(int accno){
        Optional<Account> result = accountRepository.findById(accno);
        if(result.isPresent()){
            Account accountFromDb =  result.get();
            return accountFromDb.getAmount();
        }else {
            return -1;
        }
    }

    public float findBalance(String email){
        try{
            return accountRepository.findBalance(email);
        }catch (Exception e){
            return -1;
        }
    }

    public int findAccount(String email){
        try{
            return accountRepository.findAccountNumber(email);
        }catch (Exception e){
            return -1;
        }
    }
}
