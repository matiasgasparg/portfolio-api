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
@RequestMapping("/api/Educaciones")
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
    
    public ResponseEntity<EducacionModel> update(@PathVariable(value="id")int id,@Validated @RequestBody EducacionModel educacion){
        if(id==educacion.ideducacion){
            EducacionModel educacionNew= educacionService.save(educacion);
            return ResponseEntity.ok().body(educacionNew);
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }
      @PostMapping ("/")
       public String createEducacion (@RequestBody EducacionModel educacion){
       educacionService.saveEducacion(educacion);
       return "La Educacion fue creada correctamente";
   }
      @DeleteMapping("/{id}")
   
   public String deleteEducacion(@PathVariable int id){
       educacionService.deleteEducacion(id);
       return "El educacion fue eliminado correctamente";
   }
    
}
