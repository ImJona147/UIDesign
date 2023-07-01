package com.imjona.ui.table;

import com.imjona.ui.table.event.TableActionEvent;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class TableActionCellEditor extends DefaultCellEditor {
    private final TableActionEvent event;
    
    public TableActionCellEditor(TableActionEvent event) {
        super(new JCheckBox());
        this.event = event;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        PanelAction1 panel = new PanelAction1();
        panel.iniciarEvento(event, row);
        panel.setBackground(table.getBackground());
        return panel;
    }
}
