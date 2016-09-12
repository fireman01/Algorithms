package com.bridge;

public class SonyTV implements ITV {

	public void on() {
		System.out.println("SonyTV has turn on");
	}

	public void off() {
		System.out.println("SonyTV has turn off");
	}

	public void switchChannel(int channel) {
		System.out.println("SonyTV switch to channel "+channel);
	}

}
