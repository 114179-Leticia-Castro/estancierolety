package com.grupo8.Estanciero.entities;

import com.grupo8.Estanciero.models.enums.TipoCasilla;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "casilla")
@Entity
public class CasillaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_casilla")
    private Integer idCasilla;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "tipo_casilla")
    @Enumerated(EnumType.STRING)
    private TipoCasilla tipoCasilla;
}
