package com.unam.greenwave.services;

import com.unam.greenwave.dto.UsuarioDTO;
import com.unam.greenwave.models.Usuario;

public interface UsuarioService {
    Usuario buscarPorNombre(String name);
    Usuario buscarPorNombreYApellido(String name, String lastname);
    Usuario buscarPorApellido(String lastname);
    Usuario buscarPorEmail(String email);
    
    Usuario guardar(UsuarioDTO userDTO);
}
