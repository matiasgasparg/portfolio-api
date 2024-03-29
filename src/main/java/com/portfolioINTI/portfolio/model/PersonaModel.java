/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioINTI.portfolio.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


/**
 *
 * @author walke
 */

@Entity
@Table (name="persona")
public class PersonaModel {
    @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)  
    //@Column (unique= true ,nullable= false)
        public int idpersona;
        
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
        @Transient
        private String token;

    public PersonaModel() {
    }

    public PersonaModel(int idpersona, String nombre, String apellido, String correo, String titulo, String telefono, String ubicacion, String acerca, String fotourl, String username, String password, String token) {
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
        this.token = token;
    }
    public PersonaModel( String nombre, String apellido, String correo, String titulo, String telefono, String ubicacion, String acerca, String fotourl, String username, String password, String token) {
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
        this.token = token;
    }
    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getAcerca() {
        return acerca;
    }

    public void setAcerca(String acerca) {
        this.acerca = acerca;
    }

    public String getFotourl() {
        return fotourl;
    }

    public void setFotourl(String fotourl) {
        this.fotourl = fotourl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "PersonaModel{" + "idpersona=" + idpersona + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", titulo=" + titulo + ", telefono=" + telefono + ", ubicacion=" + ubicacion + ", acerca=" + acerca + ", fotourl=" + fotourl + ", username=" + username + ", password=" + password + ", token=" + token + '}';
    }

    
    
}
