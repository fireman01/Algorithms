package com.bridge;

public class SamsungTV implements ITV {

	public void on() {
		System.out.println("SamsungTV has turn on");
	}

	public void off() {
		System.out.println("SamsungTV has turn off");
	}

	public void switchChannel(int channel) {
		System.out.println("SamsungTV switch to channel "+channel);
	}

}
