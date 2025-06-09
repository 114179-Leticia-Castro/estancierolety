package com.grupo8.Estanciero.repositories;

import com.grupo8.Estanciero.entities.JugadorGuardadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorGuardadoRepository extends JpaRepository<JugadorGuardadoEntity, Integer> {

    JugadorGuardadoEntity findByNombre(String nombre);


}
