package com.imjona.ui;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Header extends javax.swing.JPanel {
    
    public Header() {
        initComponents();
    }

    public JLabel getUsuario() {
        return lb_usuario_nombre;
    }

    public JLabel getUsuarioTipo() {
        return lb_usuario_tipo;
    }

    public Header setUsuario(String usuario) {
        lb_usuario_nombre.setText("@" + usuario);
        return this;
    }
    
    public Header setTipo(String tipo) {
        lb_usuario_tipo.setText(tipo);
        return this;
    }
    
    public Header setNombreCompleto(String nombre) {
        lb_nombre.setText(nombre);
        return this;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_imagen = new javax.swing.JLabel();
        lb_usuario_nombre = new javax.swing.JLabel();
        lb_usuario_tipo = new javax.swing.JLabel();
        lb_nombre = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 170, 182));

        lb_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageIcon icon = new ImageIcon(
            new ImageIcon(
                getClass().getResource("/resource/img_icon_admin.png"))
            .getImage().getScaledInstance(120, 95, Image.SCALE_SMOOTH));
        lb_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_admin.png"))); // NOI18N

        lb_usuario_nombre.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lb_usuario_nombre.setForeground(new java.awt.Color(0, 0, 102));
        lb_usuario_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_usuario_nombre.setText("@ImJona");

        lb_usuario_tipo.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lb_usuario_tipo.setForeground(new java.awt.Color(255, 255, 255));
        lb_usuario_tipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_usuario_tipo.setText("Administrador");

        lb_nombre.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lb_nombre.setForeground(new java.awt.Color(0, 0, 0));
        lb_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nombre.setText("Jonathan Salvador Hernández Santos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addComponent(lb_usuario_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lb_usuario_tipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lb_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lb_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_usuario_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_usuario_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb_imagen;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_usuario_nombre;
    private javax.swing.JLabel lb_usuario_tipo;
    // End of variables declaration//GEN-END:variables
}
