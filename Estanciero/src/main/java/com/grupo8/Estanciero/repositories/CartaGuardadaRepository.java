package com.grupo8.Estanciero.repositories;

import com.grupo8.Estanciero.entities.CartaEntity;
import com.grupo8.Estanciero.entities.CartaGuardadaEntity;
import com.grupo8.Estanciero.entities.JugadorGuardadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CartaGuardadaRepository extends JpaRepository<CartaGuardadaEntity, Integer> {
    CartaGuardadaEntity findByCartaAndJugadorGuardadoAnd(CartaEntity carta, JugadorGuardadoEntity jugadorGuardado);
}
