package logic;

import models.BuildItems;
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
    static BuildPrice buildPrice = new BuildPrice();
    static BuildItems buildItems = new BuildItems();
    public static ArrayList<Integer> itemIds;

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
                    buildPrice.setCpu(parts.getPrice());
                    buildItems.setCpu(parts.getId());
                    break;
                case "motherboard":
                    buildPrice.setMotherboard(parts.getPrice());
                    buildItems.setCpu(parts.getId());
                    break;
            }
            itemIds = buildItems.getIds();
            SwingUtilities.invokeLater(() -> {
                JPrice.label.setText("<html><div style='text-align: center;'>" + buildPrice.getPrice() + "</html>");
            });
        }).start();
    }
}
