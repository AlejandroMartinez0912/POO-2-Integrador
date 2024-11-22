package com.unam.greenwave.models;

import com.unam.greenwave.enums.RolEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Usuario {
    @Id
    private long id;
    private String name;
    private String lastname;
    private String email;
    private String password;
    private RolEnum rol;
}
