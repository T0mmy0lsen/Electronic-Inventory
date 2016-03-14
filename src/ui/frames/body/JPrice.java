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
        setLayout(new BorderLayout());
        label.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(label, BorderLayout.CENTER);
    }
}
