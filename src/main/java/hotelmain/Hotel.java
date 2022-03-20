/*
 * UC_1 Ability to add hotel
 */
package hotelmain;

public class Hotel {
	String hotelName;
	double regularCustomerRate;
	double rewardCustomerRate;
	double rating;
	
	//constructor
	public Hotel(String hotelName, double regularCustomerRate, double rewardCustomerRate, double rating) {
		
		this.hotelName = hotelName;
		this.regularCustomerRate = regularCustomerRate;
		this.rewardCustomerRate = rewardCustomerRate;
		this.rating = rating;
	}
	
	/*
	 * Setters and Getters.
	 */
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public double getRegularCustomerRate() {
		return regularCustomerRate;
	}

	public void setRegularCustomerRate(double regularCustomerRate) {
		this.regularCustomerRate = regularCustomerRate;
	}

	public double getRewardCustomerRate() {
		return rewardCustomerRate;
	}

	public void setRewardCustomerRate(double rewardCustomerRate) {
		this.rewardCustomerRate = rewardCustomerRate;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", regularCustomerRate=" + regularCustomerRate
				+ ", rewardCustomerRate=" + rewardCustomerRate + ", rating=" + rating + "]";
	}
	
}
