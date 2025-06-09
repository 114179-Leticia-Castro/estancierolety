package com.grupo8.Estanciero.repositories;

import com.grupo8.Estanciero.entities.CasillaEntity;
import com.grupo8.Estanciero.entities.PropiedadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface PropiedadRepository extends JpaRepository<PropiedadEntity, Integer> {

    Optional<PropiedadEntity> findByCasilla_IdCasilla(Integer idCasilla);
    PropiedadEntity findByCasilla(CasillaEntity casilla);
}
