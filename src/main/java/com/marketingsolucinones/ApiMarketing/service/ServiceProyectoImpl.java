
package com.marketingsolucinones.ApiMarketing.service;

import com.marketingsolucinones.ApiMarketing.dao.ProyectoRepository;
import com.marketingsolucinones.ApiMarketing.entity.Proyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ServiceProyectoImpl implements ServiceProyecto{

    @Autowired
    private ProyectoRepository proyectorepository;
    
    @Override
    public List<Proyecto> findAll() {
        return (List<Proyecto>)proyectorepository.findAll();
    }

    @Override
    public Proyecto findByName(String name) {
        return proyectorepository.findByName(name);
    }

    @Override
    public Proyecto add(Proyecto proyecto) {
       return proyectorepository.save(proyecto);
    }
 
    
}
