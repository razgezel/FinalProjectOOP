package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.List;
import java.util.Set;

public abstract class  myButtleSpaceshipFastOrHeavy extends myButtleOrTransport{
	
	protected List<Weapon> weapons;
	
	public myButtleSpaceshipFastOrHeavy(String name, int commissionYear, float maximalSpeed, Set<? extends CrewMember> crewMembers, List<Weapon> weapons){
		super(name,commissionYear,maximalSpeed,crewMembers);
		this.weapons = weapons;
	}
	
	
	public List<Weapon> getweapon(){
		return weapons;
	}
	public int getFirePower() {
		int firepower = FirePowerforeach;
		for(Weapon weapon: weapons) {
			firepower += weapon.getFirePower();
		}
		return firepower;
	}
	protected int annualcostofweapons() {
		int annualMaintenanceCostofweapons = 0;
		for(Weapon weapon: weapons) {
			annualMaintenanceCostofweapons += weapon.getAnnualMaintenanceCost();
		}
		return annualMaintenanceCostofweapons;
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	@Override
	public String toString() {
		String str1 = super.toString();
		StringBuilder str = new StringBuilder();
		str.append(str1);
		str.append("\n\tFirePower=").append(this.getFirePower());
		str.append("\n\tCrewMembers=").append(this.CrewMembers.size());
		str.append("\n\tAnnualMaintenanceCost=").append(this.getAnnualMaintenanceCost());
		str.append("\n\tWeaponArray=").append(this.weapons.toString());
		return str.toString();
	}
	public abstract int getAnnualMaintenanceCost();
	

}
