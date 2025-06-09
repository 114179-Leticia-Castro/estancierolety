package com.grupo8.Estanciero.entities;

import com.grupo8.Estanciero.models.enums.Zona;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "escritura")
@Entity
public class EscrituraEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_escritura")
    private Integer idEscritura;

    @ManyToOne
    @JoinColumn(name = "id_propiedad", nullable = false)
    private PropiedadEntity propiedad;

    @ManyToOne
    @JoinColumn(name = "id_provincia", nullable = false)
    private ProvinciaEntity provincia;

    @Column(name = "zona")
    @Enumerated(EnumType.STRING)
    private Zona zona;

}
