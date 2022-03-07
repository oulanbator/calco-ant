/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calcoantj;

import java.util.logging.Level;
import java.util.logging.Logger;
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
     * Test of add method, of class CalcoAntJ.
     */
    @Test
    public void testAdd() {
        System.out.println("Addition");
        int a = 2;
        int b = 2;
        CalcoAntJ instance = new CalcoAntJ();
        int expResult = 4;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class CalcoAntJ.
     */
    @Test
    public void testMinus() {
        System.out.println("Soustraction");
        int a = 10;
        int b = 2;
        CalcoAntJ instance = new CalcoAntJ();
        int expResult = 8;
        int result = instance.minus(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of divide method, of class CalcoAntJ.
     * @throws java.lang.Exception
     */
    @Test
    public void testDivide() throws Exception {
        System.out.println("Division");
        int a = 5;
        int b = 2;
        CalcoAntJ instance = new CalcoAntJ();
        float expResult = 2.5F;
        float result = instance.divide(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of divide method, of class CalcoAntJ.
     * Test : division vy zero should throw exception
     * @throws java.lang.Exception
     */
    @Test(expected = DivideByZeroException.class)
    public void testDivideByZero() throws Exception {
        System.out.println("Division par Zero");
        int a = 5;
        int b = 0;
        CalcoAntJ instance = new CalcoAntJ();
        float expResult = 2.5F;
        float result = instance.divide(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
}
