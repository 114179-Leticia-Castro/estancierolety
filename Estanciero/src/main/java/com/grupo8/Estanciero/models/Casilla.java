package com.grupo8.Estanciero.models;

import com.grupo8.Estanciero.models.enums.TipoCasilla;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Casilla {
    private int id;
    private String nombre;
    private TipoCasilla tipo;
}
