package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.List;
import java.util.Set;

public class Fighter extends myButtleSpaceshipFastOrHeavy{
	private final int BasicAnnualCost = 2500;
	
	public Fighter(String name, int commissionYear, float maximalSpeed, Set<? extends CrewMember> crewMembers, List<Weapon> weapons){
		super(name,commissionYear,maximalSpeed,crewMembers,weapons);
	}

	public int getAnnualMaintenanceCost() {
		return BasicAnnualCost + this.annualcostofweapons() + ((int)(1000*MaximalSpeed)) ;
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
