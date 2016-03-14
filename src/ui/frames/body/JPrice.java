package ui.frames.body;

import logic.Constraints;

import javax.swing.*;
import java.awt.*;

public class JPrice extends JPanel{

    public static JLabel label = new JLabel();

    @Override
    public Dimension getPreferredSize() {
        Dimension size = super.getPreferredSize();
        size.setSize(new Dimension(0,0));
        return size;
    }

    public JPrice() {
        setLayout(new GridBagLayout());
        Constraints.add(this, label,         0, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 1, 1);
    }
}
