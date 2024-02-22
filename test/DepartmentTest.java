import static org.junit.Assert.*;
import org.junit.Test;
import logic.Department;

public class DepartmentTest {
    
    @Test
    public void testDepartmentCreationSuccess() {
        String departmentCode = "FCAS";
        String departmentName = "Facultad Ciencias Administrativas y Sociales";
        
        Department department = new Department(departmentCode, departmentName);
        
        assertNotNull(department);
        assertEquals(departmentCode, department.getDepartmentCode());
        assertEquals(departmentName, department.getDepartmentName());
    }
}
