package logic;

import java.awt.*;

public class Constraints {
    private static final Insets insets = new Insets(3, 3, 3, 3);

    public static void add(Container con, Component com, int x, int y, int w, int h, int a, int f, double wx, double wy) {
        GridBagConstraints gbc = new GridBagConstraints(x, y, w, h, wx, wy, a, f, insets, 0, 0);
        con.add(com, gbc);
    }
}
