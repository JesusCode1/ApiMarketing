
package com.marketingsolucinones.ApiMarketing.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class SubActividades {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSubActividades;
    private String name;



    @ManyToOne
    @JoinColumn(name = "actividad_id")
    private Actividades actividad;
    
}
