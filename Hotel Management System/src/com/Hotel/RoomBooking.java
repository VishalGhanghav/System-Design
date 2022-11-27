package com.Hotel;

import java.util.Date;
import java.util.List;

public class RoomBooking {
	String bookingId;
	Date startDate;
	int durationInDays;//How many days will guest stay
	BookingStatus bookingStatus;
	List<Guest> guestList;//How many guest will be staying
	List<Room> roomInfo;//How many rooms will be booked
	BaseRoomCharge totalRoomCharges;
}
