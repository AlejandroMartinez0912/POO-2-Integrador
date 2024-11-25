package com.unam.greenwave.dto;

import com.unam.greenwave.enums.Categoria;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class ProductoIndividualDTO {
    private String name;
    private Double price;
    private Integer stock;
    private Categoria category;

}
