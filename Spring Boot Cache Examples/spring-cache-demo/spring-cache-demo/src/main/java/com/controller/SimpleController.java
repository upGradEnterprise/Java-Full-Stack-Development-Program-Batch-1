package com.controller;

import com.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @Autowired
    SimpleService simpleService;

    @GetMapping(value = "cache")
    public String simpleCachingController() {
        return simpleService.getDataFromService();
    }
    @GetMapping(value = "findProduct/{pid}")
    public String findProduct(@PathVariable int pid) {
        return simpleService.findProductFromDao(pid);
    }
    @GetMapping(value = "updateProduct/{pid}")
    public String updateProduct(@PathVariable int pid) {
        return simpleService.updateCache(pid);
    }
}
