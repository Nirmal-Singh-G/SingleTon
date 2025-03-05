package com.sample;

public class Singleton {
	private static Singleton instance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello from the Singleton class");
	}
	
	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getInstance();
		singleton.showMessage();
	}
	
	private void mama() {
		// TODO Auto-generated method stub

	}
	
	private void kutty() {
		// TODO Auto-generated method stub

	}
	
	private void vaadi() {
		// TODO Auto-generated method stub

	}
	
	private void omala() {
		// TODO Auto-generated method stub

	}

}
