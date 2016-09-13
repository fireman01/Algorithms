package com.mediator;

public class Client {
	
	public static void main(String[] args) {
		  Mediator mediator = new ConcreteMediator();  
	      mediator.createMediator();  
	      mediator.workAll();  
	}

}
