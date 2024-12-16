package com.lauratraining.shop.domain.model;

import lombok.*;

@AllArgsConstructor //para inicizalizar atributos final
@NoArgsConstructor
@Data //para getters y setters, builder, equals, hashcode, tostring, etc.
public class Product {
    private long id;
    private String name;
    private String description;
    private double price;
    private int stock;

}
