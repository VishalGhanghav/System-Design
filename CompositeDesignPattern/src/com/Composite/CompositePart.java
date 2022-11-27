package com.Composite;

import java.util.ArrayList;
import java.util.List;


	//to get price of composite object .You will need something in common
	interface Component{
		void showPrice();
	}
	
	class Leaf implements Component{
		
		int price;
		String name;
		//constructor to assign values
		
		@Override
		public void showPrice() {
			System.out.println(name +":"+price);
		}
		public Leaf(int price, String name) {
			super();
			this.price = price;
			this.name = name;
		}
		
	}
	
	class Composite implements Component{
		String name;
		
		public Composite(String name) {
			super();
			this.name = name;
		}
		//Price will be a list of components.It can be composite as well as leaf component
		
		List<Component> componentList=new ArrayList<>();
		
		public void addComponent(Component comp) {
			componentList.add(comp);
		}
		@Override
		public void showPrice() {
			
			System.out.println(name);
			//to print each component price we have to iterate
			for(Component c:componentList) {
				//kind of recursion .For leaf it will print price.FOr Composite it will 
				//components below it until it reaches leaf
				c.showPrice();
			}
		}
		
	}

