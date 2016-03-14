import ui.Userinterface;

import javax.swing.*;
import java.sql.*;

public class Main {

    static Userinterface ui;

    public static void main(String[] args) throws SQLException {
        initUI();
    }

    protected static void initUI() {
        if (ui == null) {
            SwingUtilities.invokeLater(() -> ui = new Userinterface());
        } else {
            System.out.println("UI already running");
        }
    }
}
