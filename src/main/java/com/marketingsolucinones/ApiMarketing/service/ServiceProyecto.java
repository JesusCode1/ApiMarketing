
package com.marketingsolucinones.ApiMarketing.service;

import com.marketingsolucinones.ApiMarketing.entity.Proyecto;
import java.util.List;


public interface ServiceProyecto {
   
    List<Proyecto> findAll();
    Proyecto findByName(String name);
    Proyecto add(Proyecto proyecto);
}
