package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.Comparator;

public class mySpaceshipComparator implements Comparator<Spaceship> {
	public int compare(Spaceship o1 , Spaceship o2) {
		int m = Integer.compare(o2.getFirePower(), o1.getFirePower() );
		if (m != 0) {
			return m;
		}
		m = Integer.compare(o2.getCommissionYear(), o1.getCommissionYear() );
		if (m != 0) {
			return m;
		}
		return o1.getName().compareTo(o2.getName());
	}
}


