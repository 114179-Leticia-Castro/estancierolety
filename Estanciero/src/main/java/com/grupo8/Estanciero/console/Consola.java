package com.grupo8.Estanciero.console;

import com.grupo8.Estanciero.models.enums.Color;

public class Consola {
    public static void MostrarMensaje(String mensaje){
        System.out.println(Color.VERDE + "\nJUEGO: "+ Color.BLANCO + mensaje);
    }

    public static void MostrarInformacion(String mensaje) {
        System.out.println("\n" + Color.AZUL + mensaje.toUpperCase() + Color.BLANCO);
    }

    public static void MostrarAviso(String mensaje){
        System.out.println(Color.AMARILLO + "\nAVISO: " + Color.BLANCO + mensaje);
    }

    public static void MostrarError(String mensaje) {
        System.out.print(Color.ROJO + "\nError...\n"+ mensaje + Color.BLANCO);
    }

}
