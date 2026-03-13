/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author delcenjo
 */
public class Inventario {
    
    public static void main(String[] args) {
        
        Map<String, Integer> inventario = new HashMap<>();
        
        inventario.put("Raton", 125);
        inventario.put("Teclado", 87);
        inventario.put("Monitor", 18);
        
        System.out.println(inventario);
        
        int unidades = inventario.get("Teclado");
        System.out.println("Unidades de teclado: " + unidades);
        
        Set<String> productos = inventario.keySet();
        System.out.println("Productos: " + productos);
        
        Collection<Integer> listaUnidades = inventario.values();
        System.out.println("Lista de unidades: " + listaUnidades);
    
        int suma = 0;
        for(Map.Entry<String,Integer> entry : inventario.entrySet()){
            suma += entry.getValue();
        }
        double inventarioPromedio = suma / inventario.size();
    }
    
}
