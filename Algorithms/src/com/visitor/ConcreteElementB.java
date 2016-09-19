package com.visitor;

public class ConcreteElementB implements Element{

	public void accept(Visitor v) {
		v.visitConcreteElementB(this);
	}
	
	public void operationB(){
		System.out.println("operationB");
	}

}
