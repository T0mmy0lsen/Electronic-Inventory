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
        MainFrame frame = new MainFrame();
        MainJPanel jPanel_main = new MainJPanel();
        JPanel header = new JPanel();
        JPanel infoPanel = new JPanel();
        JPanel infoPanel_pic = new JPanel();
        JPanel infoPanel_select = new JPanel();
        listview = new JScrollPane();
        ButtonParts startButton_0 = new ButtonParts("CPU");
        ButtonParts startButton_1 = new ButtonParts("CABINET");
        ButtonParts startButton_2 = new ButtonParts("COOLER");
        ButtonParts startButton_3 = new ButtonParts("GRAPHICCARD");
        ButtonParts startButton_4 = new ButtonParts("MOTHERBOARD");
        ButtonParts startButton_5 = new ButtonParts("POWERSUPPLY");
        ButtonParts startButton_6 = new ButtonParts("RAM");
        ButtonParts startButton_7 = new ButtonParts("STORAGE");

        // ------------------------------------------------------------
        // jPanel_main position grid and GridBagConstraints.
        Constraints.add(jPanel_main, startButton_0,        0, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.125, 0.08);
        Constraints.add(jPanel_main, startButton_1,        1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.125, 0.08);
        Constraints.add(jPanel_main, startButton_2,        2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.125, 0.08);
        Constraints.add(jPanel_main, startButton_3,        3, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.125, 0.08);
        Constraints.add(jPanel_main, startButton_4,        4, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.125, 0.08);
        Constraints.add(jPanel_main, startButton_5,        5, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.125, 0.08);
        Constraints.add(jPanel_main, startButton_6,        6, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.125, 0.08);
        Constraints.add(jPanel_main, startButton_7,        7, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.125, 0.08);
        Constraints.add(jPanel_main, header,               0, 0, 8, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 1, 0.36);
        Constraints.add(jPanel_main, infoPanel_select,     0, 2, 8, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 1, 0.01);
        Constraints.add(jPanel_main, infoPanel_pic,        0, 3, 2, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.25, 0.25);
        Constraints.add(jPanel_main, infoPanel,            2, 3, 6, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.75, 0.15);
        Constraints.add(jPanel_main, listview,             0, 4, 8, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 1, 0.4);

        // ------------------------------------------------------------
        // adding jPanel_main to the main frame.
        frame.add(jPanel_main);
    }
}

