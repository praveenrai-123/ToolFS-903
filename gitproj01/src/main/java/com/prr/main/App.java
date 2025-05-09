package com.prr.main;


public class App {
	
	public int sum(int x, int y) {
		return x+y;
	}
    public static void main(String[] args) {
        System.out.println("Main");
        App p = new App();
        System.out.println(p.sum(16,56));
    }
}
