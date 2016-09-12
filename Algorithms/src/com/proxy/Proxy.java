package com.proxy;

public class Proxy implements Subject {
	
	private Subject subject;
	
	public Proxy(Subject sub){
		subject = sub;
	}

	public void request() {
		System.out.println("before proxy");
		subject.request();
		System.out.println("after proxy");
		
	}

}
