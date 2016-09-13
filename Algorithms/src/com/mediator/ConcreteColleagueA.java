package com.mediator;

public class ConcreteColleagueA extends Colleague{

	public ConcreteColleagueA(Mediator mediator) {
		super(mediator);
	}

	public void work() {
		System.out.println("ConcreteColleagueA's work");
		
	}

}
