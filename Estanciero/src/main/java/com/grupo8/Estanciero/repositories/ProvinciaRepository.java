package com.grupo8.Estanciero.repositories;

import com.grupo8.Estanciero.entities.ProvinciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinciaRepository extends JpaRepository<ProvinciaEntity, Integer> {
    ProvinciaEntity findByProvincia(String provincia);
    // No additional methods are defined here, as the JpaRepository provides basic CRUD operations.
}
