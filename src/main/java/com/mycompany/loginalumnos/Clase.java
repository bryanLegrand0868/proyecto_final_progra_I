/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginalumnos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author bryanlegrand
 */
public class Clase {
    private String nombre;
    private String id;
    private String profesorasignado;
    private ArrayList<alumno> alumnoAsignados = new ArrayList<>();
    private ArrayList<Profesor> clasesProfesor = new ArrayList<>();
    private String horaInicio;
    private String horaFin;
    private Date fechaInicio;
    private Date fechaFin;
    private String seccion;
    
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
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the profesorasignado
     */
    public String getProfesorasignado() {
        return profesorasignado;
    }

    /**
     * @param profesorasignado the profesorasignado to set
     */
    public void setProfesorasignado(String profesorasignado) {
        this.profesorasignado = profesorasignado;
    }

    /**
     * @return the horaInicio
     */
    public String getHoraInicio() {
        return horaInicio;
    }

    /**
     * @param horaInicio the horaInicio to set
     */
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @return the horaFin
     */
    public String getHoraFin() {
        return horaFin;
    }

    /**
     * @param horaFin the horaFin to set
     */
    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    /**
     * @return the alumnoAsignados
     */
    public ArrayList<alumno> getAlumnoAsignados() {
        return alumnoAsignados;
    }

    /**
     * @param alumnoAsignados the alumnoAsignados to set
     */
    public void setAlumnoAsignados(ArrayList<alumno> alumnoAsignados) {
        this.alumnoAsignados = alumnoAsignados;
    }

    /**
     * @return the clasesProfesor
     */
    public ArrayList<Profesor> getClasesProfesor() {
        return clasesProfesor;
    }

    /**
     * @param clasesProfesor the clasesProfesor to set
     */
    public void setClasesProfesor(ArrayList<Profesor> clasesProfesor) {
        this.clasesProfesor = clasesProfesor;
    }

    /**
     * @return the fechaInicio
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFin
     */
    public Date getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * @return the seccion
     */
    public String getSeccion() {
        return seccion;
    }

    /**
     * @param seccion the seccion to set
     */
    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    
}
