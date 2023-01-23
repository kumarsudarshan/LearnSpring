package com.learn.spring.hibernate.exception.advice;

import com.learn.spring.hibernate.exception.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyControllerAdvice {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<String> handleNonPositiveIdInput(BusinessException businessException) {
        return new ResponseEntity<String>("Id can't be negative or zero.", HttpStatus.BAD_REQUEST);
    }
}
