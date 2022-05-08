/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioINTI.portfolio.service;

import com.portfolioINTI.portfolio.model.SkillModel;
import com.portfolioINTI.portfolio.repo.Skillrepo;
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
public class SkillService {
    
    @Autowired
    Skillrepo skillRepo;
    
    public List<SkillModel>getAll(){
        return (List<SkillModel>)skillRepo.findAll();
        
    }
    public ResponseEntity <SkillModel>getById(int id){
        
     Optional<SkillModel> skill= skillRepo.findById(id);
        
        if(skill.isPresent()){
            return ResponseEntity.ok().body(skill.get());
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
         public SkillModel save(SkillModel skill){
        return skillRepo.save(skill);
    }
        public void  deleteSkill(int id){
        skillRepo.deleteById(id);
    }
         public void saveSkill(SkillModel skill){
        skillRepo.save(skill);
    }
}
    

