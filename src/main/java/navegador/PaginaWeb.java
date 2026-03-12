/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navegador;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author delcenjo
 */
public class PaginaWeb {
    
    private String URL;
    private String titulo;
    private LocalDateTime fechaVisita;
    private static int contador;

    public PaginaWeb(String URL, String titulo) {
        this.URL = URL;
        this.titulo = titulo;
        this.fechaVisita = LocalDateTime.now();
        contador++;
    }

    public static int getContador() {
        return contador;
    }
    
    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(LocalDateTime fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    @Override
    public String toString() {
        return titulo + "(" +
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT).format(fechaVisita) + ")";
    }
    
}
