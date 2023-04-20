
package com.portfolioMariano.argentinaPrograma.controller;

import com.portfolioMariano.argentinaPrograma.entity.Persona;
import com.portfolioMariano.argentinaPrograma.service.SPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persona")
@CrossOrigin (origins = "https://ejemplo2-ejemplo2.web.app")
public class CPersona {
    @Autowired
    SPersona servicioPersona;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Persona> verPersona(){
        return servicioPersona.verPersona();
}
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Persona verPersona(@PathVariable int id){
        return servicioPersona.buscarPersona(id);
    }
    
    @PostMapping("/crear")
    public String crearPersona(@RequestBody Persona nuevaPersona){
        servicioPersona.crear(nuevaPersona);
        return "Dato creado.";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String borrarPersona(@PathVariable int id){
    servicioPersona.borrar(id);
    return "Dato borrado.";
    }
    
    @PutMapping("/editar/{id}")
    public String editarPersona(@RequestBody Persona nuevaPersona){
    servicioPersona.editar(nuevaPersona);
    return "Dato editado";
    }
    
}
