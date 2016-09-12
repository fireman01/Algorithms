package com.builder;

public class TextBuilder implements Builder{

	private Product textproduct;

	public void makeTitle() {
		textproduct.setTitle("textTitle");
		
	}

	public void makeString() {
		textproduct.setString("textString");
		
	}

	public void makeItem() {
		textproduct.setItem("textItem");
		
	}

	public Product getResult() {
		return textproduct;
	}

}
