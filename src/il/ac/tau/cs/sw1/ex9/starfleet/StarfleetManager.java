package il.ac.tau.cs.sw1.ex9.starfleet;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class StarfleetManager {

	/**
	 * Returns a list containing string representation of all fleet ships, sorted in descending order by
	 * fire power, and then in descending order by commission year, and finally in ascending order by
	 * name
	 */
	public static List<String> getShipDescriptionsSortedByFirePowerAndCommissionYear (Collection<Spaceship> fleet) {
		List<Spaceship> lst = new ArrayList<Spaceship>();
		lst.addAll(fleet);
		Collections.sort(lst,new mySpaceshipComparator());
		List<String> lstofStrings = new ArrayList<String>();
		for (Spaceship spaceship : lst) {
			lstofStrings.add(spaceship.toString());
		}
		return lstofStrings;
	}

	/**
	 * Returns a map containing ship type names as keys (the class name) and the number of instances created for each type as values
	 */
	public static Map<String, Integer> getInstanceNumberPerClass(Collection<Spaceship> fleet) {
		 Map<String, Integer> mapOfShips = new HashMap<String,Integer>();
		 for(Spaceship spaceship : fleet) {
			 String classname = spaceship.getClass().getSimpleName();
			 if(mapOfShips.containsKey(classname)) {
				 mapOfShips.put(classname,mapOfShips.get(classname)+1);
			 }
			 else {
				 mapOfShips.put(classname,1);
			 }
		 }
		 return mapOfShips;
	}


	/**
	 * Returns the total annual maintenance cost of the fleet (which is the sum of maintenance costs of all the fleet's ships)
	 */
	public static int getTotalMaintenanceCost (Collection<Spaceship> fleet) {
		int sum = 0;
		for(Spaceship spaceship : fleet) {
			sum += spaceship.getAnnualMaintenanceCost();
		}
		return sum;
	}


	/**
	 * Returns a set containing the names of all the fleet's weapons installed on any ship
	 */
	public static Set<String> getFleetWeaponNames(Collection<Spaceship> fleet) {
		Set<String> setOfweapons = new HashSet<String>();
		for(Spaceship spaceship : fleet) {
			if (spaceship instanceof myButtleSpaceshipFastOrHeavy) {
				List <Weapon> lst =((myButtleSpaceshipFastOrHeavy) spaceship).weapons;
				for(Weapon weapon : lst) {
					setOfweapons.add(weapon.getName());
				}
			}
		}
		return setOfweapons;
	}

	/*
	 * Returns the total number of crew-members serving on board of the given fleet's ships.
	 */
	public static int getTotalNumberOfFleetCrewMembers(Collection<Spaceship> fleet) {
		int sum = 0;
		for(Spaceship spaceship : fleet) {
			sum += spaceship.getCrewMembers().size();
		}
		return sum;
	}

	/*
	 * Returns the average age of all officers serving on board of the given fleet's ships. 
	 */
	public static float getAverageAgeOfFleetOfficers(Collection<Spaceship> fleet) {
		float sum = 0;
		int cntOfOfficers = 0;
		for(Spaceship spaceship : fleet) {
			Set <CrewMember> members= (Set<CrewMember>) spaceship.getCrewMembers();
			for(CrewMember member : members) {
				if(member.getClass() == Officer.class ) {
					cntOfOfficers++;
					sum += member.getAge();
				}
			}
		}
		return sum/cntOfOfficers;
	}
	

	/*
	 * Returns a map mapping the highest ranking officer on each ship (as keys), to his ship (as values).
	 */
	public static Map<Officer, Spaceship> getHighestRankingOfficerPerShip(Collection<Spaceship> fleet) {
		Map<Officer,Spaceship> mapOfSeniorofficers = new HashMap<Officer,Spaceship>();
		for(Spaceship spaceship : fleet) {
			Set <CrewMember> members= (Set<CrewMember>) spaceship.getCrewMembers();
			List<Officer> lst = new ArrayList<Officer>();
			for(CrewMember member: members) {
				if(member.getClass() == Officer.class ) {
					lst.add((Officer)(member));
				}
			}
			Collections.sort(lst,new myOfficerRankComparator() );
			if(!lst.isEmpty()) {
			mapOfSeniorofficers.put(lst.get(0), spaceship);
			}
		}
		return mapOfSeniorofficers;
	}

	/*
	 * Returns a List of entries representing ranks and their occurrences.
	 * Each entry represents a pair composed of an officer rank, and the number of its occurrences among starfleet personnel.
	 * The returned list is sorted ascendingly based on the number of occurrences.
	 */
	public static List<Map.Entry<OfficerRank, Integer>> getOfficerRanksSortedByPopularity(Collection<Spaceship> fleet) {
		Map<OfficerRank,Integer> mapOfofficersRank = new HashMap<OfficerRank,Integer>();
		for(Spaceship spaceship : fleet) {
			Set <CrewMember> members= (Set<CrewMember>) spaceship.getCrewMembers();
			for(CrewMember member: members) {
				if(member.getClass() == Officer.class ) {
					Officer officer = (Officer)member;
					OfficerRank rank = officer.getRank();
					if(mapOfofficersRank.get(rank)!= null) {
						mapOfofficersRank.put(rank,mapOfofficersRank.get(rank)+1);
					}
					else {
						mapOfofficersRank.put(rank,1);
					}
				}
			}	
		}
		Set <Map.Entry<OfficerRank, Integer>> setofentey = mapOfofficersRank.entrySet();
		List<Map.Entry<OfficerRank, Integer>> lst = new ArrayList<>();
		lst.addAll(setofentey);
		Collections.sort(lst, new myComparatorOfEntry());;
		return lst;
	}

}
