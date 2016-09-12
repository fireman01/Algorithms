package com.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
	
	private List<Component> children = new ArrayList<Component>();
    
	@Override
	public void operation() {
		System.out.println("Composite's operation");
	}

	@Override
	public void add(Component component) {
		children.add(component);
	}

	@Override
	public void remove(Component component) {
		children.remove(component);
	}

	@Override
	public Component getChild(int index) {
		return children.get(index);
	}

}
