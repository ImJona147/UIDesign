package com.imjona.ui;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

public class Tarjeta extends javax.swing.JPanel {
    private Color gradient1;
    private Color gradient2;
    
    public Tarjeta() {
        initComponents();
        setOpaque(false);
        gradient1 = new Color(127, 127, 213);
        gradient2 = new Color(134,168,231);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_titulo = new javax.swing.JLabel();
        lb_valores = new javax.swing.JLabel();
        lb_descripcion = new javax.swing.JLabel();

        lb_titulo.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo.setText("Título");

        lb_valores.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lb_valores.setForeground(new java.awt.Color(255, 255, 255));
        lb_valores.setText("Valores");

        lb_descripcion.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lb_descripcion.setForeground(new java.awt.Color(255, 255, 255));
        lb_descripcion.setText("Descripción");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_descripcion)
                    .addComponent(lb_valores)
                    .addComponent(lb_titulo))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_valores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_descripcion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, gradient1, 0, getHeight(), gradient2);
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255, 255, 255, 50));
        //g2.fillOval(getWidth() - (getHeight() / 2), 10, getHeight(), getHeight());
        //g2.fillOval(getWidth() - (getHeight() / 2) - 20, getHeight() / 2 + 20, getHeight(), getHeight());       
        super.paintComponent(grphcs);
    }

    public Color getGradient1() {
        return gradient1;
    }

    public void setGradient1(Color gradient1) {
        this.gradient1 = gradient1;
    }

    public Color getGradient2() {
        return gradient2;
    }
    
    public void setGradient2(Color gradient2) {
        this.gradient2 = gradient2;
    }

    public JLabel getLb_descripcion() {
        return lb_descripcion;
    }

    public void setLb_descripcion(JLabel lb_descripcion) {
        this.lb_descripcion = lb_descripcion;
    }

    public JLabel getLb_titulo() {
        return lb_titulo;
    }

    public void setLb_titulo(JLabel lb_titulo) {
        this.lb_titulo = lb_titulo;
    }

    public JLabel getLb_valores() {
        return lb_valores;
    }

    public void setLb_valores(JLabel lb_valores) {
        this.lb_valores = lb_valores;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb_descripcion;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel lb_valores;
    // End of variables declaration//GEN-END:variables
}
