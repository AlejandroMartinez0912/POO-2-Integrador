package com.unam.greenwave.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class DetallePedidoRequest {

    private Long productoId;
    private Integer cantidad;
}

