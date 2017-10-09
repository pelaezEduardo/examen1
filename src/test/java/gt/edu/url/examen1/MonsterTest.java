package gt.edu.url.examen1;

import static org.junit.Assert.*;

import gt.edu.url.examen1.impl.FabricaRangerImpl;
import gt.edu.url.examen1.impl.Monstruo;
import org.junit.Test;

/**
 *
 * @author tuxtor
 */
public class MonsterTest {
    
    public MonsterTest() {
    }
    
    @Test
    public void testFabricar(){
        FabricaRangerImpl fabrica = new FabricaRangerImpl();
        Monstruo m1 = fabrica.fabricar("FUEGO");
        assertNotNull(m1);
    }
    
    
    
    @Test
    public void testEncolar(){
        FabricaRangerImpl fabrica = new FabricaRangerImpl();
        
        //Ingeniero su examen estaba monstruoso
        Monstruo m1 = fabrica.fabricar("FUEGO");
        m1.setNombre("Panchito");
        Monstruo m2 = fabrica.fabricar("FUEGO");
        m2.setNombre("Candido");
        Monstruo m3 = fabrica.fabricar("FUEGO");
        m3.setNombre("Victor");
        
        assertTrue(fabrica.encolar(m1));
        assertTrue(fabrica.encolar(m2));
        assertTrue(fabrica.encolar(m3));
        assertTrue(fabrica.desencolar(m1));
    }
    
    @Test
    public void testApilar(){
        FabricaRangerImpl fabrica = new FabricaRangerImpl();
        
        //Ingeniero su examen estaba monstruoso
        Monstruo m1 = fabrica.fabricar("FUEGO");
        m1.setNombre("Panchito");
        Monstruo m2 = fabrica.fabricar("FUEGO");
        m2.setNombre("Candido");
        Monstruo m3 = fabrica.fabricar("FUEGO");
        m3.setNombre("Victor");
        
        assertTrue(fabrica.apilar(m1));
        assertTrue(fabrica.apilar(m2));
        assertTrue(fabrica.apilar(m3));
        assertTrue(fabrica.desapilar(m1));
    }

}
