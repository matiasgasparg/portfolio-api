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
@Table (name="redes")
public class RedesModel {
       @Id
    //@GeneratedValue(strategy=GenerationType.IDENTITY)  
    @Column (unique= true ,nullable= false)
      public int idred;
      private String nombre;
      private String url;
      private String fotourl;
      private int persona;
    public RedesModel() {
    }

    public RedesModel(int idred, String nombre, String url, String fotourl, int persona) {
        this.idred = idred;
        this.nombre = nombre;
        this.url = url;
        this.fotourl = fotourl;
        this.persona = persona;
    }

    public int getIdred() {
        return idred;
    }

    public void setIdred(int idred) {
        this.idred = idred;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFotourl() {
        return fotourl;
    }

    public void setFotourl(String fotourl) {
        this.fotourl = fotourl;
    }

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "RedesModel{" + "idred=" + idred + ", nombre=" + nombre + ", url=" + url + ", fotourl=" + fotourl + ", persona=" + persona + '}';
    }

      
}
