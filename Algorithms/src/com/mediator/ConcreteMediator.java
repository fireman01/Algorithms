package com.mediator;

public class ConcreteMediator implements Mediator{
	
	private Colleague colleagueA;
	private Colleague colleagueB;

	public void createMediator() {
		colleagueA = new ConcreteColleagueA(this);
		colleagueB = new ConcreteColleagueB(this);
		
	}

	public void workAll() {
		colleagueA.work();
		colleagueB.work();
	}

}
