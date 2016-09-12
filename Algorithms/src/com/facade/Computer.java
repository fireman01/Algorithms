package com.facade;

public class Computer {
	
	private CPU cpu;
	private Disk disk;
	private Display display;
	
	public Computer(){
		cpu = new CPU();
		disk = new Disk();
		display = new Display();
	}
	
	public void startup(){
		System.out.println("Computer is starting");
		cpu.startup();
		disk.startup();
		display.startup();
		System.out.println("Computer has started");
	}
	
	public void shutdown(){
		System.out.println("Computer will shutdown");
		display.shutdown();
		disk.shutdown();
		cpu.shutdown();
		System.out.println("Computer has shutdown");
	}

}
