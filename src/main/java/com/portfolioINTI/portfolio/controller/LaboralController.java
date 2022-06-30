/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioINTI.portfolio.controller;

import com.portfolioINTI.portfolio.model.LaboralModel;
import com.portfolioINTI.portfolio.service.LaboralService;
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
@RequestMapping ("/api/laboral")
public class LaboralController {
    @Autowired
    private LaboralService laboralService;
    
    @GetMapping 
    
    public List<LaboralModel> getAll(){
        return laboralService.getAll();
    }
    @GetMapping ("/{id}")
    public ResponseEntity <LaboralModel> getById(@PathVariable (value="id")int id){
        return laboralService.getById(id);
    }
    
    @PutMapping("/{id}")
    
    public ResponseEntity<LaboralModel> update(@PathVariable(value="id")int id,@Validated @RequestBody LaboralModel laboral){
        if(id==laboral.idlaboral){
            LaboralModel laboralNew= laboralService.save(laboral);
            return ResponseEntity.ok().body(laboralNew);
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }
      @PostMapping ("/")
       public String createLaboral (@RequestBody LaboralModel laboral){
       laboralService.saveLaboral(laboral);
       return "La Laboral fue creada correctamente";
   }
        @DeleteMapping("/{id}")
    public ResponseEntity<LaboralModel> delete(@PathVariable int id) {
        boolean ok = laboralService.delete(id);
        if (ok) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.internalServerError().build();
        }


    }
}