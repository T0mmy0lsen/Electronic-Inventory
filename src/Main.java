import database.DatabaseLogic;

import java.sql.*;
import java.util.ArrayList;

public class Main {

    static DatabaseLogic db;
    static Userinterface ui;

    public static void main(String[] args) throws SQLException{
        connectToDatabase();
        db.returnTable("cabinet", "");
    }

    protected static void connectToDatabase(){
        String dbname = "Database";
        String username = "postgres";
        String password = "secret";

        if(db == null){
            db = new DatabaseLogic(dbname, username,password);
        } else {
            System.out.println("DB already initiated");
        }
    }

    protected static void initUI(){
        if(ui != null){
            ui = new Userinterface();
        } else {
            System.out.println("UI already running");
        }
    }
}
