/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author delcenjo
 */
public class Ejemplo3 {
    
    private static final Random RD = new Random();
    
    public static void asignarEdades(Persona[] array){
        for(Persona persona : array){
            if(persona != null){
                persona.setEdad(RD.nextInt(18, 46));
            }
        }
    }
    
    public static void mayores(Persona[] array, int minEdad){
        for(Persona persona : array){
            if(persona != null && persona.getEdad() >= minEdad) System.out.println(persona.getNombre());
        }
    }
    
    public static void main(String[] args) {
        
        Persona[] personas = new Persona[10];
        System.out.println(Arrays.toString(personas));
        
        Persona p1 = new Persona("123456789a", "Juan", "Fernandez");
        Persona p2 = new Persona("123456789b", "Lucas", "Baz");
        Persona p3 = new Persona("123456789c", "Claudia", "Gonzalez");
        
        personas[0] = p1;
        personas[1] = p2;
        personas[2] = p3;
        
        System.out.println(Arrays.toString(personas));
        
        asignarEdades(personas);
        
        System.out.println(Arrays.toString(personas));
        
        mayores(personas, 40);
        
        
    }
}
