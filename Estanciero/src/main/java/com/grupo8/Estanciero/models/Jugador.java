package com.grupo8.Estanciero.models;

import com.grupo8.Estanciero.models.enums.Estado;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jugador {

    protected String nombre;
    protected int dinero;
    protected int posicion;
    protected Estado estado;
    protected int turnoEstado;
    protected List<Carta> cartas;
    protected Peon peon;

}
