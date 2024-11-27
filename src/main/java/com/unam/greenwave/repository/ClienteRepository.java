package com.unam.greenwave.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unam.greenwave.models.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long> {

}
