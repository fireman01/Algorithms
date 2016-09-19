package com.strategy;

public class Client {
	
	public static void main(String[] args) {
		
		Strategy startegy = new ConcreteStrategyA();
		Context con = new Context(startegy);
		con.contextOperate();
	}

}
