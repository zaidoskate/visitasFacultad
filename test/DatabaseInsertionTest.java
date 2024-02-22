/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


import dataaccess.DatabaseInsertion;
import logic.Department;
import logic.Visit;
import logic.Visitor;
import logic.UvCommunity;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.SQLException;

/**
 *
 * @author zaido
 */
public class DatabaseInsertionTest {
    
    @Test
    public void testInsertVisitor() throws SQLException {
        Visitor visitor = new UvCommunity("zs22013693@estudiantes.uv.mx", "Zaid Alexis", "Vazquez", "Ramirez", "S22013693");
        DatabaseInsertion visitorInsertion = new DatabaseInsertion();
        int idVisitor =  visitorInsertion.insertVisitor(visitor);
        assertNotEquals(-1, idVisitor);
    }

    @Test
    public void testInsertDepartment() {
        System.out.println("insertDepartment");
        Department department = new Department("FEI", "Facultad de estadistica e informatica");
        DatabaseInsertion departmentInsertion = new DatabaseInsertion();
        int result = departmentInsertion.insertDepartment(department);
        assertNotEquals(-1, result);
    }

    @Test
    public void testInsertVisit() throws Exception {
        System.out.println("insertVisit");
        Visitor visitor = new UvCommunity("zs22013693@estudiantes.uv.mx", "Zaid Alexis", "Vazquez", "Ramirez", "S22013693");
        Department department = new Department("FEI", "Facultad de estadistica e informatica");
        
        Visit visit = new Visit(visitor, department, "2024-02-21 09:00:00", "Reunion", "Secretaria academica");
        
        DatabaseInsertion visitInsertion = new DatabaseInsertion();
        boolean result = visitInsertion.insertVisit(visit);
        assertTrue(result);
    }
}
