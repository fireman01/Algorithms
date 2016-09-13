package com.interpreter;

public class Variable extends AbstractExpression{

	@Override
	public int interpret(Context context) {
		
		return context.LookupValue(this);
	}

}
