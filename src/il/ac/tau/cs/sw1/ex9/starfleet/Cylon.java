package il.ac.tau.cs.sw1.ex9.starfleet;

public class Cylon extends myTeamMember {
	protected int modelNumber; 
	
	public Cylon(String name, int age, int yearsInService, int modelNumber) {
		super(age,yearsInService,name);
		this.modelNumber = modelNumber;
	}
	
	public int  getModelNumber() {
		return modelNumber;
	}
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

}
