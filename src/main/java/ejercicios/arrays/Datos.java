/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.arrays;

/**
 *
 * @author delcenjo
 */
public class Datos {
    
    private static final int [] numerosEnteros = new int[10];
    
    public static void imprimirPares(){
        int i = 0;
        for(int numero : numerosEnteros){
            if(i%2==0) System.out.println(numero);
            i++;
        }
    }
    
    public static double sumarPares(){
        int i = 0;
        int sumatorio = 0;
        for(int numero : numerosEnteros){
            if(i%2==0) sumatorio += numero;
            i++;
        }
        return sumatorio;
    }
}
