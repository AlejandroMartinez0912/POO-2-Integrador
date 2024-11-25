package com.unam.greenwave.services;

import java.util.List;
import java.util.Optional;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unam.greenwave.enums.Categoria;
import com.unam.greenwave.enums.TipoProducto;
import com.unam.greenwave.models.PaqueteProducto;
import com.unam.greenwave.models.Producto;
import com.unam.greenwave.models.ProductoIndividual;
import com.unam.greenwave.repository.PaqueteProductoRepository;
import com.unam.greenwave.repository.ProductoIndividualRepository;
import com.unam.greenwave.repository.ProductoRepository;

@Service
public class ProductoService {
    @Autowired
    private final ProductoRepository repository;

    @Autowired
    private ProductoIndividualRepository productoIndividualRepository;

    @Autowired
    private PaqueteProductoRepository paqueteProductoRepository;

    public ProductoService(ProductoRepository repository) {
        this.repository = repository;
    }

    public List<Producto> getAllProducts() {
        return repository.findAll();
    }

    public Optional<Producto> getProductById(Long id) {
        return repository.findById(id);
    }

    public Producto createProduct(Producto product) {
        return repository.save(product);
    }

    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }

    public Double aplicarDescuento(Long productoId, Double porcentajeDescuento) {
        Producto producto = repository.findById(productoId)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        producto.setPrice(producto.calcularPrecioConDescuento(porcentajeDescuento));
        return repository.save(producto).getPrice();
    }

    // Crear un producto individual
    public ProductoIndividual crearProductoIndividual(String nombre, Integer stock,  Double precio, Categoria categoria) {
        ProductoIndividual producto = new ProductoIndividual();
        producto.setName(nombre);
        producto.setStock(stock);
        producto.setPrice(precio);
        producto.setCategory(categoria);
        producto.setTipo(TipoProducto.INDIVIDUAL);
        return productoIndividualRepository.save(producto);
    }

    // Crear un paquete de productos
    public PaqueteProducto crearPaqueteProducto(String nombre, List<Long> idsProductos, Double descuento) {
        PaqueteProducto paquete = new PaqueteProducto();
        paquete.setName(nombre);
        paquete.setTipo(TipoProducto.PAQUETE);

        List<ProductoIndividual> productos = productoIndividualRepository.findAllById(idsProductos);
        if (productos.isEmpty()) {
            throw new RuntimeException("Los productos del paquete no existen");
        }

        paquete.setProductos(productos);

        // Calcular el precio del paquete con descuento
        Double precioTotal = productos.stream()
                .mapToDouble(ProductoIndividual::getPrice)
                .sum();
        paquete.setPrice(precioTotal - (precioTotal * descuento / 100));

        return paqueteProductoRepository.save(paquete);
    }
}
