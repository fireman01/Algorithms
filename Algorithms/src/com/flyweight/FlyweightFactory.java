package com.flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyweightFactory {
	
	 private Map<String,Flyweight> files = new HashMap<String,Flyweight>();
	    /**
	     * 复合享元工厂方法
	     */
	    public Flyweight factory(List<String> compositeState){
	    	UnsharedConcreteFlyweight UnsharedConcreteFly = new UnsharedConcreteFlyweight();
	        
	        for(String state : compositeState){
	        	UnsharedConcreteFly.add(state,this.getFlyweight(state));
	        }
	        return UnsharedConcreteFly;
	    }
	    /**
	     * 单纯享元工厂方法
	     */
	    public Flyweight getFlyweight(String state){
	        //先从缓存中查找对象
	        Flyweight fly = files.get(state);
	        if(fly == null){
	            //如果对象不存在则创建一个新的Flyweight对象
	            fly = new ConcreteFlyweight(state);
	            //把这个新的Flyweight对象添加到缓存中
	            files.put(state, fly);
	        }
	        return fly;
	    }
}
