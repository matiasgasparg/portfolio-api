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
@Table (name="proyecto")
public class ProyectoModel {
    @Id
    //@GeneratedValue(strategy=GenerationType.IDENTITY)  
    @Column (unique= true ,nullable= false)
     public int idproyecto;
        
        private String titulo;
        private String descripcion;
        private String url;
        private int persona;
    public ProyectoModel() {
    }

    public ProyectoModel(int idproyecto, String titulo, String descripcion, String url, int persona) {
        this.idproyecto = idproyecto;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
        this.persona = persona;
    }

    public int getIdproyecto() {
        return idproyecto;
    }

    public void setIdproyecto(int idproyecto) {
        this.idproyecto = idproyecto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "ProyectoModel{" + "idproyecto=" + idproyecto + ", titulo=" + titulo + ", descripcion=" + descripcion + ", url=" + url + ", persona=" + persona + '}';
    }

}