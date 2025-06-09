package com.grupo8.Estanciero.repositories;

import com.grupo8.Estanciero.entities.CasillaEntity;
import com.grupo8.Estanciero.entities.TributarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TributarioRepository extends JpaRepository<TributarioEntity, Integer> {

    TributarioEntity findByCasilla(CasillaEntity casilla);
}
