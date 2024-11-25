package com.unam.greenwave.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unam.greenwave.enums.EstadoPago;
import com.unam.greenwave.models.MetodoDePago;
import com.unam.greenwave.repository.MetodoDePagoRepository;

@Service
public class PagoService {

    @Autowired
    private MetodoDePagoRepository medioDePagoRepository;
    

    /* Carga de pagos manualmente en la base de datos
     * INSERT INTO metodo_de_pago (nombre, descripcion, estado) 
    VALUES 
    ('PayPal', 'Pago mediante cuenta de PayPal', 'ACTIVO'),
    ('Transferencia Bancaria', 'Pago mediante transferencia bancaria', 'INACTIVO'),
    ('Tarjeta MasterCard', 'Pago mediante tarjeta de crédito MasterCard', 'ACTIVO');
     */

    public List<MetodoDePago> obtenerMediosDePagoActivos() {
        return medioDePagoRepository.findByEstado(EstadoPago.ACTIVO);
    }

    public String procesarPago(Long medioDePagoId, Double monto) {
        MetodoDePago medioDePago = medioDePagoRepository.findById(medioDePagoId)
                .orElseThrow(() -> new RuntimeException("Medio de pago no encontrado"));

        if (medioDePago.getEstado() != EstadoPago.ACTIVO) {
            throw new RuntimeException("El medio de pago no está disponible");
        }

        // Simular el procesamiento del pago...
        return "Pago procesado con el medio: " + medioDePago.getName();
    }
}
