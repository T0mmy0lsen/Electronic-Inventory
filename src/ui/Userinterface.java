package ui;

import database.Query;
import models.Parts;
import ui.listview.Listview;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;

public class Userinterface {

    static ArrayList<Parts> listItems;
    static Query query = new Query();
    private static final Insets insets = new Insets(3, 3, 3, 3);
    private enum actions{
        CPU, MOTHERBOARD, GRAPHICS, POWER, RAM, STORAGE, COOLER, CABINET
    }

    // ------------------------------------------------------------

    public Userinterface(){
        // ------------------------------------------------------------
        // All J-Items used for the grid.
        JPanel header = new JPanel();
        JPanel infoPanel = new JPanel();
        JPanel infoPanel_pic = new JPanel();
        JPanel infoPanel_select = new JPanel();
        JScrollPane listview = new JScrollPane();
        JButton startButton_0 = new JButton();
        JButton startButton_1 = new JButton();
        JButton startButton_2 = new JButton();
        JButton startButton_3 = new JButton();
        JButton startButton_4 = new JButton();
        JButton startButton_5 = new JButton();
        JButton startButton_6 = new JButton();
        JButton startButton_7 = new JButton();

        // ------------------------------------------------------------
        // set actions on buttons
        startButton_0.addActionListener(e -> {
            listItems = new ArrayList<Parts>();
            listItems = query.getAll("SELECT * FROM cpu");
            listview.revalidate();
            listview.setViewportView(new Listview(listItems));
        });

        startButton_1.addActionListener(e -> {

            listItems = new ArrayList<Parts>();
            listItems = query.getAll("SELECT * FROM motherboard");
            listview.revalidate();
            SwingUtilities.invokeLater(() -> listview.setViewportView(new Listview(listItems)));

        });

        startButton_2.addActionListener(e -> {
            listItems = new ArrayList<Parts>();
            listItems = query.getAll("SELECT * FROM cabinet");
            listview.revalidate();
            SwingUtilities.invokeLater(() -> listview.setViewportView(new Listview(listItems)));
        });



        // ------------------------------------------------------------
        // jPanel_main

        JPanel jPanel_main = new JPanel();
        jPanel_main.setLayout(new GridBagLayout());
        jPanel_main.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel_main.setBackground(Color.WHITE);

        // ------------------------------------------------------------
        // jPanel_main position grid and GridBagConstraints.

        addComponent(jPanel_main, startButton_0,        0, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.125, 0.08);
        addComponent(jPanel_main, startButton_1,        1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.125, 0.08);
        addComponent(jPanel_main, startButton_2,        2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.125, 0.08);
        addComponent(jPanel_main, startButton_3,        3, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.125, 0.08);
        addComponent(jPanel_main, startButton_4,        4, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.125, 0.08);
        addComponent(jPanel_main, startButton_5,        5, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.125, 0.08);
        addComponent(jPanel_main, startButton_6,        6, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.125, 0.08);
        addComponent(jPanel_main, startButton_7,        7, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.125, 0.08);

        addComponent(jPanel_main, header,               0, 0, 8, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 1, 0.36);
        addComponent(jPanel_main, infoPanel_select,     0, 2, 8, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 1, 0.01);
        addComponent(jPanel_main, infoPanel_pic,        0, 3, 2, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.25, 0.25);
        addComponent(jPanel_main, infoPanel,            2, 3, 6, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.75, 0.15);
        addComponent(jPanel_main, listview,             0, 4, 8, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 1, 0.4);

        // ------------------------------------------------------------
        // Setting JFrame along with icon.

        URL iconURL = getClass().getResource("/assets/logo_s.png");
        ImageIcon img = new ImageIcon(iconURL);

        JFrame frame = Frame.getFrame();
        frame.setIconImage(img.getImage());
        frame.add(jPanel_main);
        // ------------------------------------------------------------


    }
    // ------------------------------------------------------------
    // Cpu was selected do;
    public static void cpuSelected(Parts parts){
        String was = parts.getType();
        System.out.println(was);
    }

    // ------------------------------------------------------------
    // GridBagLayout constraints/layout settings.

    private static void addComponent(Container con, Component com, int x, int y, int width, int height, int anchor, int fill, double wx, double wy) {
        GridBagConstraints gbc = new GridBagConstraints(x, y, width, height, wx, wy, anchor, fill, insets, 0, 0);
        con.add(com, gbc);
    }
}

