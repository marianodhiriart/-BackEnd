
package com.portfolioMariano.argentinaPrograma.service;

import com.portfolioMariano.argentinaPrograma.entity.Educacion;
import com.portfolioMariano.argentinaPrograma.repository.REducacion;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion {
    @Autowired
    public REducacion repoEducacion;
    
    public List <Educacion> verEducacion(){
        List <Educacion> listaEducacion = repoEducacion.findAll();
        return listaEducacion;
}
    
    public Educacion buscarEducacion(int id){
        Educacion listaEducacion = repoEducacion.findById(id).orElse(null) ;
        return listaEducacion;
    }
    
    public void crearEducacion(Educacion nuevaEducacion){
    repoEducacion.save(nuevaEducacion);
    }
    
    public void editarEducacion(Educacion nuevaEducacion){
    repoEducacion.save(nuevaEducacion);
    }
    
    public void borrarEducacion(int id){
        repoEducacion.deleteById(id);
    }
    
}
