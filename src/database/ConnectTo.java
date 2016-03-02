package database;

import java.sql.*;

public class ConnectTo {

    static Connection connection;
    static Statement statement;

    private final String _dbname;
    private final String _username;
    private final String _password;

    public ConnectTo(String dbname, String username, String password) {
        this._dbname = dbname;
        this._username = username;
        this._password = password;
    }

    protected Statement establishConnection(){
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Error");
        }

        try {
            String url = "jdbc:postgresql://localhost/";
            connection = DriverManager.getConnection(url + _dbname, _username, _password);
            System.out.println("Connected to database");
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println("Error connecting to database");
        }
        return statement;
    }
}
