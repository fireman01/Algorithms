package com.singleton;

public class Singleton1 {
	
	private static Singleton1 singleton1 = new Singleton1();
	
	private Singleton1(){}
	
	/**
	 * 饿汉式单例
	 */
	public static Singleton1 getInstance(){
		return singleton1;
	}

}
