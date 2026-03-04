/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author delcenjo
 */
public class App {
    
    public static ArrayList<Alumno> listaAlumnos;
    
    public static void mostrarAlumnos(){
            System.out.print("Alumnos de clase...");
            for(Alumno al : listaAlumnos){
                System.out.printf("\n\t%s", al);
            }
    }
    
    public static void crearAlumnos(){
        listaAlumnos.add(new Alumno("12345678F", 25, 3.8, "Juan", "Fernandez"));
        listaAlumnos.add(new Alumno("11111111A", 39, 5.8, "Victor", "Cap"));
        listaAlumnos.add(new Alumno("22222222B", 19, 8.4, "Lucia", "Rivera"));
    }
    
    public static ArrayList<Alumno> alumnosAprobados(){
        ArrayList<Alumno> listaAprobados = new ArrayList<>();
        for (Alumno al : listaAlumnos){
            if (al.getNota() >= 5) {
                listaAprobados.add(al);
            }
        }
        return listaAprobados;
    }
    
    public static Alumno buscarAlumno(String dni){
        Alumno alumnoBusqueda = new Alumno();
        alumnoBusqueda.setDni(dni);
        int posicion = listaAlumnos.indexOf(alumnoBusqueda);
        if(posicion > -1) return listaAlumnos.get(posicion);
        else return null;
    }
    
    public static void ordenarAlumnos(String dni){
        Collections.sort(listaAlumnos);
        mostrarAlumnos();
    }
    
    public static void main(String[] args) {
        
        listaAlumnos = new ArrayList<>();
        crearAlumnos();
        mostrarAlumnos();
        System.out.println("\nAlumnos aprobados:");
        System.out.println(alumnosAprobados());
        String dniBusqueda = "11111111A";
        Alumno alumnoBuscado = buscarAlumno(dniBusqueda);
        if (alumnoBuscado != null) System.out.println(alumnoBuscado);
        else System.out.println("Alumnos no encontrados");
        System.out.println("Alumnos ordenados por DNI");
    }   
}