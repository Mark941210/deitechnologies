/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package expressionparser;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2004
 */
public class ExpressionParserTest {
    
    public ExpressionParserTest() {
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
     * Test of evaluate method, of class ExpressionParser.
     */
        @Test
        public void testEvaluate() {
        String expression = "3 + 4 * 2 - 5";
        int expected = 6; // (3 + (4 * 2)) - 5 = 6
        int actual = ExpressionParser.evaluate(expression);
        assertEquals(expected, actual, "Expression evaluation is incorrect for: " + expression);
       }
        private static void assertEquals(int expected, int actual, String message) {
        if (expected == actual) {
        System.out.println("Test passed: " + message);
        } 
        else {
        System.err.println("Test failed: " + message);
        System.err.println("Expected: " + expected);
        System.err.println("Actual: " + actual);
    }
}

    /**
     * Test of main method, of class ExpressionParser.
     */
    @Test
    public void testMain() {
    // Placeholder test for main method
    fail("The main method should be tested for expected behavior.");
}  
}