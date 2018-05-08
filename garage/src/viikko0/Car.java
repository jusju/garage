package viikko0;

/**
 * A Car entity class.
 * 
 * @author Jukka Juslin
 * @version $Log$
 * 
 */
public class Car {

	/**
	 * The number of hours it takes to fix the car
	 */
	private int repairHours;

	/**
	 * The number of euros you can charge the customer for the repairs
	 */
	private int repairPrice;
	/**
	 * The registration number of the car.
	 */
	private String registrationNumber;

	/**
	 * The registration number of the car.
	 */
	private double businessValue;

	/**
	 * 
	 * @return The hours it takes to fix the car
	 */
	public int getRepairHours() {
		return repairHours;
	}

	/**
	 * 
	 * @param repairHours that it takes to repair the car
	 */
	public void setRepairHours(int repairHours) {
		this.repairHours = repairHours;
	}

	/**
	 * 
	 * @return Repair price of the car
	 */
	public int getRepairPrice() {
		return repairPrice;
	}

	/**
	 * 
	 * @param repairPrice of the car
	 */
	public void setRepairPrice(int repairPrice) {
		this.repairPrice = repairPrice;
	}
	
	/**
	 * @return The registration number of the car
	 */
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	/**
	 * 
	 * @param registrationNumber of the car
	 */
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	/**
	 * 
	 * @return The business value
	 */
	public double getBusinessValue() {
		return businessValue;
	}
	/**
	 * 
	 * @param businessValue
	 */

	public void setBusinessValue(double businessValue) {
		this.businessValue = businessValue;
	}
	
	public String toString() {
		String result = "";
		result += registrationNumber + " ";
		return result;
	}

}
