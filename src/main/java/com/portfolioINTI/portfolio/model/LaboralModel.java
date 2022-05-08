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
@Table (name="laboral")
public class LaboralModel {
    @Id
   @Column (unique= true ,nullable= false)
    public int idlaboral;
    private String puesto;
    private String descripcion;
    private String empresa;
    private Date inicio;
    private Date fin;
    private String fotourl;
    private int persona;

    public LaboralModel() {
    }

    public LaboralModel(int idlaboral, String puesto, String descripcion, String empresa, Date inicio, Date fin, String fotourl, int persona) {
        this.idlaboral = idlaboral;
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.empresa = empresa;
        this.inicio = inicio;
        this.fin = fin;
        this.fotourl = fotourl;
        this.persona = persona;
    }

    public int getIdlaboral() {
        return idlaboral;
    }

    public void setIdlaboral(int idlaboral) {
        this.idlaboral = idlaboral;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
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
        return "LaboralModel{" + "idlaboral=" + idlaboral + ", puesto=" + puesto + ", descripcion=" + descripcion + ", empresa=" + empresa + ", inicio=" + inicio + ", fin=" + fin + ", fotourl=" + fotourl + ", persona=" + persona + '}';
    }

    
    
}
