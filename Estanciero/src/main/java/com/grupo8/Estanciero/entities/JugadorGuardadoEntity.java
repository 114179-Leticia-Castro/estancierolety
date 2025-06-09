package com.grupo8.Estanciero.entities;

import com.grupo8.Estanciero.models.enums.Color;
import com.grupo8.Estanciero.models.enums.Estado;
import com.grupo8.Estanciero.models.enums.Forma;
import com.grupo8.Estanciero.models.enums.TipoJugador;
import jakarta.persistence.*;

import lombok.Data;


@Data
@Entity
@Table(name = "Jugador_Guardado")

public class JugadorGuardadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_jugador_guardado")
    private Integer idJugadorGuardado;

    @Column(name = "tipo_jugador")
    @Enumerated(EnumType.STRING)
    private TipoJugador tipoJugador;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "dinero")
    private Integer dinero;

    @Column(name = "posicion")
    private String posicion;

    @Column(name = "estado")
    @Enumerated(EnumType.STRING)
    private Estado estado;

    @Column(name = "turno_estado")
    private Integer turnoEstado;

    @Column(name = "forma")
    @Enumerated(EnumType.STRING)
    private Forma forma;

    @Column(name = "color")
    @Enumerated(EnumType.STRING)
    private Color color;


}
