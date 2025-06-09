package com.grupo8.Estanciero.entities;

import com.grupo8.Estanciero.models.enums.TipoJugador;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Provincia_Prioritaria")
public class ProvinciaPrioritariaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_provincia_prioritaria")
    private Integer idProvinciaPrioritaria;

    @ManyToOne
    @JoinColumn(name = "id_provincia", nullable = false)
    private ProvinciaEntity provincia;

    @Column(name = "tipo_jugador", nullable = false)
    private TipoJugador tipoJugador;
}
