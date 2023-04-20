
package com.portfolioMariano.argentinaPrograma.controller;

import com.portfolioMariano.argentinaPrograma.entity.Educacion;
import com.portfolioMariano.argentinaPrograma.service.SEducacion;
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
@RequestMapping("educacion")
@CrossOrigin(origins = "https://ejemplo2-ejemplo2.web.app/")
public class CEducacion {
    @Autowired
    SEducacion educacion;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Educacion> verEducacion(){
    return educacion.verEducacion();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Educacion verEducacion(@PathVariable int id){
    return educacion.buscarEducacion(id);
    }
    
    @PostMapping("/crear")
    public String agregarEducacion(@RequestBody Educacion nEducacion){
    educacion.crearEducacion(nEducacion);
    return "Dato creado.";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String borrarEducacion(@PathVariable int id){
    educacion.borrarEducacion(id);
    return "Dato borrado.";
    }
    
    @PutMapping("/editar/{id}")
    public String editarEducacion(@RequestBody Educacion nEducacion){
    educacion.editarEducacion(nEducacion);
    return "Dato editado";
    }
    
}
