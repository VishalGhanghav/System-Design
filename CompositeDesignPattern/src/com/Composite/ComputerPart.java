package com.Composite;


public class ComputerPart {

	public static void main(String[] args) {
		//all leaf objects
		
		Component hardDrive=new Leaf(4000,"HDD");
		Component mouse=new Leaf(1000,"Mouse");
		Component monitor=new Leaf(8000,"Monitor");
		Component ram=new Leaf(3000,"Ram");
		Component cpu=new Leaf(9000,"CPU");
		
		//all composite
//		Component peripheral=new Composite("Peripheral");
//		Component cabinet=new Composite("Cabinet");
//		Component motherboard=new Composite("MB");
//		Component Computer=new Composite("Computer");
//		peripheral.
		//No add component in inerface component .So create object of Composite itself
		
		Composite peripheral=new Composite("Peripheral");
		Composite cabinet=new Composite("Cabinet");
		Composite motherboard=new Composite("MB");
		Composite computer=new Composite("Computer");
		
		motherboard.addComponent(ram);
		motherboard.addComponent(cpu);
		peripheral.addComponent(mouse);
		peripheral.addComponent(monitor);
		cabinet.addComponent(hardDrive);
		cabinet.addComponent(motherboard);
		//but motherboard itself is composite so add component in motherboard first
		computer.addComponent(peripheral);
		computer.addComponent(cabinet);
		
		//It will print
		computer.showPrice();
		
	}

}
