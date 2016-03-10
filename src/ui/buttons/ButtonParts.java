package ui.buttons;

import javax.swing.*;
import java.awt.*;

public class ButtonParts extends JButton{
    public ButtonParts(String text) {
        super(text);
        setFont(new Font("TimesRoman", Font.PLAIN, 30));
    }
}
