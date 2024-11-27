package com.unam.greenwave.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unam.greenwave.dto.DetallePedidoRequest;
import com.unam.greenwave.models.Cliente;
import com.unam.greenwave.models.DetallePedido;
import com.unam.greenwave.models.MetodoDePago;
import com.unam.greenwave.models.Pedido;
import com.unam.greenwave.models.Producto;
import com.unam.greenwave.repository.ClienteRepository;
import com.unam.greenwave.repository.DetallePedidoRepository;
import com.unam.greenwave.repository.MetodoDePagoRepository;
import com.unam.greenwave.repository.PedidoRepository;
import com.unam.greenwave.repository.ProductoRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private MetodoDePagoRepository metodoDePagoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }




    public Pedido crearNuevoPedido(Long clienteId, List<DetallePedidoRequest> detallesRequest, Long metodoDePagoId) {
        // Validar cliente
        Cliente cliente = clienteRepository.findById(clienteId)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

        // Validar método de pago
        MetodoDePago metodoPago = metodoDePagoRepository.findById(metodoDePagoId)
                .orElseThrow(() -> new RuntimeException("Método de pago no encontrado"));

        // Crear el pedido
        Pedido pedido = new Pedido();
        pedido.setClient(cliente);
        pedido.setPaymentMethod(metodoPago);
        pedido.setStatus("Pendiente");
        pedido.setDate(LocalDate.now());

        // Procesar detalles del pedido
        List<DetallePedido> detalles = crearDetallesPedido(pedido, detallesRequest);
        pedido.setOrderDetails(detalles);

        // Calcular total del pedido
        double total = detalles.stream()
                .mapToDouble(detalle -> detalle.getCantidad() * detalle.getPrecioUnitario())
                .sum();
        pedido.setTotal(total);

        // Guardar y retornar
        return pedidoRepository.save(pedido);
     }

    private List<DetallePedido> crearDetallesPedido(Pedido pedido, List<DetallePedidoRequest> detallesRequest) {
        List<DetallePedido> detalles = new ArrayList<>();
        for (DetallePedidoRequest detalleRequest : detallesRequest) {
            // Validar producto
            Producto producto = productoRepository.findById(detalleRequest.getProductoId())
                    .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

            // Crear detalle
            DetallePedido detalle = new DetallePedido();
            detalle.setOrder(pedido);
            detalle.setProduct(producto);
            detalle.setCantidad(detalleRequest.getCantidad());
            detalle.setPrecioUnitario(producto.getPrice());

            detalles.add(detalle);
        }
        return detalles;
    }
}

