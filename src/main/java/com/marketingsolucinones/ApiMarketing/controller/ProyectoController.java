
package com.marketingsolucinones.ApiMarketing.controller;

import com.marketingsolucinones.ApiMarketing.entity.Proyecto;
import com.marketingsolucinones.ApiMarketing.service.ServiceProyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/proyecto")
public class ProyectoController {
    
    @Autowired
    private ServiceProyecto proyectoservice;
    
    @GetMapping
    public List<Proyecto> findAll(){
      return proyectoservice.findAll();
    }
     @GetMapping({"id"})
    public Proyecto findByName(@PathVariable String name){
        return proyectoservice.findByName(name);
    }
    @PostMapping
    public Proyecto add(@RequestBody Proyecto proyecto){
        return proyectoservice.add(proyecto);
    }
}
