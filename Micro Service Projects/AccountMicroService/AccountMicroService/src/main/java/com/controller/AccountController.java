package com.controller;

import com.bean.Account;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @PostMapping(value ="create",consumes = MediaType.APPLICATION_JSON_VALUE)
    public String createAccount(@RequestBody Account account){
        return  accountService.createAccount(account);
    }

    @GetMapping(value = "findBalanceUsingEmailId/{emailId}")
    public float findBalanceUsingEmailId(@PathVariable("emailId") String emailId){
        return accountService.findBalance(emailId);
    }

    @GetMapping(value = "findBalanceUsingAccNo/{accno}")
    public float findBalanceUsingAccno(@PathVariable("accno") int accno){
        return accountService.findBalance(accno);
    }

    @GetMapping(value = "findAccountNumber/{emailId}")
    public int findAccountNumber(@PathVariable("emailId") String emailId){
        return accountService.findAccount(emailId);
    }

    @GetMapping(value = "hello")
    public String sayHello(@RequestParam("msg") String msg){
        return "Hello "+msg;
    }
}
