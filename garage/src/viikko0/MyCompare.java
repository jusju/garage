package viikko0;

import java.util.Comparator;

/**
 * 
 * A comparator class that handles the business value comparison.
 * @author Jukka Juslin
 *
 */
public class MyCompare implements Comparator {
	  public final static int BY_BUSINESSVALUE=0;
	  private int sortType=BY_BUSINESSVALUE;

	  public void setSortType(int sortType) {
	    this.sortType=sortType;
	  }
	  public int compare(Object o1, Object o2) {
	    Car c1=(Car)o1;
	    Car c2=(Car)o2;
	    switch (sortType) {
	      case BY_BUSINESSVALUE:
	    	  if((c1.getBusinessValue()-c2.getBusinessValue()) < 0) {
	    		  return -1;
	    	  } else if((c1.getBusinessValue()-c2.getBusinessValue()) == 0){
	    		  return  0;
	    	  } else {
	    		  return 1;
	    	  }
	      default:
	        return 0;  // huh ?
	    }
	  }
	  public boolean equals(Object obj) { // not used by the sort
	    return false;
	  }
	}
