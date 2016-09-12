package com.prototype;

import java.io.Serializable;

public class Product implements Serializable {

	private String title;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle(){
		return this.title;
	}
}
