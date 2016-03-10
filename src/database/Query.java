package database;

import models.Parts;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Query {

    public ResultSet result(String query){
        try {
            Statement statement = new ConnectDatabase("Database", "postgres", "secret").establishConnection();
            statement.execute(query);
            statement.closeOnCompletion();
            return statement.getResultSet();
        } catch (SQLException e){
            //
        }
        return null;
    }

    public ArrayList<Parts> getAll(String query){

        String manufacturer = "", modelname = "", size = "", socket = "", memory_type = "", type = "";
        int price = 0, cache = 0, power_com = 0, power_out = 0, cores = 0, memory = 0;
        double speed = 0;
        boolean cooler = false, onboard_graphic = false;

        List<String> columns = new ArrayList<>();
        ArrayList<Parts> list = new ArrayList<>();

        ResultSet rs = result(query);
        Class c = Query.class;

        try {
            ResultSetMetaData meta = rs.getMetaData();
            int count = meta.getColumnCount();

            for(int i = 0; i < count; i++){
                columns.add(meta.getColumnName(i+1));
            }

            while(rs.next()){
                for(int i = 1; i < count+1; i++) {
                    switch (columns.get(i-1)){
                        case "manufacturer": manufacturer = rs.getString(i);
                            break;
                        case "modelname": modelname = rs.getString(i);
                            break;
                        case "size": size = rs.getString(i);
                            break;
                        case "socket": socket = rs.getString(i);
                            break;
                        case "memory_type": memory_type = rs.getString(i);
                            break;
                        case "type": type = rs.getString(i);
                            break;
                        case "price": price = rs.getInt(i);
                            break;
                        case "cache": cache = rs.getInt(i);
                            break;
                        case "power_com": power_com = rs.getInt(i);
                            break;
                        case "speed": speed = rs.getDouble(i);
                            break;
                        case "cores": cores = rs.getInt(i);
                            break;
                        case "memory": speed = rs.getInt(i);
                            break;
                        case "cooler": cooler = rs.getBoolean(i);
                            break;
                        case "onboard_graphics": onboard_graphic = rs.getBoolean(i);
                            break;
                    }
                }
                list.add(new Parts(manufacturer, modelname, size, socket, memory_type, type, price, cache, power_com, power_out, speed, cores, memory, cooler, onboard_graphic));
            }
            return list;
        } catch (SQLException | NullPointerException ignored) {

        }
        return list;
    }
}