package com.lauratraining.shop.adapter.driven.mapper;


import com.lauratraining.shop.adapter.driven.entity.ProductEntity;
import com.lauratraining.shop.domain.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IProductEntityMapper {

    ProductEntity toProductEntity(Product product);
    Product toProduct(ProductEntity productEntity);
}
