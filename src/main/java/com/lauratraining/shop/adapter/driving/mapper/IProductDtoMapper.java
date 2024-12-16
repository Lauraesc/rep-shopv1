package com.lauratraining.shop.adapter.driving.mapper;


import com.lauratraining.shop.adapter.driving.dto.ProductRequest;
import com.lauratraining.shop.adapter.driving.dto.ProductResponse;
import com.lauratraining.shop.domain.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IProductDtoMapper {

    Product toProduct(ProductRequest productRequest);
    ProductResponse toProductResponse(Product product);

}
