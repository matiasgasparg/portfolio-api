/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioINTI.portfolio.service;

import com.portfolioINTI.portfolio.model.LaboralModel;
import com.portfolioINTI.portfolio.repo.Laboralrepo;
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
public class LaboralService {
    
    
    @Autowired
    Laboralrepo laboralRepo;
    
    public List<LaboralModel>getAll(){
        return (List<LaboralModel>)laboralRepo.findAll();
        
    }
    public ResponseEntity <LaboralModel>getById(int id){
        
     Optional<LaboralModel> laboral= laboralRepo.findById(id);
        
        if(laboral.isPresent()){
            return ResponseEntity.ok().body(laboral.get());
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
    
        public void  deleteLaboral(int id){
        laboralRepo.deleteById(id);
    }

  public  LaboralModel save(LaboralModel laboral){
        return laboralRepo.save(laboral);
    }

   public boolean delete(int id) {
        try {
            laboralRepo.deleteById(id); 
            return true;
        } catch(Exception err){
            return false;
        }
    } 
}
