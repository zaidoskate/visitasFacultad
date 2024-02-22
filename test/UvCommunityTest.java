import static org.junit.Assert.*;
import org.junit.Test;
import logic.UvCommunity;

public class UvCommunityTest {
    
    @Test
    public void testUvCommunityCreationSuccess() {
        String email = "zs22013695@estudiantes.uv.mx";
        String name = "Erick Abdiel";
        String lastName1 = "Atzin";
        String lastName2 = "Olarte";
        String miembroUv = "S22013695";
        
        UvCommunity uvCommunity = new UvCommunity(email, name, lastName1, lastName2, miembroUv);
        
        assertNotNull(uvCommunity);
        assertEquals(email, uvCommunity.getEmail());
        assertEquals(name, uvCommunity.getName());
        assertEquals(lastName1, uvCommunity.getLastName1());
        assertEquals(lastName2, uvCommunity.getLastName2());
        assertEquals(miembroUv, uvCommunity.getMiembroUv());
    }
    
}
