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

    public SkillModel() {
    }

    public SkillModel(int idskill, String titulo, int dominio) {
        this.idskill = idskill;
        this.titulo = titulo;
        this.dominio = dominio;
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

    @Override
    public String toString() {
        return "SkillModel{" + "idskill=" + idskill + ", titulo=" + titulo + ", dominio=" + dominio + '}';
    }
     
        
}
