package com.factory_method;

public class Factory {
		
	public static Product createProductA(){
			return new ProductA();
	}
	
	public static Product createProductB(){
		return new ProductB();
	}
	

	
	
	
	/**
	 * 普通工厂方法模式
	 * @author 林军雄
	 * @param type
	 * @return
	 */
	public Product createProduct(String type){
		if("ProductA".equals(type)){
			return new ProductA();
		}else if("ProductB".equals(type)){
			return new ProductB();
		}else{
			return null;
		}
	}

}
