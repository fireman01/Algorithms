package com.flyweight;

import java.util.HashMap;
import java.util.Map;

public class UnsharedConcreteFlyweight implements Flyweight {

	private Map<String, Flyweight> files = new HashMap<String, Flyweight>();

	public void add(String key, Flyweight fly) {
		files.put(key, fly);
	}

	public void operation(String extrinsicState) {
		Flyweight fly = null;
		for (Object o : files.keySet()) {
			fly = files.get(o);
			fly.operation(extrinsicState);
		}

	}

}
