/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package apuntes.enums;

/**
 *
 * @author delcenjo
 */
public enum Planeta {
    MERCURIO(3.3E23, 2.439e6),
    TIERRA(5.97E24, 6.371e6),
    JUPITER(1.9E27, 6.9911e7);
    
    private final double masa;   // kg
    private final double radio;  // m
    
    // CONSTRUCTOR (solo private por defecto)
    Planeta(double masa, double radio) {
        this.masa = masa;
        this.radio = radio;
    }
    
    // MÉTODOS
    public double masaSuperficie() {
        return masa / (4 * Math.PI * radio * radio);
    }
    
    // MÉTODO ESTÁTICO
    public static double masaPromedio() {
        double suma = 0;
        for(Planeta p : values()) suma += p.masa;
        return suma / values().length;
    }
}
