
package com.portfolioMariano.argentinaPrograma.service;

import com.portfolioMariano.argentinaPrograma.entity.Persona;
import com.portfolioMariano.argentinaPrograma.repository.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona {
    @Autowired
    public RPersona repoPersona;
    
    public List <Persona> verPersona(){
    List<Persona> lista = repoPersona.findAll();
            return lista;
    }
    
    public Persona buscarPersona (int id){
        Persona lista = repoPersona.findById(id).orElse(null);
                return lista;
    }
    
    public void crear(Persona var){
   repoPersona.save(var);
    }
    
    public void borrar(int id){
    repoPersona.deleteById(id);
    }
    
    public void editar(Persona var){
    repoPersona.save(var);
    }
    
}
