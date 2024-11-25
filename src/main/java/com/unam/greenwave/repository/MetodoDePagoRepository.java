package com.unam.greenwave.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unam.greenwave.enums.EstadoPago;
import com.unam.greenwave.models.MetodoDePago;

public interface MetodoDePagoRepository extends JpaRepository<MetodoDePago, Long> {

    List<MetodoDePago> findByEstado(EstadoPago estado);

}
