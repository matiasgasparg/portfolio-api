/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioINTI.portfolio.controller;

import com.portfolioINTI.portfolio.model.SkillModel;
import com.portfolioINTI.portfolio.service.SkillService;
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
@RequestMapping("/api/skills")
public class SkillController {
    
    @Autowired
    SkillService skillService;
    
    
    @GetMapping 
    public List<SkillModel>findAll(){
        return skillService.getAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity <SkillModel>getById(@PathVariable (value="id")int id) {
        
        return skillService.getById(id);
        
    }
    @PutMapping("/{id}")
    public ResponseEntity<SkillModel> update(@PathVariable(value="id")int id,@Validated @RequestBody SkillModel skill){
        if(id==skill.idskill){
            SkillModel skillNew= skillService.save(skill);
            return ResponseEntity.ok().body(skillNew);
        }
        else{
            return ResponseEntity.badRequest().build();
        }
    }
    @PostMapping ("/")
       public String createSkill (@RequestBody SkillModel skill){
       skillService.saveSkill(skill);
       return "La Persona fue creada correctamente";
   }
      @DeleteMapping("/{id}")
   
   public String deleteSkill(@PathVariable int id){
       skillService.deleteSkill(id);
       return "El skill fue eliminado correctamente";
   }
   
}
