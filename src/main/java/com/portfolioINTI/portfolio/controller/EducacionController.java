/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioINTI.portfolio.controller;

import com.portfolioINTI.portfolio.model.EducacionModel;
import com.portfolioINTI.portfolio.service.EducacionService;
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
@RequestMapping("/api/educacion")
public class EducacionController {
     @Autowired
    private EducacionService educacionService;
    
    @GetMapping 
    
    public List<EducacionModel> findAll(){
        return educacionService.getAll();
    }
    @GetMapping ("/{id}")
    public ResponseEntity <EducacionModel> getById(@PathVariable (value="id")int id){
        return educacionService.getById(id);
    }
    
    @PutMapping("/{id}")
    
    public void update(@RequestBody EducacionModel educacion){
        educacionService.save(educacion);
       
    }
      @PostMapping ("/")
       public String createEducacion (@RequestBody EducacionModel educacion){
       educacionService.save(educacion);
       return "La Educacion fue creada correctamente";
   }
   @DeleteMapping("/{id}")
   public ResponseEntity<EducacionModel> delete(@PathVariable int id) {
       boolean ok = educacionService.delete(id);
       if (ok) {
           return ResponseEntity.ok().build();
       } else {
           return ResponseEntity.internalServerError().build();
       }
    
}
