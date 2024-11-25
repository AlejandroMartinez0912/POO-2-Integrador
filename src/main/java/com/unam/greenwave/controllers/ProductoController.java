package com.unam.greenwave.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unam.greenwave.dto.PaqueteProductoDTO;
import com.unam.greenwave.dto.ProductoIndividualDTO;
import com.unam.greenwave.enums.Categoria;
import com.unam.greenwave.models.MetodoDePago;
import com.unam.greenwave.models.PaqueteProducto;
import com.unam.greenwave.models.Producto;
import com.unam.greenwave.models.ProductoIndividual;
import com.unam.greenwave.services.PagoService;
import com.unam.greenwave.services.ProductoService;

@RestController
@RequestMapping("/api/products")
public class ProductoController {

    
    @Autowired
    private final ProductoService service;
    
    @Autowired
    private PagoService pagoService;
    
    public ProductoController(ProductoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Producto> getAllProducts() {
        return service.getAllProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> getProductById(@PathVariable Long id) {
        return service.getProductById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    /* @PostMapping
    public Producto createProduct(@RequestBody Producto product) {
        return service.createProduct(product); 
    } */

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        service.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }


    // Endpoint para crear un producto individual
    @PostMapping("/individual")
    public ResponseEntity<ProductoIndividual> crearProductoIndividual(@RequestBody ProductoIndividualDTO productoDTO) {
        ProductoIndividual producto = service.crearProductoIndividual(
            productoDTO.getName(),
            productoDTO.getStock(),
            productoDTO.getPrice(),
            productoDTO.getCategory()
    );        return ResponseEntity.status(HttpStatus.CREATED).body(producto);
    }

    // Endpoint para crear un paquete de productos
    @PostMapping("/paquete")
    public ResponseEntity<PaqueteProducto> crearPaqueteProducto(@RequestBody PaqueteProductoDTO paqueteDTO) {
        PaqueteProducto paquete = service.crearPaqueteProducto(
            paqueteDTO.getName(),
            paqueteDTO.getIdsProductos(),
            paqueteDTO.getDescuento()
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(paquete);
    }


    @GetMapping("/{id}/descuento")
    public ResponseEntity<Double> aplicarDescuento(@PathVariable Long id, @RequestParam Double descuento) {
        Double precioConDescuento = service.aplicarDescuento(id, descuento);
        return ResponseEntity.ok(precioConDescuento);
    }

    @GetMapping("/medios-pago")
    public ResponseEntity<List<MetodoDePago>> obtenerMediosDePago() {
        List<MetodoDePago> medios = pagoService.obtenerMediosDePagoActivos();
        return ResponseEntity.ok(medios);
    }

    @PostMapping("/pagar")
    public ResponseEntity<String> procesarPago(@RequestParam Long medioDePagoId, @RequestParam Double monto) {
        String resultado = pagoService.procesarPago(medioDePagoId, monto);
        return ResponseEntity.ok(resultado);
    } 
}
