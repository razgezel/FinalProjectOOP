package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.List;
import java.util.Set;

public class Bomber extends myButtleSpaceshipFastOrHeavy{
	private final int BasicAnnualCost = 5000;
	private int numberOfTechnicians;
	
	public Bomber(String name, int commissionYear, float maximalSpeed, Set<CrewMember> crewMembers, List<Weapon> weapons, int numberOfTechnicians){
		super(name,commissionYear,maximalSpeed,crewMembers,weapons);
		this.numberOfTechnicians = numberOfTechnicians;
	}
	public int getNumberOfTechnicians() {
		return numberOfTechnicians;
	}
	
	public int getAnnualMaintenanceCost() {
		int annualcostofweapons = this.annualcostofweapons();
		return (int)(BasicAnnualCost + annualcostofweapons - (((float)(numberOfTechnicians))*0.1*annualcostofweapons))  ;
	}
	@Override
	public String toString() {
		String str1 = super.toString();
		StringBuilder str = new StringBuilder();
		str.append(str1);
		str.append("\n\tNumberOfTechnicians=").append(this.getNumberOfTechnicians());
		return str.toString();
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
