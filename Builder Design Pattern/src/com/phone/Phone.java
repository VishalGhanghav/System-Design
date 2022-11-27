package com.phone;
//We will create our own phone .What will it need

public class Phone {
	private String os;
	private int ram;
	private String processor;
	private int battery;//300 mah
	private double screenSize;//600*300
	
	//TO set values we can use constructor or getter setter
	public Phone(String os, int ram, String processor, double screenSize,int battery ) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.battery = battery;
		this.screenSize = screenSize;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", battery=" + battery
				+ ", screenSize=" + screenSize + "]";
	}
	
	
	
	
}
