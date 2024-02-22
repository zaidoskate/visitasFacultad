import logic.Department;
import logic.Visit;
import logic.Visitor;
import org.junit.Test;
import static org.junit.Assert.*;

public class VisitTest {
    
    @Test
    public void testValidVisit() {
        Visitor visitor = new Visitor("zaidoskate@gmail.com", "Zaid Alexis", "Vazquez", "Ramirez");
        Department department = new Department("FEI", "Facultad de estadistica e informatica");
        String arrivalTime = "2024-02-21 09:00:00";
        String matter = "Reunion";
        String personVisited = "Jefes de carrera";
        
        Visit visit = new Visit(visitor, department, arrivalTime, matter, personVisited);
        
        assertNotNull(visit);
    }
}
