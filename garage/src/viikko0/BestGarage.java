package viikko0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * A class that implements the Garage interface.
 * 
 * @author Jukka Juslin
 *
 */
public class BestGarage implements Garage {

	/**
	 * @return Cars with best business value for the allocated time.
	 */
	@Override
	public Set<Car> repair(Set<Car> cars, int availableHours) {

		MyCompare mc = new MyCompare();
		ArrayList bestCars = new ArrayList();
		ArrayList<Car> oneChoiceForCarSet = null;
		ArrayList<Car> possibleCarSets = new ArrayList<Car>();
		ArrayList<ArrayList<Car>> allLists = new ArrayList<ArrayList<Car>>();
		for (Car car : cars) {
			double businessValue = car.getRepairPrice() / car.getRepairHours();
			car.setBusinessValue(businessValue);
			bestCars.add(car);
		}

		mc.setSortType(MyCompare.BY_BUSINESSVALUE);
		// We use our comparator to sort the cars
		Collections.sort(bestCars, mc);
		Set<Car> carsToBeFixed = new HashSet<Car>();
		double hoursUsed = availableHours;
		for (int i = bestCars.size() - 1; i >= 0; i--) {
			if (((Car) (bestCars.get(i))).getRepairHours() <= hoursUsed) {
				oneChoiceForCarSet = new ArrayList<Car>();
				for (int j = 0; j < bestCars.size(); j++) {
					
				}
				
				carsToBeFixed.add((Car) bestCars.get(i));
				hoursUsed = hoursUsed - ((Car) (bestCars.get(i))).getRepairHours();
			}
		}

		return carsToBeFixed;
	}

	public boolean checkArrayListsForSimilarity(ArrayList<Car> first, ArrayList<ArrayList<Car>> allLists) {
		int sizeOfFirst = first.size();
		for (int i = 0; i < allLists.get(i).size(); i++) {
			ArrayList<Car> currentList = allLists.get(i);
			int sizeOfSecond = currentList.size();
			int biggestSize = 0;
			if (sizeOfFirst > sizeOfSecond) {
				biggestSize = sizeOfFirst;
			} else {
				biggestSize = sizeOfSecond;
			}
			for (int j = 0; j < biggestSize; j++) {
				if(first.get(j) != null && currentList.get(j) != null ) {
					if(!first.get(j).getRegistrationNumber().equals(currentList.get(j).getRegistrationNumber())) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
