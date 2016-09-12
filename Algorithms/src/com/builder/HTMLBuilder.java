package com.builder;

public class HTMLBuilder implements Builder{
	
	private Product htmlproduct;

	public void makeTitle() {
		htmlproduct.setTitle("htmlTitle");
		
	}

	public void makeString() {
		htmlproduct.setString("htmlString");
		
	}

	public void makeItem() {
		htmlproduct.setItem("htmlItem");
		
	}

	public Product getResult() {
		return htmlproduct;
	}

	
}
