package il.ac.tau.cs.sw1.ex9.starfleet;

import java.util.Objects;

public abstract class myTeamMember implements CrewMember {
	
	protected String name ;
	protected int age;
	protected int yearsInService;
	
	public myTeamMember(int age, int yearsInService, String name) {
		this.age = age;
		this.yearsInService = yearsInService;
		this.name = name;
	}

	public int getAge() {
		
		return this.age;
	}
	public String getName() {
		return name;
	}
	
	public int getYearsinService() {
		return yearsInService;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		myTeamMember other = (myTeamMember) obj;
		return Objects.equals(name, other.name);
	}
	
	
	

}
