
package com.portfolioMariano.argentinaPrograma.service;

import com.portfolioMariano.argentinaPrograma.entity.Trabajo;
import com.portfolioMariano.argentinaPrograma.repository.RTrabajo;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class STrabajo {
    @Autowired
    public RTrabajo repoTrabajo;
            
            public List <Trabajo> verTrabajo(){
            List <Trabajo> listaTrabajo = repoTrabajo.findAll();
            return listaTrabajo;
            }
            
            public Trabajo buscarTrabajo(int id){
                Trabajo listaTrabajo = repoTrabajo.findById(id).orElse(null);
                return listaTrabajo;
            }
            
            public void crearTrabajo(Trabajo nuevoTrabajo){
                repoTrabajo.save(nuevoTrabajo);
            }
            
            public void editarTrabajo(Trabajo nuevoTrabajo){
            repoTrabajo.save(nuevoTrabajo);
            }
            
            public void borrarTrabajo(int id){
            repoTrabajo.deleteById(id);
            }
}
