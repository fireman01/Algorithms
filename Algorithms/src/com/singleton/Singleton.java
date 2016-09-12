package com.singleton;

public class Singleton {
	
	private static Singleton singleton = null;
	
	private Singleton(){}
	
	/**
	 * 懒汉式单例
	 */
	/*public static Singleton getInstance(){
		if(null==singleton){
			singleton = new Singleton();
		}
		return singleton;
	}*/
	
	/*public static synchronized Singleton getInstance(){
		if(null==singleton){
			singleton = new Singleton();
		}
		return singleton;
	}*/
	
	/*public static  Singleton getInstance(){
		if(null==singleton){
			synchronized(Singleton.class){
				if(null==singleton){
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}*/
	private static class SingletonFactory{           
	    private static Singleton instance = new Singleton();           
	}           
	public static Singleton getInstance(){           
	    return SingletonFactory.instance;           
	} 
	
}
 