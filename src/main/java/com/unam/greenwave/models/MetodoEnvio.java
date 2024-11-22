package com.unam.greenwave.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString @NoArgsConstructor @AllArgsConstructor
public class MetodoEnvio {
    private long id;
    private String tipoEnvio;
}
