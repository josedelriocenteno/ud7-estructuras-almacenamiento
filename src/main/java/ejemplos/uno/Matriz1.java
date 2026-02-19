/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.uno;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author delcenjo
 */
public class Matriz1 {
    
    public static void mostarMatriz(int [][] a){
        for (int[] a1 : a) {
            System.out.println(Arrays.toString(a1));
        }
    }
    
    public static void rellenarMatriz(int [][] a){
        for (int[] a1 : a) {
            Arrays.fill(a1, -1);
        }
    }
    
    public static void main(String[] args) {
        
        int[][] matriz;
        matriz = new int[5][6];
        
        rellenarMatriz(matriz);
        mostarMatriz(matriz);
    }
}
