package com.composite;

public class Leaf extends Component{

	@Override
	public void operation() {
		System.out.println("Leaf's operation");
	}

	@Override
	public void add(Component component) {
		System.out.println("Can not add to a leaf");
	}

	@Override
	public void remove(Component component) {
		System.out.println("Can not remove from a leaf");
	}

	@Override
	public Component getChild(int index) {
		return null;
	}

}
