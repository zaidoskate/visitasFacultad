/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


import dataaccess.DatabaseQueries;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zaido
 */
public class DatabaseQueriesTest {
    
    public DatabaseQueriesTest() {
    }

    @Test
    public void testGetVisitorsByDateSuccess() {
        DatabaseQueries visitorsQuery = new DatabaseQueries();
        String date = "2024-02-22";
        
        assertNotNull(visitorsQuery.getVisitorsByDate(date));
    }
    
}
