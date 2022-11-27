package com.Hotel;

/*
 * Each room will have it's own charge(Base Charge)
 */
public class RoomCharge implements BaseRoomCharge{
	double cost;
	
	@Override
	public Double getCost() {
		return null;
	}
	public void setCost(double cost) {
		this.cost=cost;
	}

}
