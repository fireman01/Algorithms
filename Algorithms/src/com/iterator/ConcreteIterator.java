package com.iterator;

import java.util.List;

public class ConcreteIterator implements Iterator{
	
	private List<Object> list;
	private int cursor = 0;
	
	public ConcreteIterator(List<Object> list) {
		this.list = list;
	}

	public Object first() {
		cursor = 0;
		return list.get(cursor);
	}

	public Object next() {
		cursor++;
		return list.get(cursor);
	}

	public Object currentItem() {
		return list.get(cursor);
	}

	public boolean isDone() {
		if (cursor >= this.list.size() - 1) {
			return true;
		} else {
			return false;
		}
	}

}
