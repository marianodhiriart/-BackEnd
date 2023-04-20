
package com.portfolioMariano.argentinaPrograma.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

@Entity
public class Trabajo {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String institucion;
    
    @Temporal(TemporalType.DATE)
    private Date inicio;
    
      @Temporal(TemporalType.DATE)
    private Date fin;
      
      private String descripcion;

    public Trabajo() {
    }

    public Trabajo(int id, String institucion, Date inicio, Date fin, String descripcion) {
        this.id = id;
        this.institucion = institucion;
        this.inicio = inicio;
        this.fin = fin;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getInstitucion() {
        return institucion;
    }

    public Date getInicio() {
        return inicio;
    }

    public Date getFin() {
        return fin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
      
      
}
