package com.lauratraining.shop.domain.spi;

import com.lauratraining.shop.domain.model.Product;

public interface IProductPersistencePort {
    Product createProduct(Product product);
}
