package com.mycompany.loginalumnos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class clase_serializable {
    
    public static <T> void escribir_Objeto(ArrayList<T> lista, String direccion) {
        try {
            FileOutputStream fos = new FileOutputStream(direccion);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static <T> ArrayList<T> leer_Objeto(String direccion) {
        ArrayList<T> tempList = null;
        
        try{ 
            FileInputStream fis = new FileInputStream(direccion);
            ObjectInputStream ois = new ObjectInputStream(fis);
            tempList = (ArrayList<T>) ois.readObject();
            
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return tempList;
    }
    
    
}
