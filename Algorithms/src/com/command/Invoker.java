package com.command;

public class Invoker {
	
	private Command command;
	
	public Invoker(Command cmd){
		this.command = cmd;
	}
	
	public void action(){
		command.execute();
	}
	
	public void back(){
		command.undo();
	}

}
