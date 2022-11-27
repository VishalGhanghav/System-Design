package com.Hotel;

import java.util.List;

public class Room {
	//Room has a housekeeping log--Composition.Room can exist without housekeeping log
	//,Room has RoomKeys-Room cannot exist without room keys/room number
	String roomNumber;
	RoomType roomType;
	RoomStatus roomStatus;
	Double bookingPrice;
	
	List<HouseKeepingLog> houseKeepinglogs;
	
	public void assignKey(RoomKey roomKey) {
		
	}
	
}
