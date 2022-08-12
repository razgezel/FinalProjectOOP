package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.List;
import java.util.Set;

public class CylonRaider extends Fighter {
	private final int BasicAnnualCost = 3500;

	public CylonRaider(String name, int commissionYear, float maximalSpeed, Set<Cylon> crewMembers,	List<Weapon> weapons) {
		super(name,commissionYear,maximalSpeed,crewMembers,weapons);
	}
	
	@Override
	public int getAnnualMaintenanceCost() {
		return BasicAnnualCost + this.annualcostofweapons() + (500*CrewMembers.size())+ (int)(MaximalSpeed*1200);
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}


	

}
