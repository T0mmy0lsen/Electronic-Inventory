package ui;

import logic.Constraints;
import ui.buttons.ButtonParts;
import ui.frames.*;
import ui.frames.MainFrame;
import javax.swing.*;
import java.awt.*;

public class Userinterface {

    public static JScrollPane listview;

    public Userinterface(){

        // ------------------------------------------------------------
        // All Items used for the UI.
        listview = new JScrollPane();

        MainFrame mainFrame = new MainFrame();
        MainJPanel mainJPanel = new MainJPanel();
        JPanel header = new JPanel();
        JPanel infoPanel = new JPanel();
        JPanel infoPanel_pic = new JPanel();
        JPanel infoPanel_select = new JPanel();

        ButtonParts buttonParts_0 = new ButtonParts("CPU");
        ButtonParts buttonParts_1 = new ButtonParts("CABINET");
        ButtonParts buttonParts_2 = new ButtonParts("COOLER");
        ButtonParts buttonParts_3 = new ButtonParts("GRAPHICCARD");
        ButtonParts buttonParts_4 = new ButtonParts("MOTHERBOARD");
        ButtonParts buttonParts_5 = new ButtonParts("POWERSUPPLY");
        ButtonParts buttonParts_6 = new ButtonParts("RAM");
        ButtonParts buttonParts_7 = new ButtonParts("STORAGE");

        // ------------------------------------------------------------
        // mainJPanel position grid and GridBagConstraints.
        Constraints.add(mainJPanel, buttonParts_0,          0, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.125, 0.08);
        Constraints.add(mainJPanel, buttonParts_1,          1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.125, 0.08);
        Constraints.add(mainJPanel, buttonParts_2,          2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.125, 0.08);
        Constraints.add(mainJPanel, buttonParts_3,          3, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.125, 0.08);
        Constraints.add(mainJPanel, buttonParts_4,          4, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.125, 0.08);
        Constraints.add(mainJPanel, buttonParts_5,          5, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.125, 0.08);
        Constraints.add(mainJPanel, buttonParts_6,          6, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.125, 0.08);
        Constraints.add(mainJPanel, buttonParts_7,          7, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.125, 0.08);
        Constraints.add(mainJPanel, header,                 0, 0, 8, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 1, 0.36);
        Constraints.add(mainJPanel, infoPanel_select,       0, 2, 8, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 1, 0.01);
        Constraints.add(mainJPanel, infoPanel_pic,          0, 3, 2, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.25, 0.25);
        Constraints.add(mainJPanel, infoPanel,              2, 3, 6, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.75, 0.15);
        Constraints.add(mainJPanel, listview,               0, 4, 8, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 1, 0.4);

        // ------------------------------------------------------------
        // adding mainJPanel to the mainFrame.
        mainFrame.add(mainJPanel);
    }
}

