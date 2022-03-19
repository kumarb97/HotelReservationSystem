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

		// Main method
		public static void main(String[] args) {
			
			/*PROCEDURE:
			 * 1.Make a class of Hotel
			 * 2.Make a class of HotelReservationSystem
			 * 3.To add hotel details by using methods in hotelreservationsystem.
			 * 4.Display hotel available in hotelreservationsystem.
			 */
			
			System.out.println("Welcome to Hotel Reservation System ");
			
			Hotel hotel1 = new Hotel("Lakewood", 1000, 800);
			Hotel hotel2 = new Hotel("Bridgewood", 2000, 1600);
			Hotel hotel3 = new Hotel("Ridgewood", 5000, 4500);
			HotelReservationSystem hotelReservation = new HotelReservationSystem();
			hotelReservation.addHotelDetails(hotel1);
			hotelReservation.addHotelDetails(hotel2);
			hotelReservation.addHotelDetails(hotel3);
			List<Hotel> result = hotelReservation.getHotelList();
			System.out.println(result);

        }
}
