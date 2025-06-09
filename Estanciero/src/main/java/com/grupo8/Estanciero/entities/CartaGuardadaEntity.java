package com.grupo8.Estanciero.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Carta_Guardada")
public class CartaGuardadaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_carta_guardada")
    private Integer idCartaGuardada;

    @ManyToOne
    @JoinColumn(name = "id_jugador_guardado", nullable = false)
    private JugadorGuardadoEntity jugadorGuardado;

    @ManyToOne
    @JoinColumn(name = "id_carta", nullable = false)
    private CartaEntity carta;


}
