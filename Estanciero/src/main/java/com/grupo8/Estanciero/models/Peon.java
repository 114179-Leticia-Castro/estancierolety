package com.grupo8.Estanciero.models;

import com.grupo8.Estanciero.models.enums.Color;
import com.grupo8.Estanciero.models.enums.Forma;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Peon {

    private Color color;
    private Forma forma;
}
