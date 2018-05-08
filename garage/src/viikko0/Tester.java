package viikko0;

import java.util.HashSet;
import java.util.Set;

/**
 * Car fixing tester.
 * @author Jukka Juslin
 *
 */
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		Car car4 = new Car();
		
		car1.setRepairHours(3);
		car1.setRegistrationNumber("ABC-123");
		car1.setRepairPrice(100);
		
		car2.setRepairHours(5);
		car2.setRegistrationNumber("DEF-456");
		car2.setRepairPrice(120);		
		
		car3.setRepairHours(4);
		car3.setRegistrationNumber("GHI-789");
		car3.setRepairPrice(80);
		
		car4.setRepairHours(1);
		car4.setRegistrationNumber("ZZZ-999");
		car4.setRepairPrice(50);
		
		BestGarage garage = new BestGarage();
		Set<Car> cars = new HashSet<Car>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		
		cars = garage.repair(cars, 8);
		for(Car car: cars) {
			System.out.println(car);
		}
		
		
	}

}
