package com.demo;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class AppTest {
	@Test
    public void testApp() {
        assertEquals("Hello World", new App().sayHello());
    }
	@Test
	public void testSum() {
	    App app = new App();
	    assertEquals(10, app.sum(5, 5)); // We are testing if 5 + 5 equals 10
	}
	
	@Test
	public void testMultiply() {
	    assertEquals(20, new App().multiply(4, 5));
	}
	
	// Add this to your AppTest.java
	@Test
	public void testSubtract() {
	    App app = new App();
	    // This checks if the subtract method correctly returns 6
	    assertEquals(6, app.subtract(10, 4));
	}
	
	@Test
	public void testDivide() {
	    App app = new App();
	    assertEquals(5, app.divide(10, 2));
	}


}
