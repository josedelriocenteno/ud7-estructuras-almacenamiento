/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package navegador;

import java.util.LinkedList;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author delcenjo
 */
public class NavegadorSwing extends javax.swing.JFrame {

    private static LinkedList<PaginaWeb> paginas;
    private MiModeloLista modeloLista;
    
    public NavegadorSwing() {
        initComponents();
        setFrame();
    }

    public void crearPaginasEjemplo(){
        modeloLista.addFirst(new PaginaWeb("https://www.google.com", "Google"));
        modeloLista.addFirst(new PaginaWeb("https://www.youtube.com", "YouTube"));
        modeloLista.addFirst(new PaginaWeb("https://www.github.com", "GitHub"));
        modeloLista.addFirst(new PaginaWeb("https://stackoverflow.com", "Stack Overflow"));
        modeloLista.addFirst(new PaginaWeb("https://www.wikipedia.org", "Wikipedia"));
        modeloLista.addFirst(new PaginaWeb("https://www.oracle.com", "Oracle"));
        modeloLista.addFirst(new PaginaWeb("https://www.reddit.com", "Reddit"));
        modeloLista.addFirst(new PaginaWeb("https://www.amazon.es", "Amazon"));
        modeloLista.addFirst(new PaginaWeb("https://www.marca.com", "Marca"));
        modeloLista.addFirst(new PaginaWeb("https://campusvirtual.universidad.es", "Campus Virtual"));
        String mensaje = "Se han creado por defecto 10 páginas web para las pruebas:\n";
        for (PaginaWeb pagina : paginas) {
            mensaje += "- " + pagina.getTitulo() + "\n";
        }
        JOptionPane.showMessageDialog(this, mensaje);
    }
    
    public void setFrame(){
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        paginas = new LinkedList<>();
        this.modeloLista = new MiModeloLista(paginas);
        this.jListHistorial.setModel(modeloLista);
        this.setTitle("Navegador Swing 1ºDAM");
        crearPaginasEjemplo();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNavegacion = new javax.swing.JPanel();
        jLabelUrl = new javax.swing.JLabel();
        jTextField1Url = new javax.swing.JTextField();
        jLabelTitulo = new javax.swing.JLabel();
        jTextTitulo = new javax.swing.JTextField();
        jButtonVisitar = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jButtonAtras1 = new javax.swing.JButton();
        panelHistorial = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListHistorial = new javax.swing.JList<>();
        panelInformacion = new javax.swing.JPanel();
        jLabelAlfabeto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelNavegacion.setLayout(new javax.swing.BoxLayout(panelNavegacion, javax.swing.BoxLayout.LINE_AXIS));

        jLabelUrl.setText("URL: ");
        panelNavegacion.add(jLabelUrl);

        jTextField1Url.setColumns(40);
        panelNavegacion.add(jTextField1Url);

        jLabelTitulo.setText("Título: ");
        panelNavegacion.add(jLabelTitulo);

        jTextTitulo.setColumns(10);
        panelNavegacion.add(jTextTitulo);

        jButtonVisitar.setText("Visitar");
        jButtonVisitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisitarActionPerformed(evt);
            }
        });
        panelNavegacion.add(jButtonVisitar);

        jButtonAtras.setText("Atras");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        panelNavegacion.add(jButtonAtras);

        jButtonAtras1.setText("Adelante");
        jButtonAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtras1ActionPerformed(evt);
            }
        });
        panelNavegacion.add(jButtonAtras1);

        getContentPane().add(panelNavegacion, java.awt.BorderLayout.PAGE_START);

        panelHistorial.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setViewportView(jListHistorial);

        panelHistorial.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelHistorial, java.awt.BorderLayout.CENTER);

        panelInformacion.setLayout(new javax.swing.BoxLayout(panelInformacion, javax.swing.BoxLayout.LINE_AXIS));

        jLabelAlfabeto.setText("Página actual");
        panelInformacion.add(jLabelAlfabeto);

        getContentPane().add(panelInformacion, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVisitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisitarActionPerformed
        String url = jTextField1Url.getText();
        if(validarURL(url)){
            PaginaWeb pag = new PaginaWeb(url,jTextTitulo.getText());
            modeloLista.addFirst(pag);
        }else JOptionPane.showMessageDialog(this, "Debes de introducir una URL válida",
                    "Error", JOptionPane.ERROR_MESSAGE);
        jTextTitulo.setText("");
        jTextField1Url.setText("");
    }//GEN-LAST:event_jButtonVisitarActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        String url = this.modeloLista.getElementAt(1).getURL();
        String titulo = this.modeloLista.getElementAt(1).getTitulo();
        this.modeloLista.addFirst(new PaginaWeb(url,titulo));
        jTextTitulo.setText(titulo);
        jTextField1Url.setText(url);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtras1ActionPerformed
        String url = this.modeloLista.getElementAt(0).getURL();
        String titulo = this.modeloLista.getElementAt(0).getTitulo();
        this.modeloLista.addFirst(new PaginaWeb(url,titulo));
        jTextTitulo.setText(titulo);
        jTextField1Url.setText(url);
    }//GEN-LAST:event_jButtonAtras1ActionPerformed
    
    private static final Pattern PATRON_URL = Pattern.compile(
        "^(https?://)" +
        "([\\w-]+\\.)+[\\w-]{2,}" +
        "(:\\d+)?" +
        "(/[^\\s]*)?$",
        Pattern.CASE_INSENSITIVE
    );

    public static boolean validarURL(String url) {
        return PATRON_URL.matcher(url).matches();
    }
    
    public static void main(String args[]) {
        new NavegadorSwing().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonAtras1;
    private javax.swing.JButton jButtonVisitar;
    private javax.swing.JLabel jLabelAlfabeto;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUrl;
    private javax.swing.JList<PaginaWeb> jListHistorial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1Url;
    private javax.swing.JTextField jTextTitulo;
    private javax.swing.JPanel panelHistorial;
    private javax.swing.JPanel panelInformacion;
    private javax.swing.JPanel panelNavegacion;
    // End of variables declaration//GEN-END:variables
}
