package logic;

import models.Parts;
import ui.Userinterface;
import ui.listview.ListView;
import javax.swing.*;
import java.util.ArrayList;

public class ActionHandler {

    static Query query = new Query();
    static ArrayList<Parts> listItems;

    public static void buttonClicked(String text){
        // New list for the parts returned by the query.
        new Thread(() -> {
            listItems = new ArrayList<Parts>();
            listItems = query.getAll("SELECT * FROM " + text);
            // Update the UI.
            SwingUtilities.invokeLater(() -> {
                Userinterface.listview.revalidate();
                Userinterface.listview.setViewportView(new ListView(listItems));
            });
        }).start();
    }
}
