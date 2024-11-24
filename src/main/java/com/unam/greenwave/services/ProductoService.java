package com.unam.greenwave.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.unam.greenwave.models.Producto;
import com.unam.greenwave.repository.ProductoRepository;

@Service
public class ProductoService {
    private final ProductoRepository repository;

    public ProductoService(ProductoRepository repository) {
        this.repository = repository;
    }

    public List<Producto> getAllProducts() {
        return repository.findAll();
    }

    public Optional<Producto> getProductById(Long id) {
        return repository.findById(id);
    }

    public Producto createProduct(Producto product) {
        return repository.save(product);
    }

    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }
}
