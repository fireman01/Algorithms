package com.visitor;

public class ConcreteElementA implements Element{

	public void accept(Visitor v) {
		v.visitConcreteElementA(this);
	}
	
	public void operationA(){
		System.out.println("operationA");
	}

}
