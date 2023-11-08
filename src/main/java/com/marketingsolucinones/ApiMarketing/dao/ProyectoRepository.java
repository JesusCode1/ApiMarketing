
package com.marketingsolucinones.ApiMarketing.dao;

import com.marketingsolucinones.ApiMarketing.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ProyectoRepository extends JpaRepository<Proyecto, Long>{
    
    Proyecto findByName (String name);    
}
