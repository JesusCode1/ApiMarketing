
package com.marketingsolucinones.ApiMarketing.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import java.util.Set;
import lombok.Data;

@Data
@Entity
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String telefono;
    private String direccion;
    
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    
    @OneToMany(mappedBy = "cliente") // Mapeo la relación hacia Proyecto
    private Set<Proyecto> proyectos;
    
}
