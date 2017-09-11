
package gt.edu.url.examen1;


import gt.edu.url.examen1.api.Demo;
import gt.edu.url.examen1.impl.DemoImpl;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tuxtor
 */
public class DemoUnitTest {
    
    public DemoUnitTest() {
    }
    
    @Test
    public void hello() {
        Demo demoTest = new DemoImpl();
        
        assertEquals("Hola mundo", demoTest.saludar());
    }
}
