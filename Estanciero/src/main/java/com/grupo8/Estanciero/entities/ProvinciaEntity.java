package com.grupo8.Estanciero.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Provincia")
public class ProvinciaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_provincia")
    private Integer idProvincia;

    @Column(name = "provincia")
    private String provincia;
}
