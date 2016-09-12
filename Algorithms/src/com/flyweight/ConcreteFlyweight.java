package com.flyweight;

public class ConcreteFlyweight implements Flyweight{
	
	private String intrinsicState;
	
	public ConcreteFlyweight(String state){
		intrinsicState = state;
	}

	public void operation(String extrinsicState) {
		 System.out.println("Intrinsic State = " + this.intrinsicState);
	     System.out.println("Extrinsic State = " + extrinsicState);
	}

}
