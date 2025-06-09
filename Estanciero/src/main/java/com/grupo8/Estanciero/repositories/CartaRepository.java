package com.grupo8.Estanciero.repositories;

import com.grupo8.Estanciero.entities.CartaEntity;
import com.grupo8.Estanciero.models.enums.TipoCarta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaRepository extends JpaRepository<CartaEntity, Integer> {
    CartaEntity findByTipoCarta(TipoCarta tipoCarta);
}
