package com.proxy;

public class Client {
	
	public static void main(String[] args) {
		Subject realsubject = new RealSubject();
		Subject proxy = new Proxy(realsubject);
		proxy.request();
	}

}
