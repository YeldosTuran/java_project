package Database;

import java.sql.*;


public class PostgreDataBase {

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String connectionUrl = "jdbc:postgresql://localhost:5432/ejournal";
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(connectionUrl, "postgres", "1");
            if(con != null){
                System.out.println("Connection is true");
            }
            else{
                System.out.println("Connection is failed");
            }
            return con;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
