package com.visitor;

public class ConcreteVisitor1 implements Visitor {

	public void visitConcreteElementA(ConcreteElementA elementa) {
		elementa.operationA();

	}

	public void visitConcreteElementB(ConcreteElementB elementb) {
		elementb.operationB();

	}

}
