package com.visitor;

public class ConcreteVisitor2 implements Visitor {

	public void visitConcreteElementA(ConcreteElementA elementa) {
		elementa.operationA();

	}

	public void visitConcreteElementB(ConcreteElementB elementb) {
		elementb.operationB();

	}

}
