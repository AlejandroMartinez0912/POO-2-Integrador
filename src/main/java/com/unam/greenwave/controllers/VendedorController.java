package com.unam.greenwave.controllers;

import com.unam.greenwave.enums.Categoria;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VendedorController {
    @GetMapping("/vendedor")
    public String showProductForm(Model model) {
        // Agregar las categorías al modelo
        model.addAttribute("categorias", Categoria.values());
        return "producto/vendedor"; // Apunta a src/main/resources/templates/producto/vendedor.html
    }
}
