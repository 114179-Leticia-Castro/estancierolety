package com.grupo8.Estanciero.entities;

import com.grupo8.Estanciero.models.enums.TipoCarta;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Carta")
public class CartaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_carta")
    private Integer idCarta;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "tipo_carta")
    @Enumerated(EnumType.STRING)
    private TipoCarta tipoCarta;

    @Column(name = "valor")
    private Integer valor;
}
