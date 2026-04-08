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

}
