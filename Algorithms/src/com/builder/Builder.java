package com.builder;

public interface Builder {

	void makeTitle();
	void makeString();
	void makeItem();
	
	Product getResult();
}
