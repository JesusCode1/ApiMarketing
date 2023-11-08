
package com.marketingsolucinones.ApiMarketing.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Roles {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String horasTrabajo;
    
    
    @OneToOne(mappedBy = "roles")
    private User user;
    
}
