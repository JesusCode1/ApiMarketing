
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
public class Proyecto {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    
    
    @OneToMany(mappedBy = "proyecto", cascade = CascadeType.ALL)
    private Set<Actividades> actividades;
    
    @ManyToOne 
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
