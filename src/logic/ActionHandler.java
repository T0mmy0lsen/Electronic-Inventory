package logic;

import models.Parts;
import Userinterface;
import ui.listview.Listview;

import javax.swing.*;
import java.util.ArrayList;

public class ActionHandler {

    static Query query = new Query();
    static ArrayList<Parts> listItems;

    public static void buttonClicked(String text){
        // New list for the parts returned by the query.
        listItems = new ArrayList<Parts>();
        listItems = query.getAll("SELECT * FROM " + text);
        // Update the UI.
        SwingUtilities.invokeLater(() -> {
            Userinterface.listview.revalidate();
            Userinterface.listview.setViewportView(new Listview(listItems));
        });
    }

}
