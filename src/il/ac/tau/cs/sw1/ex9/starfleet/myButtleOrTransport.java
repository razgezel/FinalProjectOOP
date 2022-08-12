package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.Objects;
import java.util.Set;

public abstract class myButtleOrTransport implements Spaceship{
	
	protected String Name;
	protected int CommissionYear;
	protected float MaximalSpeed;
	protected final int  FirePowerforeach = 10;
	protected Set<?extends CrewMember> CrewMembers;
	
	public myButtleOrTransport(String name, int CommissionYear,float MaximalSpeed,Set<? extends CrewMember> CrewMembers) {
		this.Name = name;
		this.CommissionYear = CommissionYear;
		this.CrewMembers = CrewMembers;
		this.MaximalSpeed = MaximalSpeed;
	}
	
	public Set<? extends CrewMember> getCrewMembers() {
		return CrewMembers;
	}
	
	public float getMaximalSpeed() {
		return MaximalSpeed;
	}
	
	public int getCommissionYear() {
		return CommissionYear;
	}
	
	public String getName() {
		return Name;
	}
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(this.getClass().getSimpleName());
		str.append("\n\tName=").append(Name);
		str.append("\n\tCommissionYear=").append(CommissionYear);
		str.append("\n\tMaximalSpeed=").append(MaximalSpeed);
		return str.toString();
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(Name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		myButtleOrTransport other = (myButtleOrTransport) obj;
		return Objects.equals(Name, other.Name);
	}

	public abstract int getAnnualMaintenanceCost();
	
	public abstract int getFirePower();
}
