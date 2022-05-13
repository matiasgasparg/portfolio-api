/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioINTI.portfolio.controller;

import com.portfolioINTI.portfolio.model.PersonaModel;
import com.portfolioINTI.portfolio.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author walke
 */
@RestController
@RequestMapping ("/api/personas")
public class PersonaController {
    
    @Autowired
    private PersonaService personaService;
    
    @GetMapping 
    
    public List<PersonaModel> findAll(){
        return personaService.getAll();
    }
    @GetMapping ("/{id}")
    public ResponseEntity <PersonaModel> getById(@PathVariable (value="id")int id){
        return personaService.getById(id);
    }
    
    @PutMapping
    public PersonaModel save(@Validated @RequestBody PersonaModel persona){
        return personaService.save(persona);
    }
    
    @PutMapping("/{id}")
    
    public ResponseEntity<PersonaModel> update(@PathVariable(value="id")int id,@Validated @RequestBody PersonaModel persona){
        if(id==persona.idpersona){
            PersonaModel personaNew= personaService.save(persona);
            return ResponseEntity.ok().body(personaNew);
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }
    
    
}
