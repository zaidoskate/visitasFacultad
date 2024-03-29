/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Zaid Alexis Vazquez Ramirez
 */
public class DatabaseConnection {
    private Connection databaseConnection;
    private final String DATABASE_URL = "jdbc:mysql://127.0.0.1/visitasfacultad";
    private final String DATABASE_USER = "visitRegistrator";
    private final String DATABASE_PASSWORD = "visit123";
    
    public Connection getConnection() throws SQLException {
        connect();
        return databaseConnection;
    }
    
    private void connect() throws SQLException {
        databaseConnection = DriverManager.getConnection(DATABASE_URL,DATABASE_USER,DATABASE_PASSWORD);
    }
    
    public void closeConnection() {
        if(databaseConnection != null) {
            try {
                if(!databaseConnection.isClosed()) {
                    databaseConnection.close();
                }
            } catch (SQLException exception) {
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE,null, exception);
            }
        }
    }
}
