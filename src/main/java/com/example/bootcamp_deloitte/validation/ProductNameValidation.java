package com.example.bootcamp_deloitte.validation;

import com.example.bootcamp_deloitte.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductNameValidation implements ProductValidation {

    @Override
    public void validate(Product product) {
        if (product.getName() == null || product.getName().isBlank()) {
            throw new RuntimeException("O produto deve ter um nome");
        }
    }

}