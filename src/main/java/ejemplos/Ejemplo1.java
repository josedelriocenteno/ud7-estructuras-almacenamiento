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
public class Ejemplo1 {
    
    public static void main(String[] args) {
        
        Random rd = new Random();
        
        int tamanio = 20;
        int[]alturas = new int[tamanio];
                
        System.out.println(Arrays.toString(alturas));
        
        System.out.println(alturas.length);
        
        alturas[0] = 123;
        alturas[alturas.length - 1] = 185;
        
        System.out.println(Arrays.toString(alturas));

        Arrays.fill(alturas, -1);
        
        System.out.println(Arrays.toString(alturas));

        for (int i = 0; i < alturas.length; i++){
            alturas[i] = rd.nextInt(150, 251);
        }
        System.out.println(Arrays.toString(alturas));
        
        int sumatorio = 0;
        for (int i = 0; i < alturas.length; i++){
            sumatorio += alturas[i];
        }
        double media = sumatorio/alturas.length;
        
        Arrays.sort(alturas);
        int menor = alturas[0];
        int mayor = alturas[alturas.length - 1];
        
        System.out.println("Media=" + media);
        System.out.println("Menor=" + menor);
        System.out.println("Mayor=" + mayor);
        

    }
}
