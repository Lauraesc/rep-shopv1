package com.lauratraining.shop.domain.api.usecase;

import com.lauratraining.shop.domain.api.IProductServicePort;
import com.lauratraining.shop.domain.exception.NameEmptyException;
import com.lauratraining.shop.domain.exception.ProductNullException;
import com.lauratraining.shop.domain.model.Product;
import com.lauratraining.shop.domain.spi.IProductPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@RequiredArgsConstructor
public class ProductUseCase implements IProductServicePort {

    private final IProductPersistencePort productPersistencePort; //inyección de dependencias

    //polimorfismo para buenas practicas
    @Override //debe estar sobreescrito por buena practica
   public Product createProduct(Product product) {
        if (product == null) {
            throw new ProductNullException("El producto no puede ser nulo");
        }
        if (product.getName().isEmpty()) {
            throw new NameEmptyException("El nombre del producto no puede ser nulo o vacío");
        }

        return productPersistencePort.createProduct(product);

   }
}
