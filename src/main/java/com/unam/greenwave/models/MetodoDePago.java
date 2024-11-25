package com.unam.greenwave.models;

import com.unam.greenwave.enums.EstadoPago;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Entity
public class MetodoDePago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    
    @Enumerated(EnumType.STRING)
    private EstadoPago estado; // ACTIVO o INACTIVO

    @OneToOne(mappedBy = "paymentMethod", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Pedido order;


}
