/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.sql.Connection;
import java.sql.SQLException;
import dataaccess.DatabaseConnection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zaido
 */
public class DatabaseConnectionTest {
    
    public DatabaseConnectionTest() {
    }
    
   @Test
    public void testGetConnectionSuccess() throws SQLException{
        System.out.println("getConnection");
        DatabaseConnection instance = new DatabaseConnection();       
        Connection connection = instance.getConnection();
        assertNotNull(connection);
    }
    
}
