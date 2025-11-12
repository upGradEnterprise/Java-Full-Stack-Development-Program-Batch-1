package com.controller;

import com.document.Gpay;
import com.service.GpayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("gpay")
public class GpayController {
    @Autowired
    GpayService gpayService;

    @PostMapping(value = "create",consumes = MediaType.APPLICATION_JSON_VALUE)
    public String createGpayAccount(@RequestBody Gpay gpay)
    {
        return gpayService.createGpayAccount(gpay);
    }

    @GetMapping(value = "findBalance/{gpayId}")
    public String findAccountBalance(@PathVariable("gpayId") String gpayId){
        return gpayService.findBalance(gpayId);
    }
}
