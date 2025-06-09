package com.grupo8.Estanciero.repositories;

import com.grupo8.Estanciero.entities.EscrituraEntity;
import com.grupo8.Estanciero.entities.PropiedadEntity;
import com.grupo8.Estanciero.entities.ProvinciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscrituraRepository extends JpaRepository<EscrituraEntity, Integer> {
    EscrituraEntity findByPropiedadAndProvincia(PropiedadEntity propiedad, ProvinciaEntity provincia);


}
