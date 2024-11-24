package com.unam.greenwave.models;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Vendedor extends Usuario{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Producto> inventario;



 
    /* public boolean registrarProducto(Producto producto){
        if (producto != null && !producto.contains(producto)){
            productos.add(producto);
            return true;
        }
        return false;
    }
      
    public boolean eliminarProdcuto(Producto producto){
        return producto.remove(producto);
    }
    
    public boolean editarProducto(Producto producto, Producto nuevoProducto){
        int index = productos.indexOf(producto);
        if (index != -1){
            productos.set(index, nuevoProducto);
            return true;
        }
        return false;
    }
    
    public List<Producto> listarProductos(){
        return new ArrayList<>(productos);
    } */
 
  
}
