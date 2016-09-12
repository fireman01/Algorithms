package com.chainOfResponsibility;

public class ConcreteHandler1 extends Handler {

	public void handleRequest() {
		if(getSuccessor()!=null){
			getSuccessor().handleRequest();
		}else{
			System.out.println("ConcreteHandler1 handle request");
		}

	}

}
