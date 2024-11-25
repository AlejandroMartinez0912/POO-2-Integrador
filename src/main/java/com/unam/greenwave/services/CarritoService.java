package com.unam.greenwave.services;

/* import org.springframework.beans.factory.annotation.Autowired;

import com.unam.greenwave.models.Carrito;
import com.unam.greenwave.models.Producto;
import com.unam.greenwave.models.ProductoCarrito;
import com.unam.greenwave.repository.CarritoRepository;
import com.unam.greenwave.repository.ProductoCarritoRepository;
import com.unam.greenwave.repository.ProductoRepository;
 */
public class CarritoService {

    /* private final CarritoRepository carritoRepository;
    private final ProductoRepository productoRepository;
    private final ProductoCarritoRepository productoCarritoRepository;

    @Autowired
    public CarritoService(CarritoRepository carritoRepository,
            ProductoRepository productoRepository,
            ProductoCarritoRepository productoCarritoRepository) {
        this.carritoRepository = carritoRepository;
        this.productoRepository = productoRepository;
        this.productoCarritoRepository = productoCarritoRepository;
    }

    public Carrito agregarProductoAlCarrito(Long carritoId, Long productoId, int cantidad) {
        Carrito carrito = carritoRepository.findById(carritoId)
                .orElseThrow(() -> new RuntimeException("Carrito no encontrado"));

        Producto producto = productoRepository.findById(productoId)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        if (producto.getStock() < cantidad) {
            throw new RuntimeException("Stock insuficiente");
        }

        ProductoCarrito productoCarrito = carrito.getProductos().stream()
                .filter(pc -> pc.getProducto().getId().equals(productoId))
                .findFirst()
                .orElse(new ProductoCarrito());

        productoCarrito.setProducto(producto);
        productoCarrito.setCarrito(carrito);
        productoCarrito.setCantidad(productoCarrito.getCantidad() != null
                ? productoCarrito.getCantidad() + cantidad
                : cantidad);

        carrito.getProductos().add(productoCarrito);
        productoCarritoRepository.save(productoCarrito);

        carrito.setTotal(carrito.getProductos().stream()
                .mapToDouble(pc -> pc.getProducto().getPrecio() * pc.getCantidad())
                .sum());

        return carritoRepository.save(carrito);
    } */

}
