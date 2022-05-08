/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioINTI.portfolio.service;

import com.portfolioINTI.portfolio.model.ProyectoModel;
import com.portfolioINTI.portfolio.repo.Proyectorepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author walke
 */
@Service
public class ProyectoService {
    
    @Autowired
    Proyectorepo proyectoRepo;
    
    public List<ProyectoModel>getAll(){
        return (List<ProyectoModel>)proyectoRepo.findAll();
        
    }
    public ResponseEntity <ProyectoModel>getById(int id){
        
     Optional<ProyectoModel> proyecto= proyectoRepo.findById(id);
        
        if(proyecto.isPresent()){
            return ResponseEntity.ok().body(proyecto.get());
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
         public ProyectoModel save(ProyectoModel proyecto){
        return proyectoRepo.save(proyecto);
    }
        public void  deleteProyecto(int id){
        proyectoRepo.deleteById(id);
    }
         public void saveProyecto(ProyectoModel proyecto){
        proyectoRepo.save(proyecto);
    }
}
