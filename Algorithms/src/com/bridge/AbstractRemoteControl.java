package com.bridge;

public abstract class AbstractRemoteControl {
	
	private ITV tv;

	public AbstractRemoteControl(ITV tv) {
		this.tv = tv;
	}
	
	protected  void turnOn(){
		tv.on();
	}
	
	protected  void turnOff(){
		tv.off();
	}
	
	protected void setChannel(int channel){
		tv.switchChannel(channel);
	}
}
