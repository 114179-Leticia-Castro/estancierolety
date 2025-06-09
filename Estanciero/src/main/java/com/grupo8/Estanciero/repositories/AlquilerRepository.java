package com.grupo8.Estanciero.repositories;

import com.grupo8.Estanciero.entities.AlquilerEntity;
import com.grupo8.Estanciero.entities.PropiedadEntity;
import com.grupo8.Estanciero.entities.ProvinciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlquilerRepository extends JpaRepository<AlquilerEntity, Integer> {
    AlquilerEntity findByPropiedadAndNivel(PropiedadEntity propiedad, Integer nivel);


}
