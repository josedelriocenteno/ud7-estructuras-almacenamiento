/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encuesta;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author delcenjo
 */
public class App {
    
    public static void main(String[] args) {
        
        Usuario u1 = new Usuario("pepe@gregoriofer.com");
        Usuario u2 = new Usuario("juana@gregoriofer.com");        
        JOptionPane.showMessageDialog(null, "Se han creado los siguientes usuarios:\n\t" + u1 + "\n\t" + u2);
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        GUIUsuarios gui = new GUIUsuarios(listaUsuarios);
    }
    
}
