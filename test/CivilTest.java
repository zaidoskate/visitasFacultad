/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;
import logic.Civil;

/**
 *
 * @author zaido
 */
public class CivilTest {
    
    @Test
    public void testCivilCreationSuccess() {
        System.out.println("Civil");
        
        String email = "dani162ver@gmail.com";
        String name = "Daniel";
        String lastName1 = "Montiel";
        String lastName2 = "Camacho";
        String identificationType = "INE";
        String identificationCode = "DMC310104";
        
        Civil civil = new Civil(email, name, lastName1, lastName2, identificationType, identificationCode);
        
        assertNotNull(civil);
        assertEquals(email, civil.getEmail());
        assertEquals(name, civil.getName());
        assertEquals(lastName1, civil.getLastName1());
        assertEquals(lastName2, civil.getLastName2());
        assertEquals( identificationType, civil.getIdentificationType());
        assertEquals( identificationCode, civil.getIdentificationCode());
    }
}
