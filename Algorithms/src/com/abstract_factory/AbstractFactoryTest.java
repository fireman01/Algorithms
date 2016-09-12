package com.abstract_factory;

import com.factory_method.Product;
import com.factory_method.ProductA;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		AbstractFactory abFactory = new FactoryA();
		Product product = abFactory.createProductA();
		product.method();
	}
}
