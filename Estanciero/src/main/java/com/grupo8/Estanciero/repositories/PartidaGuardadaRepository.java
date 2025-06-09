package com.grupo8.Estanciero.repositories;

import com.grupo8.Estanciero.entities.PartidaGuardadaEntity;
import com.grupo8.Estanciero.models.enums.EstadoPartida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidaGuardadaRepository extends JpaRepository<PartidaGuardadaEntity, Integer> {

    PartidaGuardadaEntity findByEstadoPartida(EstadoPartida estadoPartida);
}
