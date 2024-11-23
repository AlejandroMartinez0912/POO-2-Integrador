package com.unam.greenwave.repository;

import com.unam.greenwave.dto.UsuarioDTO;
import com.unam.greenwave.models.Usuario;

public interface UsuarioRepository {
    Usuario buscarPorNombre(String name);
    Usuario buscarPorNombreYApellido(String name, String lastname);
    Usuario buscarPorApellido(String lastname);
    Usuario buscarPorEmail(String email);

    Usuario guardar(UsuarioDTO userDto);

}
