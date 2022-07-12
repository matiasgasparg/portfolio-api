/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioINTI.portfolio.controller;

import com.portfolioINTI.portfolio.model.ProyectoModel;
import com.portfolioINTI.portfolio.service.ProyectoService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author walke
 */
@CrossOrigin("*")
@RestController
@RequestMapping ("/api/proyectos")
public class ProyectoController {
     @Autowired
    ProyectoService proyectoService;
    
    
    @GetMapping 
    public List<ProyectoModel>findAll(){
        return proyectoService.getAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity <ProyectoModel>getById(@PathVariable (value="id")int id) {
        
        return proyectoService.getById(id);
        
    }
    @PutMapping("/{id}")
    
    public void update(@RequestBody ProyectoModel proyecto){
        proyectoService.save(proyecto);
       
    }
    
    @PostMapping ("/")
       public String createProyecto (@RequestBody ProyectoModel proyecto){
       proyectoService.save(proyecto);
       return "El proyecto fue creado correctamente";
   }
   @DeleteMapping("/{id}")
   public ResponseEntity<ProyectoModel> delete(@PathVariable int id) {
       boolean ok = proyectoService.delete(id);
       if (ok) {
           return ResponseEntity.ok().build();
       } else {
           return ResponseEntity.internalServerError().build();
       }


   }
}
