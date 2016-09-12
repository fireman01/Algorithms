package com.chainOfResponsibility;

public class ConcreteHandler2 extends Handler {

	public void handleRequest() {
		if(getSuccessor()!=null){
			getSuccessor().handleRequest();
		}else{
			System.out.println("ConcreteHandler2 handle request");
		}
	}

}
