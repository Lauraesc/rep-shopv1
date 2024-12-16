package com.lauratraining.shop.adapter.driving.controller;


import com.lauratraining.shop.adapter.driving.dto.ProductRequest;
import com.lauratraining.shop.adapter.driving.dto.ProductResponse;
import com.lauratraining.shop.adapter.driving.mapper.IProductDtoMapper;
import com.lauratraining.shop.domain.api.IProductServicePort;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //para decirle que es un controlador
@RequestMapping("/products") //para la ruta
@RequiredArgsConstructor
public class ProductController {

    private final IProductServicePort productServicePort;

    private final IProductDtoMapper productDtoMapper;

    @PostMapping("/")
    public ResponseEntity<ProductResponse> createProducts(@Valid @RequestBody ProductRequest request) {
        return ResponseEntity.ok(productDtoMapper.toProductResponse(productServicePort
                .createProduct(productDtoMapper.toProduct(request))));
    }
}
