package com.phone;

public class PhoneBuilder {
	private String os;
	private int ram;
	private String processor;
	private int battery;//300 mah
	private double screenSize;//600*300
	//generate just setters
	//But these setter will return phonebuilder object
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	//returns object of phone
	public Phone getPhone() {
		//We are passing these values which we are getting from above part
		
		return new Phone(os, ram, processor, screenSize, battery);
	}
	
}
