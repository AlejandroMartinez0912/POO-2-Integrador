package com.unam.greenwave.dto;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class PaqueteProductoDTO {
    private String name;
    private List<Long>idsProductos;
    private Double descuento;

}
