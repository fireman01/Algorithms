package com.factory_method;

public class FactoryTest {

	public static void main(String[] args) {
		Factory factory = new  Factory();
//		Product product = factory.createProduct("ProductA");
		Product product = Factory.createProductB();
		product.method();
	}
}
