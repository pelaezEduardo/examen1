package gt.edu.url.examen1;

import gt.edu.url.examen1.api.Reportero;
import gt.edu.url.examen1.impl.ReporteroImpl;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tuxtor
 */
public class ReporteroUnitTest {
    
    public ReporteroUnitTest() {
    }

    @Test
    public void testValidScores() {
        Reportero repo = new ReporteroImpl();
        //Resultados validos
        assertEquals("A", repo.calcularGanador(7, 5));
        assertEquals("A", repo.calcularGanador(7, 6));
        assertEquals("B", repo.calcularGanador(5, 7));
        assertEquals("B", repo.calcularGanador(6, 7));
        
        assertEquals("A", repo.calcularGanador(6, 3));
        assertEquals("B", repo.calcularGanador(3, 6));
        assertEquals("A", repo.calcularGanador(6, 4));
        assertEquals("B", repo.calcularGanador(4, 6));
        assertEquals("A", repo.calcularGanador(6, 1));
        assertEquals("B", repo.calcularGanador(1, 6));
        
    }
    
    @Test
    public void testInvalidScores() {
        Reportero repo = new ReporteroImpl();
        //Resultados invalidos
        assertNotEquals("A", repo.calcularGanador(21, 0));
        assertNotEquals("A", repo.calcularGanador(7, 0));
        assertNotEquals("A", repo.calcularGanador(5, 1));
        
        assertNotEquals("B", repo.calcularGanador(0, 21));
        assertNotEquals("B", repo.calcularGanador(0, 7));
        assertNotEquals("B", repo.calcularGanador(1, 5));
    }
    
    
    @Test
    public void testCampeonato() {
        Reportero repo = new ReporteroImpl();
        //Resultados validos
        repo.calcularGanador(7, 5);
        repo.calcularGanador(6, 7);
        repo.calcularGanador(3, 6);
        repo.calcularGanador(1, 6);
        //B es el campeon
        assertEquals(repo.calcularCampeon(), "B");
        
        repo.calcularGanador(6, 2);
        repo.calcularGanador(6, 1);
        
        //Empate, no hay ganador
        assertNotEquals(repo.calcularCampeon(), "B");
        
        
    }
}
