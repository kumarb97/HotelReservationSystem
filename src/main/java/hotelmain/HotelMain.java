/*
 * UC_1 Ability to add hotel
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
		
		/*PROCEDURE :
		 * 1. Creating a class hotel
		 * 2. Creating a class hotelreservation.
		 * 3. Creating a class hotelMain to add hotels into hotelreservation system. 
		 */
		HotelReservationSystem hotelReservation = new HotelReservationSystem();
		System.out.println("______________________________________");
		System.out.println("Welcome to Hotel Reservation System ");
		System.out.println("______________________________________");
		System.out.println("\nEnter 0 to Exit");
		System.out.println("Enter 1 to add Hotel in hotel reservation system ");
		System.out.println("Enter 2 to see available Hotels");
		int choice;
		choice = sc.nextInt();
		switch(choice) {
		case 1 :
			System.out.println("How many hotels do you want to add");
			int choice1 = sc.nextInt();
			sc.nextLine();
			for(int i=1;i<=choice1;i++) {
			System.out.println("Enter Hotel Name");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter Rating");
			double rating1 = sc.nextDouble();
			System.out.println("Enter Rate for Regular Customer");
			double regularCustomerRate1 = sc.nextDouble();
			System.out.println("Enter Rate for Reward Customer");
			double rewardCustomerRate1 = sc.nextDouble();
			Hotel hotel = new Hotel(name,regularCustomerRate1,rewardCustomerRate1,rating1);
			hotelReservation.addHotelDetails(hotel);
			}
		case 2 :
			System.out.println(hotelReservation.getHotelList());
		default :
			System.out.println("INVALID INPUT");
		}
	sc.close();

  }
}
