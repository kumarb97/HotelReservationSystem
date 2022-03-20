/*
 * UC1_Ability to add hotel details.
 * 
 */
package hotelmain;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
	
	   /*
	    * Creation of an ArrayList.
	    */
		ArrayList<Hotel> hotelDetails = new ArrayList<Hotel>();

		/*
		 * @Purpose : This method is used to Add Hotel details in arraylist
		 * 
		 * @Param : Hotel
		 */
		public void addHotelDetails(Hotel hotel) {
			hotelDetails.add(hotel);
		}

		public List<Hotel> getHotelList() {
			return hotelDetails;
		}

}
