package com.prototype;

public class Client {
	
	public static void main(String[] args) {
		Client client = new Client();
		client.operation();
	}

	public void operation(){
		 Prototype cp = new Prototype();  
		 cp.setName("original Name1");
		 cp.setNum(111);
		 Product product = new Product();
		 product.setTitle("title1");
		 cp.setProduct(product);
		 Prototype clonecp = (Prototype)cp.clone();
		 cp.setName("original Name2");
		 cp.setNum(222);
		 product.setTitle("title2");
	     System.out.println("cp name:"+cp.getName()+"  clonecp name:"+clonecp.getName());
	     System.out.println("cp num:"+cp.getNum()+"  clonecp num:"+clonecp.getNum());
	     System.out.println("cp product:"+cp.getProduct().getTitle()+"  clonecp product:"+clonecp.getProduct().getTitle());
	}
}
