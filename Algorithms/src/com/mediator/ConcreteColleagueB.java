package com.mediator;

public class ConcreteColleagueB extends Colleague{

	public ConcreteColleagueB(Mediator mediator) {
		super(mediator);
	}

	public void work() {
		System.out.println("ConcreteColleagueB's work");
		
	}

}
