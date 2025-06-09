package com.grupo8.Estanciero.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "Tributario")
@Entity
public class TributarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_tributario")
    private Integer idTributario;

    @ManyToOne
    @JoinColumn(name = "id_casilla", nullable = false)
    private CasillaEntity casilla;

    @Column(name = "monto")
    private Integer monto;

    @Column(name = "descripcion")
    private String descripcion;
}
