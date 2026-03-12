/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cola;

/**
 *
 * @author delcenjo
 */
public class Documento {
    
    private String nombreDocumento;
    private int numeroPaginas;

    public Documento(String nombreDocumento, int numeroPaginas) {
        this.nombreDocumento = nombreDocumento;
        this.numeroPaginas = numeroPaginas;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Documento{" + "nombreDocumento:" + nombreDocumento + "(" + numeroPaginas + " pag.}";
    }
    
    
}
