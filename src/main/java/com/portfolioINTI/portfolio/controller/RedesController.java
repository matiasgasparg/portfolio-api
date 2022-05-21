/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioINTI.portfolio.controller;

import com.portfolioINTI.portfolio.model.RedesModel;
import com.portfolioINTI.portfolio.service.RedesService;
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
@RequestMapping("/api/redes")
public class RedesController {
    
    @Autowired
    RedesService redesService;
    
    
    @GetMapping 
    public List<RedesModel>findAll(){
        return redesService.getAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity <RedesModel>getById(@PathVariable (value="id")int id) {
        
        return redesService.getById(id);
        
    }
    @PutMapping("/{id}")
    public ResponseEntity<RedesModel> update(@PathVariable(value="id")int id,@Validated @RequestBody RedesModel redes){
        if(id==redes.idred){
            RedesModel redesNew= redesService.save(redes);
            return ResponseEntity.ok().body(redesNew);
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }
    @PostMapping ("/")
       public String createRedes (@RequestBody RedesModel redes){
       redesService.saveRedes(redes);
       return "La Red Social fue creada correctamente";
   }
      @DeleteMapping("/{id}")
   
   public String deleteRedes(@PathVariable int id){
       redesService.deleteRedes(id);
       return "La red fue eliminada correctamente";
   }
   
}
