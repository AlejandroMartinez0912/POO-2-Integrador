package com.unam.greenwave.dto;

import com.unam.greenwave.enums.Rol;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class UsuarioDTO {
    private String name;
    private String lastname;
    private String email;
    private String password;
    private Rol rol;
    
}
