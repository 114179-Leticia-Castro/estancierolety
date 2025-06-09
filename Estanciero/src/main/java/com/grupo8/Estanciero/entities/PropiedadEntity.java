package com.grupo8.Estanciero.entities;

import com.grupo8.Estanciero.models.enums.TipoPropiedad;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "propiedad")
public class PropiedadEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_propiedad")
    private Integer idPropiedad;

    @ManyToOne
    @JoinColumn(name = "id_casilla", nullable = false)
    private CasillaEntity casilla;

    @Column(name = "tipo_propiedad")
    @Enumerated(EnumType.STRING)
    private TipoPropiedad tipoPropiedad;

    @Column(name = "propiedad")
    private String propiedad;

    @Column(name = "precio")
    private Integer precio;

    @Column(name = "valor_hipoteca")
    private Integer valorHipoteca;

}
