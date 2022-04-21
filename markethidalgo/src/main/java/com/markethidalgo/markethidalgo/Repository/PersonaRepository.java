package com.markethidalgo.markethidalgo.Repository;

import com.markethidalgo.markethidalgo.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
