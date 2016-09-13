package com.observer;

public class Client {

	public static void main(String[] args) {
		final ConcreteSubject sb = new ConcreteSubject();
		sb.setState(20);

		final Observer o = new ConcreteObserver(sb);
		sb.setState(21);

	}

}
