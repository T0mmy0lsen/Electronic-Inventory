package ui.frames;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class Menu {
    public static JMenuBar getMenu(){
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Admin");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);

        JMenuItem newMenuItem = new JMenuItem("New", KeyEvent.VK_N);
        fileMenu.add(newMenuItem);

        return menuBar;
    }
}
