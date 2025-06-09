package com.grupo8.Estanciero.entities;

import com.grupo8.Estanciero.models.enums.EstadoPartida;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Partida_Guardada")
public class PartidaGuardadaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_partida_guardada")
    private Integer idPartidaGuardada;

    @ManyToOne
    @JoinColumn(name = "id_jugador_guardado", nullable = false)
    private JugadorGuardadoEntity jugadorGuardado;

    @Column(name = "estado_partida")
    @Enumerated(EnumType.STRING)
    private EstadoPartida estadoPartida;

}
