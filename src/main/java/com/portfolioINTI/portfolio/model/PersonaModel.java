/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioINTI.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author walke
 */
@Getter @Setter
@Entity
public class PersonaModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
        private int idpersona;
        
        private String nombre;
        private String apellido;
        private String correo;
        private String titulo;
        private String telefono;
        private String ubicacion;
        private String acerca;
        private String fotourl;
        private String username;
        private String password;

    public PersonaModel() {
    }

    public PersonaModel(int idpersona, String nombre, String apellido, String correo, String titulo, String telefono, String ubicacion, String acerca, String fotourl, String username, String password) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.titulo = titulo;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.acerca = acerca;
        this.fotourl = fotourl;
        this.username = username;
        this.password = password;
    }
        
                
                
        
        
    
    
}
