
package com.portfolioMariano.argentinaPrograma.repository;

import com.portfolioMariano.argentinaPrograma.entity.Trabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RTrabajo extends JpaRepository <Trabajo, Integer> {
    
}
