package com.mediator;

public abstract class Colleague {
	
	protected Mediator mediator;

	public Mediator getMediator() {

		return mediator;
	}

	public Colleague(Mediator mediator) {

		this.mediator = mediator;
	}

	public abstract void work();
}
