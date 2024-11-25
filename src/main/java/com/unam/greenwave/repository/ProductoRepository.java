package com.unam.greenwave.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unam.greenwave.models.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{   
    
}
