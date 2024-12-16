package com.lauratraining.shop.adapter.driven.repository;

import com.lauratraining.shop.adapter.driven.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<ProductEntity, Long> {
}
