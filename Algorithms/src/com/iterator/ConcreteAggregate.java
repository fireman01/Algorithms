package com.iterator;

import java.util.List;

public class ConcreteAggregate implements Aggregate{
	
	private List<Object> list;
	
	public ConcreteAggregate(List<Object> list){
		this.list = list;
	}
	

	public Iterator createIterator() {
		
		return new ConcreteIterator(this.list);
	}

}
