package com.lauratraining.shop.configuration.exception;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ExceptionCodeResponse {
    private String message;
    private Integer code;
    private String status;
    private String timestamp;

}
