package ui.frames;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Frame extends JFrame{

    static GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    static int width = gd.getDisplayMode().getWidth();
    public static int height = gd.getDisplayMode().getHeight();

    public static int height(){
        return height;
    }

    public Frame() throws HeadlessException {
        super("Electro™");

        URL iconURL = getClass().getResource("/assets/logo_s.png");
        ImageIcon img = new ImageIcon(iconURL);
        setIconImage(img.getImage());

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setJMenuBar(Menu.getMenu());
        setSize(new Dimension((int)(width*0.5),(int)(height*0.8)));
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        setLayout(new BorderLayout());
        setResizable(false);
    }
}
