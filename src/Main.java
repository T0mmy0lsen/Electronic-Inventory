
import database.Query;
import models.Parts;
import ui.Userinterface;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class Main {

    static Userinterface ui;
    static Query query = new Query();

    public static void main(String[] args) throws SQLException{
        initUI();

        /*
        long startTime = System.currentTimeMillis();
        ArrayList<Parts> cpu = query.getAll("SELECT * FROM cpu WHERE socket='LGA1151'");
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
        System.out.print(cpu.get(0).getModelname());
        */

    }

    protected static void initUI(){
        if(ui == null){
            SwingUtilities.invokeLater(() -> ui = new Userinterface());
        } else {
            System.out.println("UI already running");
        }
    }
}
