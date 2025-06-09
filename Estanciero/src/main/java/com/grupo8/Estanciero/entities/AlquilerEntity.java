package com.grupo8.Estanciero.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "Alquiler")
@Entity
public class AlquilerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_alquiler")
    private Integer idAlquiler;

    @ManyToOne
    @JoinColumn(name = "id_propiedad", nullable = false)
    private PropiedadEntity propiedad;

    @Column(name="alquiler_1")
    private Integer alquiler1;

    @Column(name="alquiler_2")
    private Integer alquiler2;

    @Column(name="alquiler_3")
    private Integer alquiler3;

    @Column(name="alquiler_4")
    private Integer alquiler4;

    @Column(name="alquiler_5")
    private Integer alquiler5;

    @Column(name="alquiler_6")
    private Integer alquiler6;

}
