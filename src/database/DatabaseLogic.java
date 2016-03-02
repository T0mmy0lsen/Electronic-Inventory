package database;

import models.Cabinet;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class DatabaseLogic {

    static Statement statement;
    static Boolean result_bool;
    static int result_int;
    static ArrayList<String> table_names;

    public DatabaseLogic(String db, String un, String pw){
        statement = new ConnectTo(db, un, pw).establishConnection();
    }

    public void update(String query){
        try {
            result_bool = statement.execute(query);
            result_int = statement.getUpdateCount();
            if(result_int != -1) {
                System.out.println(result_int + " items was succesfully updated");
            }
        } catch(SQLException e){
            System.out.println("error on update");
        }
    }

    public ArrayList<?> returnTable(String table, String query){
        String model = table.toLowerCase();
        ArrayList<?> list = new ArrayList<>();
        ArrayList<String> listColnames = new ArrayList<>();
        if(foundInDatabase(model)){
            System.out.println("Succes! Table was found");
            listColnames = getColnames(model);
            list = getList(query);
        } else {
            System.out.println("Error! Table not found");
        }
        return list;
    }

    private ArrayList<String> getColnames(String model) {
        return null;
    }

    private Boolean foundInDatabase(String table) {
        if(!(table_names == null)){
            return table_names.contains(table);
        } else {
            try {
                table_names = new ArrayList<>();
                String command = "SELECT TABLE_NAME FROM information_schema.tables where TABLE_SCHEMA = 'public'";
                result_bool = statement.execute(command);
                ResultSet rs = statement.getResultSet();
                while (rs.next()){
                    String table_name = rs.getString(1);
                    table_names.add(table_name);
                }
                return table_names.contains(table);
            } catch (SQLException e){
                System.out.println("no tables were found");
                return false;
            }
        }
    }


    private ArrayList<?> getList(String query) {
        return null;
    }
}
