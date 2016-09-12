package com.adapter;

/**
 * 类适配器的实现（通过继承实现）
 *
 */
/*public class Adapter extends Adaptee implements Target{

	public void requestA() {
		System.out.println("this is requestA");
	}

}*/

/**
 * 对象适配器的实现（通过对象组合）
 *
 */
public class Adapter implements Target{
	
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

	public void requestA() {
		System.out.println("this is requestA");
	}
	
	public void requestB() {
		adaptee.requestB();;
	}
	
}