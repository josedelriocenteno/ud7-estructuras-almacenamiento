/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encuesta;

/**
 *
 * @author delcenjo
 */
public class Usuario {
    
    private static int contador = 0;
    private int idUsuaio;
    private String mail;

    public Usuario(String mail) {
        contador ++;
        this.idUsuaio = contador;
        this.mail = mail;
    }

    public int getIdUsuaio() {
        return idUsuaio;
    }

    public void setIdUsuaio(int idUsuaio) {
        this.idUsuaio = idUsuaio;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuaio=" + idUsuaio + ", mail=" + mail + '}';
    }
    
    
    
}
