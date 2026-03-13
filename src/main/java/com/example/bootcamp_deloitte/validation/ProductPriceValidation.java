package com.example.bootcamp_deloitte.validation;

import com.example.bootcamp_deloitte.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductPriceValidation implements ProductValidation {

    @Override
    public void validate(Product product) {
        if (product.getPrice() <= 0) {
            throw new RuntimeException("O preço deve ser maior que zero");
        }
    }

}