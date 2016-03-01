import org.postgresql.util.PSQLException;

import java.sql.*;

public class Database {

    static Connection connection;

    private final String _dbname;
    private final String _username;
    private final String _password;


    public Database(String dbname, String username, String password) {
        this._dbname = dbname;
        this._username = username;
        this._password = password;
        establishConnection();
    }

    private void establishConnection() {
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
        } catch (SQLException e) {
            System.out.println("Error connecting to database");
        }
    }

    public ResultSet queryRS(String query) throws SQLException{
        Statement stmt = connection.createStatement();
        return stmt.executeQuery(query);
    }

    public void getTableResult(ResultSet rs) throws SQLException{
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        for (int i = 1; i <= columnCount; i++ ) {
            String name = rsmd.getColumnName(i);
            System.out.print("Column: " + name + " | ");
        }

        System.out.println("");

        while(rs.next()){
            for (int i = 1; i <= columnCount; i++ ) {
                System.out.print("" + rs.getString(i) + "  ");
            }
            System.out.println("");
        }
        rs.close();
    }
}
