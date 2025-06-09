package com.grupo8.Estanciero.models.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public enum Forma {
    CIRCULO("●"),
    CUADRADO("■"),
    TRIANGULO("▲"),
    CORAZON("♥"),
    DIAMANTE("♦");


    //Atributos
    private final String forma;

    Forma(String forma) {
        this.forma = forma;
    }
}
