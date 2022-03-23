/*
 * UC_2 To find the cheapest hotel available.
 */
package hotelmain;
import java.util.Scanner;

public class HotelMain {
	public static Scanner sc = new Scanner(System.in);
	
	/*
	 * Main method for hotel reservation system
     * @param args - Default Java param (Not used)
	 * 
	 */
	public static void main(String[] args) {
		
		HotelReservationSystem hotelreservation = new HotelReservationSystem();
		System.out.println("______________");
		System.out.println("  ADD HOTELS  ");
		System.out.println("______________");
		System.out.println("\nHow many hotels do you want to add");
		int choice1 = sc.nextInt();
		hotelreservation.addHotel(choice1);
		
		System.out.println("________________________________");
		System.out.println("  WELCOME TO HOTEL RESERVATION  ");
		System.out.println("________________________________");
		System.out.println("Enter 1 to see available Hotels");
		System.out.println("Enter 2 to see cheapest Hotel");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			hotelreservation.displayHotel();
		case 2:
			hotelreservation.findCheapestHotel();
		}
		
    }
}

    