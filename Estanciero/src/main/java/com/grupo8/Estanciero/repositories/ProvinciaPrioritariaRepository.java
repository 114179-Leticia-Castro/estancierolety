package com.grupo8.Estanciero.repositories;

import com.grupo8.Estanciero.entities.ProvinciaEntity;
import com.grupo8.Estanciero.entities.ProvinciaPrioritariaEntity;
import com.grupo8.Estanciero.models.enums.TipoJugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProvinciaPrioritariaRepository extends JpaRepository<ProvinciaPrioritariaEntity, Integer> {
  List<ProvinciaPrioritariaEntity> findAllByTipoJugador(TipoJugador tipoJugador);
  ProvinciaPrioritariaEntity findByProvincia(ProvinciaEntity provincia);
}
