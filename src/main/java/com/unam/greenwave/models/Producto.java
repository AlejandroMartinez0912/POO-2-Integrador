package com.unam.greenwave.models;

import java.util.List;

import com.unam.greenwave.enums.Categoria;
import com.unam.greenwave.enums.TipoProducto;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer stock;
    private Double price;

    @OneToMany(mappedBy = "product")
    private List<DetallePedido> orderDetails;
    
    @Enumerated(EnumType.STRING)
    private Categoria category;

    @Enumerated(EnumType.STRING)
    private TipoProducto tipo; // INDIVIDUAL o PAQUETE

    @ManyToOne
    private Vendedor seller;


    public Double calcularPrecioConDescuento(Double descuento) {
        return price - (price * (descuento / 100));
    }

}
