package ui.listview;

import logic.Constraints;
import models.Parts;
import ui.frames.Frame;

import javax.swing.*;
import java.awt.*;

public class Listmodel extends JPanel implements ListCellRenderer<Parts> {

    int height = (int) (Frame.height() * ((double) 1/30));
    Labels description_label = new Labels();
    Labels price_label = new Labels();

    public Listmodel() {
        setPreferredSize(new Dimension(getWidth(), height));
        setLayout(new GridBagLayout());
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));

        Constraints.add(this, description_label,   0, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.1, 1);
        Constraints.add(this, price_label,         1, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, 0.1, 1);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Parts> list, Parts value, int index, boolean isSelected, boolean cellHasFocus) {
        description_label.setText("" + value.getManufacturer());
        price_label.setText("" + value.getPrice() + " kr.");
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        return this;
    }
}
