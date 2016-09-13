package com.interpreter;

public class Division extends AbstractExpression{

	private AbstractExpression left ,right ; 
	
	public Division(AbstractExpression left, AbstractExpression right){
		this.left = left;
		this.right = right;
	}
	
	@Override
	public int interpret(Context context) {
		
		return left.interpret(context)/right.interpret(context);
	}
}
