package com.example.bootcamp_deloitte.service;

import com.example.bootcamp_deloitte.model.Product;
import com.example.bootcamp_deloitte.repository.ProductRepository;
import com.example.bootcamp_deloitte.validation.ProductValidation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;
    private final List<ProductValidation> validations;

    public ProductService(ProductRepository repository,
                          List<ProductValidation> validations) {
        this.repository = repository;
        this.validations = validations;
    }

    public Product create(Product product) {
        for (ProductValidation validation : validations) {
            validation.validate(product);
        }
        return repository.save(product);
    }

    public List<Product> getAll() {
        return repository.findAll();
    }

    public Product update(Long id, Product product) {
        for (ProductValidation validation : validations) {
            validation.validate(product);
        }
        product.setId(id);
        return repository.save(product);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}