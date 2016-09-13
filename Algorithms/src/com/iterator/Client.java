package com.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<Object>();
		list.add(1);
		list.add(2);
		Aggregate aggregate = new ConcreteAggregate(list);
		Iterator it = aggregate.createIterator();
		System.out.println(it.currentItem());
		while(!it.isDone()){
			System.out.println(it.next());
		}
	}

}
