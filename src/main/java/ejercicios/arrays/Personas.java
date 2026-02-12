/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.arrays;

/**
 *
 * @author delcenjo
 */
public class Personas {
    
    private static final Personas[] personas = new Personas[20];
    private static int contador = 0;
    private String nombre;

    public Personas(String nombre){
        try {
            validarArray(nombre);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    private void validarArray(String nombre) throws IndexOutOfBoundsException{
        contador ++;
        if(contador<20) this.nombre = nombre;
        else{
            contador --;
            throw new IndexOutOfBoundsException("Se a alcanzado el número máximo permitido de Personas.");         
        }
        personas[contador] = this;
    }
    
    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + '}';
    }
    
    public static void imprimePersonas(){
        for(Personas persona : personas){
            System.out.println(persona);
        }
    }
    
    public static void pares(){
        int i = 0;
        for(Personas persona : personas){
            if(i%2==0) System.out.println(persona);
            i++;
        }
    }
}
