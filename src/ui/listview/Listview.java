package ui.listview;

import logic.ActionHandler;
import models.Parts;
import ui.Userinterface;

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollPaneUI;
import java.awt.*;
import java.util.ArrayList;
import java.util.StringJoiner;

public class ListView extends JList {

    String type;

    @Override
    public Dimension getPreferredScrollableViewportSize() {
        Dimension size = super.getPreferredScrollableViewportSize();
        size.setSize(new Dimension(0,0));
        return size;
    }

    public ListView(ArrayList<Parts> items, String type) {
        this.type = type;
        DefaultListModel<Parts> list = new DefaultListModel<>();

        for(int i = 0; i < items.size(); i++) {
            list.addElement(items.get(i));
        }

        setModel(list);
        setCellRenderer(new ListModel());

        ListSelectionModel selectionModel = this.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        selectionModel.addListSelectionListener(e -> {
            if (e.getValueIsAdjusting()) {
                int selectedRow = getSelectedIndex();
                itemSelected(items.get(selectedRow));
            }
        });
    }

    public void itemSelected(Parts parts) {
        ActionHandler.itemClicked(parts, type);
    }
}
