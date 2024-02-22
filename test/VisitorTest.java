import static org.junit.Assert.*;
import org.junit.Test;
import logic.Visitor;

public class VisitorTest {
    
    @Test
    public void testVisitorCreationSuccess() {
        System.out.println("Visitor");
        
        String email = "danigv11@gmail.com";
        String name = "Daniel Yireh";
        String lastName1 = "Gomez";
        String lastName2 = "Viveros";
        
        Visitor visitor = new Visitor(email, name, lastName1, lastName2);
        
        assertNotNull(visitor);
        assertEquals(email, visitor.getEmail());
        assertEquals(name, visitor.getName());
        assertEquals(lastName1, visitor.getLastName1());
        assertEquals(lastName2, visitor.getLastName2());
    }
}
