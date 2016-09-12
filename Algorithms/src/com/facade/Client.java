package com.facade;

public class Client {
	
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		System.out.println("---------------------");
		computer.shutdown();
	}

}
