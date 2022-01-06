/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calcoantj;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author victo
 */
public class CalcoAntJTest {
    
    public CalcoAntJTest() {
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

    /**
     * Test of main method, of class CalcoAntJ.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CalcoAntJ.main(args);
    }

    /**
     * Test of add method, of class CalcoAntJ.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 0;
        int b = 0;
        CalcoAntJ instance = new CalcoAntJ();
        int expResult = 0;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }
    
}
