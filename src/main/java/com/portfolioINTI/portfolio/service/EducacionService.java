/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioINTI.portfolio.service;

import com.portfolioINTI.portfolio.model.EducacionModel;
import com.portfolioINTI.portfolio.repo.EducacionRepo;
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
public class EducacionService {
    @Autowired
    EducacionRepo educacionRepo;
    
    public List<EducacionModel>getAll(){
        return (List<EducacionModel>)educacionRepo.findAll();
        
    }
    public ResponseEntity <EducacionModel>getById(int id){
        
     Optional<EducacionModel> educacion= educacionRepo.findById(id);
        
        if(educacion.isPresent()){
            return ResponseEntity.ok().body(educacion.get());
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
         public EducacionModel save(EducacionModel educacion){
        return educacionRepo.save(educacion);
    }
        public void  deleteEducacion(int id){
        educacionRepo.deleteById(id);
    }
         public void saveEducacion(EducacionModel educacion){
        educacionRepo.save(educacion);
    }
}
