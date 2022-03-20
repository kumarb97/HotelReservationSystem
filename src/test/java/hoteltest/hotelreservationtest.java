package hoteltest;

import org.junit.Test;
import hotelmain.HotelReservationSystem;
import hotelmain.Hotel;
import static org.junit.Assert.assertTrue;

import java.util.List;

public class hotelreservationtest {
	
	/*
	 * @Purpose : Testing code by using test case hotel is added or not
	 */
	@Test
	public void givenHotelDetails_WhenAdded_ShoulReturnTrue() {
		try {
			Hotel hotel1 = new Hotel("Lakewood", 1000, 800, 4);
			Hotel hotel2 = new Hotel("Bridgewood", 2000, 1600, 3);
			Hotel hotel3 = new Hotel("Ridgewood", 5000, 4500, 2);
			HotelReservationSystem hotelReservation = new HotelReservationSystem();
			hotelReservation.addHotelDetails(hotel1);
			hotelReservation.addHotelDetails(hotel2);
			hotelReservation.addHotelDetails(hotel3);
			List<Hotel> result = hotelReservation.getHotelList();
			assertTrue(result.contains(hotel1));
			assertTrue(result.contains(hotel2));
			assertTrue(result.contains(hotel3));
		} catch (Exception e) {
			System.out.println("hotel details not added successfully..");
		}
	}

}
