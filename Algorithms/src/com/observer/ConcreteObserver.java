package com.observer;

public class ConcreteObserver implements Observer{
	
	private int obverserState;
	
	private Subject subject;
	
	public ConcreteObserver(Subject subject){
		this.subject = subject;
		this.subject.addObserver(this);
	}

	public void update(int state) {
		System.out.println("主题更新为："+state);
		obverserState = state;
	}
	
	public int getState(){
		return this.obverserState;
	}
	
	public void setState(int state){
		 this.obverserState = state;
	}

}
