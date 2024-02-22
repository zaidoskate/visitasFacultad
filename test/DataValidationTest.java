import logic.DataValidation;
import logic.Department;
import logic.Visit;
import logic.Visitor;
import logic.Civil;
import logic.UvCommunity;
import org.junit.Test;
import static org.junit.Assert.*;

public class DataValidationTest {
    
    @Test
    public void testVisitorValidation() {
        Visitor visitor = new Visitor("danigv11@outlook.com","Daniel Yireh", "Gomez", "Viveros");
        
        boolean result = DataValidation.visitorValidation(visitor);
        assertTrue(result);
    }

    @Test
    public void testVisitValidation() {
        Visitor visitor = new Visitor("zaidoskate@hotmail.com","Zaid Alexis", "Vazquez", "Ramirez");
        
        Department department = new Department ("FEI", "Facultad de estadistica e informatica");
        
        Visit visit = new Visit(visitor, department, "2024-02-21 09:00:00", "Charla en el auditorio", "Estudiantes de la FEI");
        
        boolean result = DataValidation.visitValidation(visit);
        assertTrue(result);
    }

    @Test
    public void testDepartmentValidation() {
        Department department = new Department("FCAS", "Facultad de Ciencias Administrativas y Sociales");
        
        boolean result = DataValidation.departmentValidation(department);
        assertTrue(result);
    }
    
    @Test 
    public void testCivilValidation() {
        Civil civil =  new Civil("alevyv@gmail.com", "Alejandro", "Vazquez", "Y Vazquez", "INE", "JMAVV0304");
        
        boolean result = DataValidation.CivilValidation(civil);
        assertTrue(result);
    }
    
    @Test
    public void testUvCommunityValidation() {
        UvCommunity uvcommunity = new UvCommunity("zs22013693@estudiantes.uv.mx", "Zaid Alexis", "Vazquez", "Ramirez", "S22013693");
        
        boolean result = DataValidation.UvCommunityValidation(uvcommunity);
        assertTrue(result);
    }
}
