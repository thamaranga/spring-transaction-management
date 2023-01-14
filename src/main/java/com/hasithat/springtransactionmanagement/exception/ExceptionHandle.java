package com.hasithat.springtransactionmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@RestControllerAdvice
public class ExceptionHandle {

    //Handle PromoCodeException
    @ExceptionHandler(PromoCodeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handlePromoCodeException(PromoCodeException ex) {
        return ex.getMessage();
    }


}
