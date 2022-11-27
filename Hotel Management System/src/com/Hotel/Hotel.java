package com.Hotel;

import java.util.List;
import java.util.UUID;

/*
 * Start from base ie.Hotel and create classes one by one based on it
 */
public class Hotel {
	String hotelName;
	UUID hotelId=UUID.randomUUID();
	HotelLocation locationAddress;
	List<Room> roomList;
	
}
