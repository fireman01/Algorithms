package com.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Prototype implements Cloneable,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int num;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	private Product product;
	

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	/*	@Override
	protected Prototype clone(){
		Prototype prototype = null;  
	    try{  
	    	System.out.println("--------浅复制---------");
	        prototype = (Prototype)super.clone();  
	    }catch(CloneNotSupportedException e){  
	        e.printStackTrace();  
	    }  
	    return prototype;  
	}*/
	@Override
	protected Prototype clone(){
		Prototype prototype = null; 
		ByteArrayOutputStream bos = null;
		ByteArrayInputStream bis = null;
	    try{  
	    	System.out.println("--------深复制---------");
	    	bos = new ByteArrayOutputStream();  
	        ObjectOutputStream oos = new ObjectOutputStream(bos);  
	        oos.writeObject(this);  
	  
	        //读出二进制流产生的新对象   
	        bis = new ByteArrayInputStream(bos.toByteArray());  
	        ObjectInputStream ois = new ObjectInputStream(bis);  
	        return (Prototype)ois.readObject();   
	    }catch(Exception e){  
	        e.printStackTrace();  
	    }finally{
	    	if(bos!=null&&bis!=null){
	    		try {
					bos.close();
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
	    	}
	    }
	    return prototype;  
	}
}
