package com.unam.greenwave.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    private long id;
    private String name;
    private String lastname;
    private String email;
    private String province;
    private String city;
    private String postalCode;
    private String address;
    private String numberPhone;

    
    private List<Pedido> pedidos;
    
    

    
}
