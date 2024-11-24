package com.unam.greenwave.services;

import org.springframework.stereotype.Service;

import com.unam.greenwave.models.Usuario;
import com.unam.greenwave.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
}
