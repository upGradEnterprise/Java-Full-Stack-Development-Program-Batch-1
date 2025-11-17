package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<String>> documentPropertyValidation(MethodArgumentNotValidException ex){
        //System.out.println("Something went wrong "+ex.getMessage());
        //HashMap<String,String> errors = new HashMap<>();
        List<String> errorInfo = new ArrayList<>();
        ex.getBindingResult().getAllErrors().forEach((error)->{
            System.err.println(error.getDefaultMessage());
            //errors.put(error.getObjectName(),error.getDefaultMessage());
            errorInfo.add(error.getDefaultMessage());
        });
        return new ResponseEntity(errorInfo, HttpStatus.BAD_REQUEST)  ;
    }

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> arithmetiException(ArithmeticException ex){

        return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST)  ;
    }
}
