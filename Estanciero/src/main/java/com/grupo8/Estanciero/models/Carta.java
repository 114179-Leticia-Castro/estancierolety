package com.grupo8.Estanciero.models;

import com.grupo8.Estanciero.models.enums.TipoCarta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carta {
    protected Integer id;
    protected String descripcion;
    protected TipoCarta tipoCarta;
}
