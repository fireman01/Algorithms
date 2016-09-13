package com.interpreter;

public class TerminalExpression extends AbstractExpression {

	private int i ;
	
	public TerminalExpression(int a){
		i = a;
	}
	
	@Override
	public int interpret(Context context) {
		return i;
	}

}
