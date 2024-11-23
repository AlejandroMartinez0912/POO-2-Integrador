package com.unam.greenwave.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unam.greenwave.dto.UsuarioDTO;
import com.unam.greenwave.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);

    Usuario save(UsuarioDTO userDto);

}
