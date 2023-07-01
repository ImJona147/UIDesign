package com.imjona.ui.table;

import com.imjona.ui.table.event.TableActionEvent;
import java.awt.event.ActionEvent;

public class PanelAction extends javax.swing.JPanel {
    
    public PanelAction() {
        initComponents();
    }
    
    public void iniciarEvento(TableActionEvent event, int row) {
        btn_edit.addActionListener((ActionEvent e) -> {
            event.alModificar(row);
        });
//        btn_trash.addActionListener((ActionEvent e) -> {
//            event.alEliminar(row);
//        });
        btn_view.addActionListener((ActionEvent e) -> {
            event.alMirar(row);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_edit = new com.imjona.ui.table.ActionButton();
        btn_trash = new com.imjona.ui.table.ActionButton();
        btn_view = new com.imjona.ui.table.ActionButton();

        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_icon_edit_2.png"))); // NOI18N

        btn_trash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_icon_trash_2.png"))); // NOI18N

        btn_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/img_icon_view_2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_trash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_view, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_view, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_trash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.imjona.ui.table.ActionButton btn_edit;
    private com.imjona.ui.table.ActionButton btn_trash;
    private com.imjona.ui.table.ActionButton btn_view;
    // End of variables declaration//GEN-END:variables
}
