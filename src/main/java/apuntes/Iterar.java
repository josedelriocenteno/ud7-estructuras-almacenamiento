/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author delcenjo
 */
public class Iterar {
    
    public static void recorrerColeccion(Collection c){
        Iterator it = c.iterator();
        while(it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        recorrerColeccion(lista);
    }
    
}
