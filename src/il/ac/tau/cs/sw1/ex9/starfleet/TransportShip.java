package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.Set;

public class TransportShip extends myButtleOrTransport{
	
	private final int BasicAnnualCost = 3000;
	private int cargoCapacity;
	private int passengerCapacity;
	
	public TransportShip(String name, int commissionYear, float maximalSpeed, Set<CrewMember> crewMembers, int cargoCapacity, int passengerCapacity){
		super(name,commissionYear,maximalSpeed,crewMembers);
		this.cargoCapacity = cargoCapacity;
		this.passengerCapacity = passengerCapacity;
	}

	public int getAnnualMaintenanceCost() {
		return BasicAnnualCost + (5*cargoCapacity) + (3*passengerCapacity);
	}

	public int getFirePower() {
		return FirePowerforeach;
	}
	
	public int getCargoCapacity() {
		return cargoCapacity;
	}
	
	
	public int getPassengerCapacity() {
		return passengerCapacity;
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
		str.append("\n\tCargoCapacity=").append(cargoCapacity);
		str.append("\n\tPassengerCapacity=").append(passengerCapacity);
		return str.toString();
	}

}
