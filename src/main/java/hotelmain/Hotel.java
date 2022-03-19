/*
 * UC_1 Ability to add hotel
 */
package hotelmain;

public class Hotel {
	String hotelName;
	double regularCustomerRate;
	double rewardCustomerRate;
	
	//constructor
	public Hotel(String hotelName, double regularCustomerRate, double rewardCustomerRate) {
		
		this.hotelName = hotelName;
		this.regularCustomerRate = regularCustomerRate;
		this.rewardCustomerRate = rewardCustomerRate;
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

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", regularCustomerRate=" + regularCustomerRate
				+ ", rewardCustomerRate=" + rewardCustomerRate + "]";
	}
	
}
