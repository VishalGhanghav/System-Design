package com.phone;

public class OperatingSystemFactory {
	//All objects created here
	public OS getInstance(String reqOs) {
		if(reqOs.equals("Open")) {
			//android
			return new Android();
		}else if(reqOs.equalsIgnoreCase("Closed")) {
			//ios
			return new IOS();
		}else {
			//windows
			return new Windows();
		}
	}
}
