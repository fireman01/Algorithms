package com.iterator;

public interface Iterator {
	
	Object first();
	
	Object next();
	
	Object currentItem();
	
	boolean isDone();

}
