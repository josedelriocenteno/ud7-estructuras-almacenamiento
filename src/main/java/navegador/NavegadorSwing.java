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

    private static final Pattern PATRON_URL = Pattern.compile("^(https?://)([\\w-]+\\.)+[\\w-]{2,}(:\\d+)"
            + "?(/[^\\s]*)?$",Pattern.CASE_INSENSITIVE);

    private LinkedList<PaginaWeb> historialLista;
    private LinkedList<PaginaWeb> historialAtras;
    private LinkedList<PaginaWeb> historialAdelante;
    private MiModeloLista modeloLista;
    private PaginaWeb paginaActual;

    public NavegadorSwing() {
        initComponents();
        setFrame();
    }
    
    public void setFrame() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        historialLista = new LinkedList<>();
        historialAtras = new LinkedList<>();
        historialAdelante = new LinkedList<>();
        modeloLista = new MiModeloLista(historialLista);
        jListHistorial.setModel(modeloLista);
        paginaActual = new PaginaWeb("https://www.google.com", "Google");
        modeloLista.addFirst(paginaActual);
        actualizarCampos();
        actualizarPanelInformacion();
    }
    
    private void visitarPagina() {
        String url = jTextField1Url.getText().trim();
        String titulo = jTextTitulo.getText().trim();
        if (url.isEmpty() || !validarURL(url)) {
            JOptionPane.showMessageDialog(this,"URL no válida","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (paginaActual != null) {
            historialAtras.addFirst(paginaActual);
        }
        historialAdelante.clear();
        paginaActual = new PaginaWeb(url, titulo);
        modeloLista.addFirst(paginaActual);
        actualizarCampos();
        actualizarPanelInformacion();
    }
    
    private void irAtras() {
        if (historialAtras.isEmpty()) {
            JOptionPane.showMessageDialog(this,"No hay páginas anteriores");
            return;
        }
        historialAdelante.addFirst(paginaActual);
        paginaActual = historialAtras.removeFirst();
        modeloLista.addFirst(paginaActual);
        actualizarCampos();
        actualizarPanelInformacion();
    }
    
    private void irAdelante() {
        if (historialAdelante.isEmpty()) {
            JOptionPane.showMessageDialog(this,"No hay páginas siguientes");
            return;
        }

        historialAtras.addFirst(paginaActual);
        paginaActual = historialAdelante.removeFirst();
        modeloLista.addFirst(paginaActual);
        actualizarCampos();
        actualizarPanelInformacion();
    }
    
    private void actualizarCampos() {
        jTextField1Url.setText(paginaActual.getURL());
        jTextTitulo.setText(paginaActual.getTitulo());
    }
    
    private void actualizarPanelInformacion() {
        jLabelAlfabeto.setText("Página actual: " + paginaActual.getTitulo());
    }
    
    public static boolean validarURL(String url) {
        return PATRON_URL.matcher(url).matches();
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
        jButtonAdelante = new javax.swing.JButton();
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

        jButtonAdelante.setText("Adelante");
        jButtonAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdelanteActionPerformed(evt);
            }
        });
        panelNavegacion.add(jButtonAdelante);

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
        visitarPagina();
    }//GEN-LAST:event_jButtonVisitarActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        irAtras();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdelanteActionPerformed
        irAdelante();
    }//GEN-LAST:event_jButtonAdelanteActionPerformed

    public static void main(String args[]) {
        new NavegadorSwing().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdelante;
    private javax.swing.JButton jButtonAtras;
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
