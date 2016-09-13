package com.interpreter;

public class Client {
	
	 private static AbstractExpression aex ;  
	  
     private static Context con ;  
	
	public static void main(String[] args) {
		con = new Context();  
        //设置变量、常量  
        Variable a = new Variable();  
        Variable b = new Variable();  
        TerminalExpression c = new TerminalExpression(2);  

        //为变量赋值  
        con.addValue(a , 5);  
        con.addValue(b , 7);  

        //运算，对句子的结构由我们自己来分析，构造  
        aex = new Division(new Multiply(a , b), new Add(new Subtract(a , b) , c));  
        System.out.println("运算结果为："+ aex.interpret(con));  

	}
}
