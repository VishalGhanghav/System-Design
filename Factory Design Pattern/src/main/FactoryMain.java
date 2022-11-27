package main;

import com.phone.OS;
import com.phone.OperatingSystemFactory;

public class FactoryMain {
	public static void main(String args[]) {
		//Creating object of class using INterface
		OperatingSystemFactory osf=new OperatingSystemFactory();
		OS osObj=osf.getInstance("Open");
		osObj.spec();
		//Gives output but each time need to instantiate object by myself
		//and client knows we are using this new Android to get object
		//Factory design pattern says create operating factory and it will give object of all os.
		//Now if new OS needs to be added .It will be added in Operating System factory and 
		//not in our client(Here main)
	}
}
