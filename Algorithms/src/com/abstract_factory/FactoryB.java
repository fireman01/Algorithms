package com.abstract_factory;

import com.factory_method.Product;
import com.factory_method.ProductA;
import com.factory_method.ProductB;

public class FactoryB implements AbstractFactory{

	public Product createProductA() {
		return new ProductA();
	}

	public Product createProductB() {
		return new ProductB();
	}

}
