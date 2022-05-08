/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioINTI.portfolio.service;

import com.portfolioINTI.portfolio.model.PersonaModel;
import com.portfolioINTI.portfolio.repo.Personarepo;
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
public class PersonaService {
    @Autowired
    
    Personarepo personaRepo;
    
    public List<PersonaModel>getAll(){
        return(List<PersonaModel>) personaRepo.findAll();
    }
    public ResponseEntity <PersonaModel>getById(int id){
        Optional<PersonaModel> persona= personaRepo.findById(id);
        
        if(persona.isPresent()){
            return ResponseEntity.ok().body(persona.get());
        }
        else{
            return ResponseEntity.notFound().build();
        }
        
    }
    public PersonaModel save(PersonaModel persona){
        return personaRepo.save(persona);
    }
}
