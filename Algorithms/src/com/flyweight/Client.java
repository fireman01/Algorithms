package com.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String> ();
		list.add("b");
		FlyweightFactory flyFactory = new FlyweightFactory();
	    Flyweight unsharedConcreteFlyweight1 = flyFactory.factory(list);
	    Flyweight unsharedConcreteFlyweight2 = flyFactory.factory(list);
	    System.out.println(unsharedConcreteFlyweight1==unsharedConcreteFlyweight2);
	    Flyweight concreteFlyweight1 = flyFactory.getFlyweight("a");
	    Flyweight concreteFlyweight2 = flyFactory.getFlyweight("a");
	    System.out.println(concreteFlyweight1==concreteFlyweight2);
	}

}
