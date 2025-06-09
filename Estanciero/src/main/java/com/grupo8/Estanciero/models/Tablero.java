package com.grupo8.Estanciero.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Tablero {
    private static Tablero partida;
    private Jugador jugadorActual;
    private List<Jugador> jugadores;
    private List<Casilla> casillas;
    private Mazo mazoSuerte;
    private Mazo mazoDestino;
    private int cantidadGanadora;
    private List<Jugador> resultado;
}
