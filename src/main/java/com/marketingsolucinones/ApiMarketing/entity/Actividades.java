
package com.marketingsolucinones.ApiMarketing.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.Set;
import lombok.Data;

@Data
@Entity
public class Actividades {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idActividad;
    private String name;
    
    
    
    @ManyToOne
    @JoinColumn(name = "proyecto_id")
    private Proyecto proyecto;
    
    
   
    @OneToMany(mappedBy = "actividad", cascade = CascadeType.ALL)
    private Set<SubActividades> subActividades;
}
