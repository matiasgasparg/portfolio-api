/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioINTI.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author walke
 */
@Entity
@Table (name="skill")
public class SkillModel {
        @Id
    //@GeneratedValue(strategy=GenerationType.IDENTITY)  
    @Column (unique= true ,nullable= false)
        public int idskill;
        private String titulo;
        private int dominio ;
        private int persona;

    public SkillModel() {
    }

    public SkillModel(int idskill, String titulo, int dominio, int persona) {
        this.idskill = idskill;
        this.titulo = titulo;
        this.dominio = dominio;
        this.persona = persona;
    }

    public int getIdskill() {
        return idskill;
    }

    public void setIdskill(int idskill) {
        this.idskill = idskill;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDominio() {
        return dominio;
    }

    public void setDominio(int dominio) {
        this.dominio = dominio;
    }

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "SkillModel{" + "idskill=" + idskill + ", titulo=" + titulo + ", dominio=" + dominio + ", persona=" + persona + '}';
    }

  
     
        
}
