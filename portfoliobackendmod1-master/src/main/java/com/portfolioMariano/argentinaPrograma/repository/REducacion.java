
package com.portfolioMariano.argentinaPrograma.repository;

import com.portfolioMariano.argentinaPrograma.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository <Educacion, Integer> {
    
}
