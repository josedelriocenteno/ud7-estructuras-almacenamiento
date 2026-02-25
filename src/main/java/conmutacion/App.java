/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conmutacion;

import javax.swing.JOptionPane;

/**
 *
 * @author delcenjo
 */
public class App {
    
    public static final int MAX = 10;
    public static final int MIN = 2;
    
    private static Integer[] getValores(){
        Integer[] array = new Integer[MAX - MIN + 1];
        int valor = MIN;
            for(int i = 0; i < array.length; i++){
                array[i] = valor + i;
            }
        return array;
    }
    public static void main(String[] args) {
        Integer[] valores = getValores();
        Integer filas = (Integer) JOptionPane.showInputDialog(null, "Num. filas", "Dimension matriz",
                JOptionPane.PLAIN_MESSAGE, null, valores, valores[0]);
        if(filas == null) return;
        Integer columnas = (Integer) JOptionPane.showInputDialog(null, "Num. filas", "Dimension matriz",
                JOptionPane.PLAIN_MESSAGE, null, valores, valores[0]);
        if(columnas == null) return;
        
        GUIMatriz gui = new GUIMatriz(new Integer[filas][columnas]);
        
    }
}
