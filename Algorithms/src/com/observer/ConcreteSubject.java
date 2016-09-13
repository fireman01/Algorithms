package com.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
	
	private int subjectState;

	private List<Observer> observers = new ArrayList<Observer>();
	
	public void addObserver(Observer obs){
		observers.add(obs);
	}
	
	public void removeObserver(Observer obs){
		if(observers.indexOf(observers)>=0){
			observers.remove(obs);
		}
	}
	
	public void notifyObserver() {
		for (final Observer o : observers) {
			o.update(subjectState);
		}
	}
	
	private void stateChange(){
		 this.notifyObserver();
	}

	public int getState(){
		return subjectState;
	}
	
	public void setState(int state){
		 this.subjectState = state;
		 this.stateChange();
	}
}
