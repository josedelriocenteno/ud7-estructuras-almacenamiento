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
    
    private static Integer[] valores(){
        Integer[] array = new Integer[MAX - MIN + 1];
            for(int i = 0; i < array.length; i++){
                array[i] = MIN + i;
            }
        return array;
    }
    public static void main(String[] args) {
        Integer[] valores = valores();
        JOptionPane.showInputDialog(null, "Num. filas", "Dimension matriz",
                JOptionPane.PLAIN_MESSAGE, null, valores, valores[0]);
    }
}
