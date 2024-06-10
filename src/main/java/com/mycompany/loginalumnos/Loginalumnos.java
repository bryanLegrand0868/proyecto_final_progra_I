/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginalumnos;
import java.util.ArrayList;
/**
 *
 * @author bryanlegrand
 */
public class Loginalumnos {

    public static ArrayList<Profesor> usuarios;
    public static ArrayList<alumno> usuarioalumno;
    public static ArrayList<Admin> mainpage;
    public static ArrayList<Clase> clases;
    
    public static void main(String[] args) {
        usuarios = new ArrayList<>();
        usuarioalumno = new ArrayList<>();
        mainpage = new ArrayList<>();
        clases = new ArrayList<>();
        Login l = new Login();
        l.setVisible(true);   
    }    
    
    
        
}
