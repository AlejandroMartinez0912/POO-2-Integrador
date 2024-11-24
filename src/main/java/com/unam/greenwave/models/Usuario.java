package com.unam.greenwave.models;

import com.unam.greenwave.enums.Rol;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

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
@Table(name = "usuarios")
@Inheritance(strategy = InheritanceType.JOINED)

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String lastname;
    private String email;
    private String password;
    private String phone;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Direccion address;

    @Enumerated(EnumType.STRING)
    private Rol rol;
}

