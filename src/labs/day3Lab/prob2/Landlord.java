package labs.day3Lab.prob2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
	private List<Building> buildings;

	{
		buildings = new ArrayList<Building>();
	}

	public Landlord() {
	}

	public Landlord(List<Building> buildings) {
		this.buildings = buildings;
	}
	
	public double getTotalRent() {
		double totalRent = 0.0;
		
		for(Building b:buildings) {
			totalRent += b.getTotalRent()-b.getBuildingMaintenanceCost();
		}
		
		return totalRent;
	}
	
	public static void main(String[] args) {
		List<Apartment> appartmentList1 = new ArrayList<Apartment>();
		appartmentList1.add(new Apartment(1000));
		appartmentList1.add(new Apartment(2000));
		appartmentList1.add(new Apartment(3000));
		
		List<Apartment> appartmentList2 = new ArrayList<Apartment>();
		appartmentList2.add(new Apartment(4000));
		appartmentList2.add(new Apartment(5000));
		appartmentList2.add(new Apartment(6000));
		
		List<Building> buildingList = new ArrayList<Building>();
		buildingList.add(new Building(100,appartmentList1));
		buildingList.add(new Building(900,appartmentList2));
		
		Landlord myLandlord = new Landlord(buildingList);
		
		System.out.println("Total Rent for myLandlord :"+myLandlord.getTotalRent());
	}

}
