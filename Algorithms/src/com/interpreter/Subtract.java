package com.interpreter;

public class Subtract extends AbstractExpression{

	private AbstractExpression left ,right ; 
	
	public Subtract(AbstractExpression left, AbstractExpression right){
		this.left = left;
		this.right = right;
	}
	
	@Override
	public int interpret(Context context) {
		
		return left.interpret(context) - right.interpret(context);
	}
}
