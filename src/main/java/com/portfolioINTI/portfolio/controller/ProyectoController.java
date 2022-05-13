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
    public ResponseEntity<ProyectoModel> update(@PathVariable(value="id")int id,@Validated @RequestBody ProyectoModel proyecto){
        if(id==proyecto.idproyecto){
            ProyectoModel proyectoNew= proyectoService.save(proyecto);
            return ResponseEntity.ok().body(proyectoNew);
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }
    @PostMapping ("/")
       public String createProyecto (@RequestBody ProyectoModel proyecto){
       proyectoService.saveProyecto(proyecto);
       return "El proyecto fue creado correctamente";
   }
      @DeleteMapping("/{id}")
   
   public String deleteProyecto(@PathVariable int id){
       proyectoService.deleteProyecto(id);
       return "El proyecto fue eliminadx correctamente";
   }
}
