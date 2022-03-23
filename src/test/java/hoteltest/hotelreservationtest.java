package hoteltest;

import org.junit.Assert;
import org.junit.Test;
import hotelmain.HotelReservationSystem;
import hotelmain.Hotel;

public class hotelreservationtest {
	
	HotelReservationSystem hotelreservation = new HotelReservationSystem();
	
	/*
	 * @Purpose : Testing code by using test case hotel is added or not
	 */
	@Test
    public void givenHotelDetails_ShouldReturnTrue() {
		Hotel hotel = new Hotel("lakewood",4,800,900);
        boolean result = hotelreservation.hotelList.add(hotel);
        Assert.assertEquals(true, result);
    }

}
