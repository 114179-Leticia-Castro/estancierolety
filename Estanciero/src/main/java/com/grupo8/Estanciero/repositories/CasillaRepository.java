package com.grupo8.Estanciero.repositories;

import com.grupo8.Estanciero.entities.CasillaEntity;
import com.grupo8.Estanciero.models.enums.TipoCasilla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CasillaRepository extends JpaRepository<CasillaEntity, Integer> {

    CasillaEntity findByNombre(String nombre);
    boolean existsByTipoCasilla(TipoCasilla tipoCasilla);
    // Aquí puedes agregar métodos específicos para CasillaEntity si es necesario
}
