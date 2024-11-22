package com.unam.greenwave.repository;

import com.unam.greenwave.dto.UsuarioDTO;
import com.unam.greenwave.models.Usuario;

public interface UsuarioRepository {
    Usuario findByUsername(String username);

    Usuario save(UsuarioDTO userDto);

}
