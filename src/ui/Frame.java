package ui;
import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Frame {

    static GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    static int width = gd.getDisplayMode().getWidth();
    public static int height = gd.getDisplayMode().getHeight();

    public static int height(){
        return height;
    }

    public static JFrame getFrame(){
        JFrame jFrame = new JFrame("Electro™");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setJMenuBar(Menu.getMenu());
        jFrame.setSize(new Dimension((int)(width*0.5),(int)(height*0.8)));
        jFrame.setLocationRelativeTo(null);
        jFrame.getContentPane().setBackground(Color.WHITE);
        jFrame.setVisible(true);
        jFrame.setLayout(new BorderLayout());
        jFrame.setResizable(false);

        return jFrame;
    }
}
