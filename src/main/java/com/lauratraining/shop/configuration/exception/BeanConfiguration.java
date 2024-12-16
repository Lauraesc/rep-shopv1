package com.lauratraining.shop.configuration.exception;


import com.lauratraining.shop.adapter.driven.adapter.ProductAdapter;
import com.lauratraining.shop.adapter.driven.mapper.IProductEntityMapper;
import com.lauratraining.shop.adapter.driven.repository.IProductRepository;
import com.lauratraining.shop.domain.api.IProductServicePort;
import com.lauratraining.shop.domain.api.usecase.ProductUseCase;
import com.lauratraining.shop.domain.spi.IProductPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    //private final IProductRepository productRepository;
    //private final IProductEntityMapper productMapper;

    @Bean
    public IProductServicePort productServicePort(IProductPersistencePort productPersistencePort) {
        return new ProductUseCase(productPersistencePort);
    }

    @Bean
    public IProductPersistencePort productPersistencePort(IProductRepository productRepository, IProductEntityMapper productMapper) {
        return new ProductAdapter(productRepository, productMapper);
    }

}
