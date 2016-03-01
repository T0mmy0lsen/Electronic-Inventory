import java.sql.*;

public class Main {

    static Database db = new Database("Database", "postgres", "secret");

    public static void main(String[] args) throws SQLException{
        ResultSet rs = db.queryRS("SELECT * FROM album");
    }
}
