package com.lauratraining.shop.domain.exception;

public class NameEmptyException extends RuntimeException {
    public NameEmptyException(String message) {
        super(message);
    }
}
