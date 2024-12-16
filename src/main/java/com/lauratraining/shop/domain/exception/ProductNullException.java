package com.lauratraining.shop.domain.exception;

public class ProductNullException extends RuntimeException{
    //constructor que retorna mensaje
    public ProductNullException(String message) {
        super(message);
    }
}
