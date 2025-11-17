package com.controller;

import ch.qos.logback.classic.Logger;
import com.document.Employee;
import com.service.EmployeeService;
import jakarta.validation.Valid;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    Logger logger = (Logger) LoggerFactory.getLogger(EmployeeController.class);

    @PostMapping(value = "store",consumes = MediaType.APPLICATION_JSON_VALUE)
    public String storeEmployee(@Valid @RequestBody Employee employee){
        //try{
        return employeeService.storeEmployee(employee);
        //}catch (Exception e){
         //   return e.toString();
       // }
    }

    @GetMapping(value = "find",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> findAll() {
        List<Employee> employees = employeeService.findAll();
        logger.info("Find All Employees"+employees.size());
        return  employees;
    }

    @GetMapping(value = "exception/{value}")
    public String generateException(@PathVariable("value") int value){
   //     try{
            int result = 100/value;
            logger.info("Exception not generated"+value);
            logger.warn("Don't value zero value it may generated exception");
            return "Exception not generate "+result;
    //    }catch (Exception e){
    //        logger.error("Generate Exception"+e.getMessage());
     //       return "Generate Exception";
     //   }
    }
}
