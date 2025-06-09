package com.grupo8.Estanciero.console;

import com.grupo8.Estanciero.models.enums.Color;

import java.util.Scanner;

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

    public static String ConsultarCadena(String mensaje){
        Scanner input = new Scanner(System.in);

        System.out.print(Color.VERDE + "\nJUEGO: " + Color.BLANCO + mensaje + "\nRespuesta: ");
        String respuesta = input.nextLine(); //Se que esto es redundante y podria ir directo en el return... Igual me gusta asi

        return respuesta;
    }

    public static int ConsultarNumero(String mensaje, int min, int max){
        Scanner input = new Scanner(System.in);

        System.out.print(Color.VERDE + "\nJUEGO: " + Color.BLANCO + mensaje + "\nRespuesta: ");
        int respuesta = ValidarEntrada(input.nextLine(), min, max); //Se que esto es redundante y podria ir directo en el return... Igual me gusta asi (again)

        return respuesta;
    }

    private static int ValidarEntrada(String entrada, int min, int max) {
        Scanner input = new Scanner(System.in);
        int respuesta;

        //Intenta convertir la entrada a un int, si es posible valida que este dentro del rango solicitado
        try{
            respuesta = Integer.parseInt(entrada);

            //Valida que el numero este dentro del rango aceptado o envia un mensaje de error y pide ingresar un valor nuevamente
            if (respuesta < min || respuesta > max) {
                MostrarError("Ingrese un numero del " + min + " al " + max + ": ");
                respuesta = ValidarEntrada(input.nextLine(), min, max);
            }
        }

        //Si la entrada no es un numero informa del error y solicita ingresarla nuevamente
        catch (Exception e){
            MostrarError("La respuesta \"" + entrada + "\" no es aceptable. Ingrese un numero del " + min + " al " + max + ": ");
            respuesta = ValidarEntrada(input.nextLine(), min, max);
        }

        //Si la entrada es correcta la devuelve como un numero entero
        return respuesta;
    }


}
