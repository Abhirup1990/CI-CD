package com.demo;

public class App {
	public String sayHello() { return "Hello World"; }
	// Add this inside the public class App { ... }
	public int sum(int a, int b) {
	    return a + b;
	}

    public static void main(String[] args) {
        System.out.println(new App().sayHello());
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    
 // Add this inside the public class App { ... }
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }


}
