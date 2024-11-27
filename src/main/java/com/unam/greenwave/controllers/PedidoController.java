package com.unam.greenwave.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unam.greenwave.dto.DetallePedidoRequest;
import com.unam.greenwave.models.Pedido;
import com.unam.greenwave.services.PedidoService;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public ResponseEntity<Pedido> crearPedido(
            @RequestParam Long clienteId,
            @RequestBody List<DetallePedidoRequest> detallesRequest,
            @RequestParam Long metodoDePagoId) {
        Pedido pedido = pedidoService.crearNuevoPedido(clienteId, detallesRequest, metodoDePagoId);
        return ResponseEntity.status(HttpStatus.CREATED).body(pedido);
    }

}
