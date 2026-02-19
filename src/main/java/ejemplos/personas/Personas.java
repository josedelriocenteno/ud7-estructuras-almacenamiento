/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.personas;

import java.util.Arrays;

/**
 *
 * @author delcenjo
 */
public class Personas {
    
    private String[] personas;
    
    public Personas(int tamañoArray){
        personas = new String[tamañoArray];
    }
    
    public static void imprimePersonas (String[] personas){
        for(String p : personas){
            System.out.println(p);
        }
    }
}
