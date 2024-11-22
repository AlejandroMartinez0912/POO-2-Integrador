package com.unam.greenwave.models;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Pedido {
    private Long id;
    private Double total;
    private LocalDate date;
    private String status;


    private Cliente client;
    private List<DetallePedido> orderDetails;


}
