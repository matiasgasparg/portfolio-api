/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioINTI.portfolio.service;

import com.portfolioINTI.portfolio.model.RedesModel;
import com.portfolioINTI.portfolio.repo.Redesrepo;
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
public class RedesService {
     
    
    @Autowired
    Redesrepo redesRepo;
    
    public List<RedesModel>getAll(){
        return (List<RedesModel>)redesRepo.findAll();
        
    }
    public ResponseEntity <RedesModel>getById(int id){
        
     Optional<RedesModel> redes= redesRepo.findById(id);
        
        if(redes.isPresent()){
            return ResponseEntity.ok().body(redes.get());
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
         public RedesModel save(RedesModel redes){
        return redesRepo.save(redes);
    }
        public void  deleteRedes(int id){
        redesRepo.deleteById(id);
    }
         public void saveRedes(RedesModel redes){
        redesRepo.save(redes);
    }
}
