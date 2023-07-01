package com.imjona.ui.table;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class TableActionRenderer extends DefaultTableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
        PanelAction1 panel = new PanelAction1();
        if (isSelected == false && row % 2 == 0) {
            panel.setBackground(Color.WHITE);
        }
        panel.setBackground(com.getBackground());
        return panel;
    }
}
