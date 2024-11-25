package com.unam.greenwave.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter @Setter
@NoArgsConstructor
@Entity
public class PaqueteProducto extends Producto {
    @ManyToMany
    @JoinTable(
        name = "paquete_productos",
        joinColumns = @JoinColumn(name = "paquete_id"),
        inverseJoinColumns = @JoinColumn(name = "producto_id")
    )
    private List<ProductoIndividual> productos;

    // Calcular el precio total del paquete
    public Double calcularPrecioPaquete() {
        return productos.stream()
                .mapToDouble(ProductoIndividual::getPrice)
                .sum();
    }

}
