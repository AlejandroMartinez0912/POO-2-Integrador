package com.unam.greenwave.repository;

import java.util.List;
import java.util.Optional;

import com.unam.greenwave.models.Producto;

public interface ProductoRepository {   
    List<Producto> findAll();
    Optional<Producto> findById(Long id);
    Producto save(Producto product);
    void deleteById(Long id);
}
