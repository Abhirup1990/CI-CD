package com.demo;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class AppTest {
	@Test
    public void testApp() {
        assertEquals("Hello World", new App().sayHello());
    }

}
