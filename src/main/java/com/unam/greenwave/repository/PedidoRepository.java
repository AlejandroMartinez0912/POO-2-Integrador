package com.unam.greenwave.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unam.greenwave.models.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
