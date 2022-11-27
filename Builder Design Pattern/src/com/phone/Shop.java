package com.phone;

public class Shop {
	public static void main(String args[]) {
		//To use constructor we need to pass everything and in sequence ot constructor
		//But this is complex
	//	Phone p=new Phone("Android",2,"Qualcomm",5.5,3100);
		//to get the data we need some to string method .DO it in Phone class
		//System.out.println(p);
		//We have to remember all values in this case also even if we don't have to 
		//pass some values .we will have to pass null
		//In this case we can use builder pattern and create phone builder
		Phone p=new PhoneBuilder().setBattery(3000).setOs("Android").getPhone();
		System.out.println(p);
		//This will provide flexibility to provide only required data
		//while other data getting default values and sequence doesn't matter
		
	}
}
