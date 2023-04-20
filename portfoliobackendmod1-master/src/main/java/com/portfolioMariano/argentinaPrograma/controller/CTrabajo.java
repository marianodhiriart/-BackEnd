
package com.portfolioMariano.argentinaPrograma.controller;

import com.portfolioMariano.argentinaPrograma.entity.Trabajo;
import com.portfolioMariano.argentinaPrograma.service.STrabajo;
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
@RequestMapping("trabajo")
@CrossOrigin(origins = "http://localhost:4200")
public class CTrabajo {
     @Autowired
     STrabajo trabajo;
     
     @GetMapping("/lista")
     @ResponseBody
     public List <Trabajo> verPersona(){
     return trabajo.verTrabajo();
     }
     
     @GetMapping("/ver/{id}")
     @ResponseBody
     public Trabajo verTrabajo(@PathVariable int id){
     return trabajo.buscarTrabajo(id);
     }
     
     @PostMapping("/crear")
     public String crearPersona(@RequestBody Trabajo nTrabajo){
     trabajo.crearTrabajo(nTrabajo);
     return "Dato Creado.";
     }
     
     @DeleteMapping("/borrar/{id}")
     public String borrarTrabajo(@PathVariable int id){
     trabajo.borrarTrabajo(id);
     return "Dato eliminado.";
     }
     
     @PutMapping("/editar/{id}")
     public String editarTrabajo(@RequestBody Trabajo nTrabajo){
     trabajo.editarTrabajo(nTrabajo);
     return "Dato editado.";
     }
    
}
