package com.example.bootcamp_deloitte.service;

import com.example.bootcamp_deloitte.model.Product;
import com.example.bootcamp_deloitte.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ProductServiceTest {

    @Mock
    ProductRepository repository;

    @InjectMocks
    private ProductService service;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Should create a product succesfully")
    void createProductCase1() {
        Product product = new Product(null, "Mouse", 17.99, 10);
        when(repository.save(product)).thenReturn(product);
        Product result = service.create(product);
        assertEquals("Mouse", result.getName());
        verify(repository, times(1)).save(product);
    }

    @Test
    @DisplayName("Should throw exception when create fails")
    void createProductCase2() {
        Product product = new Product(null, "Mouse", 17.99, 10);
        when(repository.save(product)).thenThrow(new RuntimeException());
        assertThrows(RuntimeException.class, () -> {
            service.create(product);
        });
    }

    @Test
    @DisplayName("Should list the products succesfully")

    void getProductsCase1() {
        Product p1 = new Product(1L, "Mouse", 17.99, 10);
        Product p2 = new Product(2L, "Teclado", 55.00, 5);
        when(repository.findAll()).thenReturn(List.of(p1, p2));
        List<Product> products = service.getAll();
        assertEquals(2, products.size());
        verify(repository).findAll();
    }

    @Test
    @DisplayName("Should throw exception when list fails")
    void getProductsCase2() {
        when(repository.findAll()).thenReturn(List.of());
        List<Product> products = service.getAll();
        assertTrue(products.isEmpty());
    }

    @Test
    @DisplayName("Should update a product succesfully")
    void updateProductCase1() {
        Product product = new Product(null, "Mouse", 17.99, 10);
        when(repository.save(any())).thenReturn(product);
        Product updated = service.update(1L, product);
        assertEquals("Mouse", updated.getName());
        verify(repository).save(product);
    }

    @Test
    @DisplayName("Should throw exception when update fails")
    void updateProductCase2() {
        Product product = new Product(null, "Mouse", 17.99, 10);
        when(repository.save(any())).thenThrow(new RuntimeException());
        assertThrows(RuntimeException.class, () -> {
            service.update(1L, product);
        });
    }

    @Test
    @DisplayName("Should delete a product succesfully")
    void deleteProductCase1() {
        Long id = 1L;
        service.delete(id);
        verify(repository, times(1)).deleteById(id);
    }

    @Test
    @DisplayName("Should throw exception when delete fails")
    void deleteProductCase2() {
        Long id = 1L;
        doThrow(new RuntimeException()).when(repository).deleteById(id);
        assertThrows(RuntimeException.class, () -> {
            service.delete(id);
        });
    }
}
