/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioINTI.portfolio.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author walke
 */
@Getter @Setter

@Entity
@Table (name="laboral")
public class LaboralModel {
    @Id
   @Column (unique= true ,nullable= false)
    public int idlaboral;
    
    private String puesto;
    private String descripcion;
    private String empresa;
    private String inicio;
    private String fin;
    private String fotourl;
    private int persona;

    public LaboralModel() {
    }

    public LaboralModel(int idlaboral, String puesto, String descripcion, String empresa, String inicio, String fin, String fotourl, int persona) {
        this.idlaboral = idlaboral;
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.empresa = empresa;
        this.inicio = inicio;
        this.fin = fin;
        this.fotourl = fotourl;
        this.persona = persona;
    }
    public LaboralModel(String puesto, String descripcion, String empresa, String inicio, String fin, String fotourl, int persona ) {
        
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.empresa = empresa;
        this.inicio = inicio;
        this.fin = fin;
        this.fotourl = fotourl;
        this.persona = persona;
    }
    @Override
    public String toString() {
        return "LaboralModel{" + "idlaboral=" + idlaboral + ", puesto=" + puesto + ", descripcion=" + descripcion + ", empresa=" + empresa + ", inicio=" + inicio + ", fin=" + fin + ", fotourl=" + fotourl + ", persona=" + persona + '}';
    }
    
    public int getIdlaboral() {
        return this.idlaboral;
    }

    public void setIdlaboral(int idlaboral) {
        this.idlaboral = idlaboral;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getInicio() {
        return this.inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return this.fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getFotourl() {
        return this.fotourl;
    }

    public void setFotourl(String fotourl) {
        this.fotourl = fotourl;
    }

    public int getPersona() {
        return this.persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }

 

    
    
}
