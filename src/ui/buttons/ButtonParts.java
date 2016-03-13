package ui.buttons;

import Userinterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonParts extends JButton implements ActionListener{

    String text;

    public ButtonParts(String text) {
        this.text = text.toLowerCase();
        this.addActionListener(this);
        setFont(new Font("TimesRoman", Font.PLAIN, 30));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Userinterface.buttonClicked(text);
    }
}
