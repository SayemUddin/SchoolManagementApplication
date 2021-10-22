
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayan
 */
public class DBUTILS {
    private static final String jdbcURL = "jdbc:mysql://localhost:3306/schooldatabase";
    private static final String jdbcUsername = "root";
    private static final String jdbcPassword = "root";

    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver"); 
        Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        return connection;
    }

    public static ResultSet queryExecute(String query) throws SQLException, ClassNotFoundException{
        Connection connection = getConnection();
        Statement stmt = connection.createStatement();
        return stmt.executeQuery(query);
    }
    
    public static int queryUpdate(String query) throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        Statement stmt = connection.createStatement();
        return stmt.executeUpdate(query);
    }
    
}
