package ui.frames;

import logic.Constraints;

import javax.swing.*;
import java.awt.*;

public class HeaderJPanel extends JPanel {

    JPanel jPanel = new JPanel();

    public HeaderJPanel() {
        setLayout(new GridBagLayout());

        jPanel.setBackground(Color.gray);

        Constraints.add(this, jPanel,          0, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 1, 1);
    }
}
