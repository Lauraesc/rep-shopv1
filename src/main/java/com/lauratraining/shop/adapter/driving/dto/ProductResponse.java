package com.lauratraining.shop.adapter.driving.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductResponse {
    private Long id;
    private String name;
    private double price;


}
