package com.lauratraining.shop.adapter.driven.adapter;

import com.lauratraining.shop.adapter.driven.entity.ProductEntity;
import com.lauratraining.shop.adapter.driven.mapper.IProductEntityMapper;
import com.lauratraining.shop.adapter.driven.repository.IProductRepository;
import com.lauratraining.shop.domain.model.Product;
import com.lauratraining.shop.domain.spi.IProductPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


    @RequiredArgsConstructor
    public class ProductAdapter implements IProductPersistencePort {
        private final IProductRepository productRepository;
        private final IProductEntityMapper productMapper;

    @Override
    public Product createProduct(Product product) {
        ProductEntity productEntity = (ProductEntity) productRepository.save(productMapper.toProductEntity(product));

        return productMapper.toProduct(productEntity);
    }

}
