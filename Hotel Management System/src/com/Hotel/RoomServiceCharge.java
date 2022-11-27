package com.Hotel;

/*
 * Get the room service charge adding up the room charge ie.service charge+room charge
 */
public class RoomServiceCharge implements BaseRoomCharge {
	double cost;
	BaseRoomCharge baseRoomCharge;
	@Override
	public Double getCost() {
		
		baseRoomCharge.setCost(baseRoomCharge.getCost()+cost);
		return baseRoomCharge.getCost();
	}
	@Override
	public void setCost(double d) {
		// TODO Auto-generated method stub
		
	}

}
