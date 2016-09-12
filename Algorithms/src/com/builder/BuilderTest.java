package com.builder;

public class BuilderTest {
	
	public static void main(String[] args) {
		Builder htmlbuilder = new HTMLBuilder();
		Director director = new Director(htmlbuilder);
		director.construct();
		Product product = htmlbuilder.getResult();
	}

}
