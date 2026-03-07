/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes.enums;

/**
 *
 * @author delcenjo
 */
public class DemoEnum {
    public static void main(String[] args) {
        // BÁSICO
        Planeta tierra = Planeta.TIERRA;
        System.out.println(tierra);  // TIERRA (toString automático)
        System.out.println(tierra.masaSuperficie());  // Calcula
        
        // values()
        for(Planeta p : Planeta.values()) {
            System.out.println(p + ": " + p.masaSuperficie());
        }
        
        // valueOf()
        Planeta jupiter = Planeta.valueOf("JUPITER");
        
        // Switch (Java 14+)
        Planeta planeta = Planeta.TIERRA;
        switch(planeta) {
            case TIERRA -> System.out.println("Habitable");
            case JUPITER -> System.out.println("Gigante");
        }
    }
}

