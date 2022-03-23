/*
 * UC3_Ability to add weekday and weekend rates.
 * 
 */
package hotelmain;

import java.util.*;

public class HotelReservationSystem {
	
	 /**
     * Creating an ArrayList for storing list of hotels and its information
     */
    public List<Hotel> hotelList = new ArrayList<Hotel>();
    /**
     * Creating scanner class to take input from user
     */
    public static Scanner scanner = new Scanner(System.in);
    
    /**
     * Creating addHotel to add all the details of the hotel into list which are given by user
     */
    public void addHotel(int choice) {
    	for(int i=1;i<=choice;i++) {
    		scanner.nextLine();
    		System.out.println("Enter Hotel Name");
    		String name = scanner.nextLine();
    		System.out.println("Enter Rating");
    		int rating = scanner.nextInt();
    		System.out.println("Enter Regular Rate ");
    		double rate = scanner.nextDouble();
    		System.out.println("Enter Weekend Rate");
    		double rate1 = scanner.nextDouble();
    		Hotel hotel = new Hotel(name,rating,rate,rate1);
    		hotelList.add(hotel);   		
    	}
    	if(hotelList== null) {
    	System.out.println("\nPLEASE ADD HOTELS");
    	}
    	else {
    		System.out.println("HOTELS ADDED SUCCESSFULLY");
    	}
    }
    /**
     * Method displayHotel shows the hotels stored in arraylist.
     */
    public void displayHotel() {
    	System.out.println(hotelList);
    }
    
    /**
     * Method findCheapestHotel is used to find the cheapest hotel available in arraylist.
     */
    public void findCheapestHotel() {
    	scanner.nextLine();
    	System.out.println("Enter Booking Date dd/mm/YYYY");
    	String date = scanner.nextLine();
    	Iterator<Hotel> itr = hotelList.iterator();
    	double cheap = 1000000.0;
    	Hotel cheapestHotel = null;
    	while(itr.hasNext()){
    		Hotel hotel = itr.next();
    		if(hotel.getRegularWeekDayRate()<cheap) {
    			cheapestHotel = hotel;
    			cheap = hotel.getRegularWeekDayRate();   			
    		}
    	}
    	System.out.println("Cheapest Hotel is " +cheapestHotel);
    }
	    
}
