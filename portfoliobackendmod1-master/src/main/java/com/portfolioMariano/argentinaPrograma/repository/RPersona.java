
package com.portfolioMariano.argentinaPrograma.repository;

import com.portfolioMariano.argentinaPrograma.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository <Persona, Integer> {
    
}
