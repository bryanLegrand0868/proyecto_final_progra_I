/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginalumnos;

import java.util.ArrayList;

/**
 *
 * @author bryanlegrand
 */
public class Profesor {
    private String nombre;
    private String apellido;
    private String usuario;
    private String passwordChars;
    private String usuarios;
    private String especialidad;
    private  ArrayList<Clase> clasesAsignadasProfesor = new ArrayList<>();
    
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return this.nombre;
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
     * @return the passwordChars
     */
    public String getPasswordChars() {
        return passwordChars;
    }

    /**
     * @param passwordChars the passwordChars to set
     */
    public void setPasswordChars(String passwordChars) {
        this.passwordChars = passwordChars;
    }

    /**
     * @return the usuarios
     */
    public String getUsuarios() {
        return usuarios;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(String usuarios) {
        this.usuarios = usuarios;
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the clasesAsignadasProfesor
     */
    public ArrayList<Clase> getClasesAsignadasProfesor() {
        return clasesAsignadasProfesor;
    }

    /**
     * @param clasesAsignadasProfesor the clasesAsignadasProfesor to set
     */
    public void setClasesAsignadasProfesor(ArrayList<Clase> clasesAsignadasProfesor) {
        this.clasesAsignadasProfesor = clasesAsignadasProfesor;
    }


}
