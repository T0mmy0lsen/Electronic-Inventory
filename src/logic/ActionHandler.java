package logic;

import models.BuildPrice;
import models.Parts;
import ui.Userinterface;
import ui.frames.body.BodyJPanel;
import ui.frames.body.JPrice;
import ui.listview.ListView;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ActionHandler {

    static Query query = new Query();
    static ArrayList<Parts> listItems;
    static BuildPrice build = new BuildPrice();

    public static void buttonClicked(String text){
        // New list for the parts returned by the query.
        new Thread(() -> {
            listItems = new ArrayList<Parts>();
            listItems = query.getAll("SELECT * FROM " + text);
            // Update the UI.
            SwingUtilities.invokeLater(() -> {
                Userinterface.listview.setViewportView(new ListView(listItems, text));
            });
        }).start();
    }

    public static void itemClicked(Parts parts, String type) {
        new Thread(() -> {
            switch (type) {
                case "cpu":
                    build.setCpu(parts.getPrice());
                    break;
                case "motherboard":
                    build.setMotherboard(parts.getPrice());
                    break;
            }
            SwingUtilities.invokeLater(() -> {
                JPrice.label.setText("<html><div style='text-align: center;'>" + build.getPrice() + "</html>");
            });
        }).start();
    }
}
