package com.Hotel;

/*
 * Get the room service charge+room charge +in Room Purchase Charges
 */
public class InRoomPurchaseCharges implements BaseRoomCharge {
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
