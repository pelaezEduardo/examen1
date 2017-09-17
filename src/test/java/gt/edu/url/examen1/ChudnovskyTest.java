/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen1;

import gt.edu.url.examen1.api.Chudnovsky;
import gt.edu.url.examen1.api.Demo;
import gt.edu.url.examen1.impl.ChudnovskyImpl;
import gt.edu.url.examen1.impl.DemoImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tuxtor
 */
public class ChudnovskyTest {
    
    public ChudnovskyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testPi() {
        Chudnovsky chud = new ChudnovskyImpl();
        assertTrue(3.1415 - chud.calcularPi(2) < 0.01);
    }
}
