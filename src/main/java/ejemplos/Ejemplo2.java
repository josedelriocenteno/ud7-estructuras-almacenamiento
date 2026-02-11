/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;
/**
 *
 * @author delcenjo
 */
public class Ejemplo2 {
    
    public boolean buscarDniBis(String dni, String[] dnis){
        for (String dni1 : dnis) if (dni1.equals(dni)) return true;
        return false;
    }
    
    public boolean buscarDni(String dni, String[] dnis){
        for(int i = 0; i<dnis.length; i++){
            if(dnis[i].equals(dni)) return true;
        }
        return false;
    }
    
    public void llenarArrayDni(String dni, String[] dnis, int posicion){
        dnis[posicion] = dni;
    }
    
    public static void main(String[] args) {
        
        String[] dnis = {"1111111A", "1231321321Z", "21321321321B" , "32131321433X", "848383927590J"};
       
        
        
    }
}
