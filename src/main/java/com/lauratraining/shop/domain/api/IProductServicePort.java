package com.lauratraining.shop.domain.api;

import com.lauratraining.shop.domain.model.Product;
 //POST: tomar un producto y llevarlo para que se guarde a una bd

public interface IProductServicePort {
    Product createProduct(Product product);
}
