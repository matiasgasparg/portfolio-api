/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioINTI.portfolio.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author walke
 */
@Entity
@Table (name="educacion")
public class EducacionModel {
    @Id
   @Column (unique= true ,nullable= false)
    public int ideducacion;
    private String titulo;
    private Date fechafin;
    private String institucion;
    private String institucionurl;
    private String fotourl;
    private int persona;
    public EducacionModel() {
    }

    public EducacionModel(int ideducacion, String titulo, Date fechafin, String institucion, String institucionurl, String fotourl, int persona) {
        this.ideducacion = ideducacion;
        this.titulo = titulo;
        this.fechafin = fechafin;
        this.institucion = institucion;
        this.institucionurl = institucionurl;
        this.fotourl = fotourl;
        this.persona = persona;
    }

    public int getIdeducacion() {
        return ideducacion;
    }

    public void setIdeducacion(int ideducacion) {
        this.ideducacion = ideducacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getInstitucionurl() {
        return institucionurl;
    }

    public void setInstitucionurl(String institucionurl) {
        this.institucionurl = institucionurl;
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
        return "EducacionModel{" + "ideducacion=" + ideducacion + ", titulo=" + titulo + ", fechafin=" + fechafin + ", institucion=" + institucion + ", institucionurl=" + institucionurl + ", fotourl=" + fotourl + ", persona=" + persona + '}';
    }

    
}
