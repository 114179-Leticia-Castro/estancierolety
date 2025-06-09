package com.grupo8.Estanciero.repositories;

import com.grupo8.Estanciero.entities.JugadorGuardadoEntity;
import com.grupo8.Estanciero.entities.PropiedadEntity;
import com.grupo8.Estanciero.entities.PropiedadGuardadaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropiedadGuardadaRepository extends JpaRepository<PropiedadGuardadaEntity, Integer> {

    PropiedadGuardadaEntity findByPropiedadAndJugadorGuardado(PropiedadEntity propiedad, JugadorGuardadoEntity jugadorGuardado);// Aquí puedes agregar métodos específicos si es necesario

}
