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
    public static ArrayList<Clase> clases;
    static String profesorPath = "/home/bryanlegrand/Documentos/datos_profesor.ser";
    static String estudiantePath = "/home/bryanlegrand/Documentos/datos_estudiante.ser";
    static String clasePath = "/home/bryanlegrand/Documentos/datos_clase.ser";
    
    public static void main(String[] args) {
        
        usuarios = clase_serializable.leer_Objeto(profesorPath);
        if (usuarios == null) usuarios = new ArrayList<>();
        
        usuarioalumno = clase_serializable.leer_Objeto(estudiantePath);
        if (usuarioalumno == null) usuarioalumno = new ArrayList<>();
        
        clases = clase_serializable.leer_Objeto(clasePath);
        if (clases == null) clases = new ArrayList<>();
        
        
        Login l = new Login();
        l.setVisible(true);
        
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            clase_serializable.escribir_Objeto(usuarios, profesorPath);
            clase_serializable.escribir_Objeto(usuarioalumno, estudiantePath);
            clase_serializable.escribir_Objeto(clases, clasePath);
        }));
    }
    
    
    
    
        
}
