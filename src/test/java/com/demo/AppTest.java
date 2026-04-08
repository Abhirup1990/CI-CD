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

}
