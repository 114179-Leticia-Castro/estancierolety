package com.grupo8.Estanciero.models;

import com.grupo8.Estanciero.models.enums.TipoPropiedad;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Propiedad {
    private int id;
    private String nombre;
    private TipoPropiedad tipo;
    private int precio;
    private int alquiler;
    private Jugador propietario;
}
