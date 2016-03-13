package ui.listview;

import models.Parts;
import Userinterface;

import javax.swing.*;
import java.util.ArrayList;

public class Listview extends JList {

    public Listview(ArrayList<Parts> items) {
        DefaultListModel<Parts> list = new DefaultListModel<>();

        for(int i = 0; i < items.size(); i++) {
            list.addElement(items.get(i));
        }

        setModel(list);
        setCellRenderer(new Listmodel());

        ListSelectionModel selectionModel = this.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        selectionModel.addListSelectionListener(e -> {
            if (e.getValueIsAdjusting()) {
                int selectedRow = getSelectedIndex();
                itemSelected(items.get(selectedRow));
            }
        });
    }

    public void itemSelected(Parts parts){
        String was = parts.getType();
        System.out.println(was);
    }
}
