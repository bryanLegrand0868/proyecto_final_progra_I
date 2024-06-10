/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginalumnos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author bryanlegrand
 */
public class alumno implements Serializable {
    
    String nombre;
    String apellido;
    String usuario;
    String password;
    String carnet;
    public ArrayList<Clase> claseAsignada = new ArrayList<>();
    public ArrayList<Integer> notasFinales = new ArrayList<>();

    public alumno() {
        
    }
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * @return the carne
     */
    public String getCarnet() {
        return carnet;
    }

    /**
     * @param carne the carne to set
     */
    public void setCarnet(String carne) {
        this.carnet = carne;
    }
}
