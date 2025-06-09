package com.grupo8.Estanciero.models.enums;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public enum Color {
    ROJO("\u001B[31m"),         //Errores
    VERDE("\u001B[32m"),        //Mensajes      -->  Cosas que requieren interaccion de jugador
    AZUL("\u001B[34m"),         //Acciones      -->  Descripciones de cartas, casillas, etc.
    AMARILLO("\u001B[33m"),     //Avisos        -->  Cosas que se realizan automaticamente
    CIAN("\u001B[36m"),         //Informacion   -->  Nombres de Casillas
    VIOLETA("\u001B[35m"),      //Datos         -->  Informacion del jugador
    GRIS("\u001B[37m"),         //Deshabilitado
    BLANCO("\u001B[0m"),        //Por defecto
    NEGRITA("\u001B[1m");

private final String color;

    Color(String color) {
        this.color = color;
    }

}
