package ui.frames.body;

import logic.Constraints;

import javax.swing.*;
import java.awt.*;

public class BodyJPanel extends JPanel{

    JPanel picture = new JPanel();
    JPanel cpu = new JPanel();
    JPanel motherboard = new JPanel();
    JPanel graphiccard = new JPanel();
    JPanel storage = new JPanel();
    public static JPrice price = new JPrice();

    public BodyJPanel() {
        setLayout(new GridBagLayout());

        picture.setBackground(Color.red);
        cpu.setBackground(Color.BLUE);
        price.setBackground(Color.CYAN);
        graphiccard.setBackground(Color.green);
        storage.setBackground(Color.orange);
        motherboard.setBackground(Color.pink);

        Constraints.add(this, picture,      0, 0, 1, 4, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.33, 1);
        Constraints.add(this, cpu,          1, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.33, 0.25);
        Constraints.add(this, motherboard,  1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.33, 0.25);
        Constraints.add(this, graphiccard,  1, 2, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.33, 0.25);
        Constraints.add(this, storage,      1, 3, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.33, 0.25);
        Constraints.add(this, price,        2, 3, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.33, 0.25);
    }
}
