package com.grupo8.Estanciero.models.players;

import com.grupo8.Estanciero.entities.ProvinciaEntity;
import com.grupo8.Estanciero.models.Jugador;
import com.grupo8.Estanciero.models.enums.TipoJugador;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JugadorVirtual extends Jugador {
    private TipoJugador tipoJugador;
    private List<String> provinciasPrioritarias;

}
