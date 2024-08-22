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

/**
 *
 * @author 2004
 */
public class GenericStackTest {
    
    public GenericStackTest() {
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
     * Test of push method, of class GenericStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
    GenericStack<Integer> stack = new GenericStack<>();
    Integer elementToPush = 5;
    stack.push(elementToPush);

    // Verify that the stack contains the pushed element
    assertEquals(1, stack.getSize(), "Stack size should be 1 after pushing an element.");
}
    // Implementation of the verification of stack containing pushed element
  private void assertEquals(int expected, int actual, String message) {
    if (expected == actual) {
        System.out.println("Test passed: " + message);
    } else {
        System.err.println("Test failed: " + message);
        System.err.println("Expected: " + expected);
        System.err.println("Actual: " + actual);
    }
}
    /**
     * Test of pop method, of class GenericStack.
     */
    @Test
public void testPop() {
    System.out.println("pop");
    GenericStack<Integer> stack = new GenericStack<>();
    Integer expected = null; // Expected result when popping from an empty stack
    Integer actual = stack.pop();

    // Verify that the popped element matches the expected result
    assertEquals(expected, actual,"Popped element should be null when the stack is empty.");
}
   // Implementation of the verification of assertEquals for testPop
 private void assertEquals(Object expected, Object actual) {
    if (expected == null && actual == null) {
        System.out.println("Test passed: Objects are both null.");
    } else if (expected != null && expected.equals(actual)) {
        System.out.println("Test passed: Objects are equal.");
    } else {
        System.err.println("Test failed: Objects are not equal.");
        System.err.println("Expected: " + expected);
        System.err.println("Actual: " + actual);
    }
}

    /**
     * Test of peek method, of class GenericStack.
     */
    @Test
public void testPeek() {
    System.out.println("peek");
    GenericStack<Integer> stack = new GenericStack<>();
    Integer expectedPeekedElement = null; // Expected result when peeking from an empty stack
    Integer actualPeekedElement = stack.peek();

    // Verify that the peeked element matches the expected result
    assertEquals(expectedPeekedElement, actualPeekedElement,"Peeked element should be null when the stack is empty.");
}

    /**
     * Test of isEmpty method, of class GenericStack.
     */
    @Test
public void testIsEmpty() {
    System.out.println("isEmpty");
    GenericStack<Integer> stack = new GenericStack<>();
    boolean expectedIsEmpty = true; // Expected result for an empty stack
    boolean actualIsEmpty = stack.isEmpty();

    // Verify that the stack is not empty (false) when it's actually empty
    assertEquals(expectedIsEmpty, actualIsEmpty,"Stack should not be empty after pushing an element.");
}
    // Implementation of the verification of the assertEquals method for the verification of empty stack
private void assertEquals(boolean expected, boolean actual, String message) {
    if (expected == actual) {
        System.out.println("Test passed: " + message);
    } else {
        System.err.println("Test failed: " + message);
        System.err.println("Expected: " + expected);
        System.err.println("Actual: " + actual);
    }
}

    /**
     * Test of getSize method, of class GenericStack.
     */
    @Test
public void testGetSize() {
    System.out.println("getSize");
    GenericStack<Integer> stack = new GenericStack<>();
    int expectedSize = 0; // Expected size for an empty stack
    int actualSize = stack.getSize();

    // Verify that the stack size matches the expected result
    assertEquals(expectedSize, actualSize, "Stack size should be 0 for an empty stack.");
}

    /**
     * Test of toString method, of class GenericStack.
     */
   @Test
public void testToString_NonEmptyStack() {
    GenericStack<String> stack = new GenericStack<>();
    stack.push("Lenz");
    stack.push("Bob");
    stack.push("Raymond");

    String expected = "[Lenz, Bob, Raymond]"; // Expected string representation
    String actual = stack.toString();

    assertEquals(expected, actual, "Stack contains elements in the correct order.");
}
   //Implementation of the verification of assertEquals for toString
private void assertEquals(String expected, String actual, String message) {
    if (expected.equals(actual)) {
        System.out.println("Test passed: " + message);
    } else {
        System.err.println("Test failed: " + message);
        System.err.println("Expected: " + expected);
        System.err.println("Actual: " + actual);
    }
}
}

