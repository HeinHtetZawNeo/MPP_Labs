package labs.day3Lab.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private double buildingMaintenanceCost;
	List<Apartment> apartments;

	{
		this.buildingMaintenanceCost = 0.0;
		this.apartments = new ArrayList<Apartment>();
	}

	public Building() {
	}

	public Building(double cost, List<Apartment> apartments) {
		this.buildingMaintenanceCost = cost;
		this.apartments = apartments;
	}

	public double getBuildingMaintenanceCost() {
		return this.buildingMaintenanceCost;
	}

	public void addApartment(Apartment ap) {
		this.apartments.add(ap);
	}
	
	public List<Apartment> getApartments() {
		return this.apartments;
	}

	public void setBuildingMaintenanceCost(double cost) {
		this.buildingMaintenanceCost = cost;
	}

	public void addBuildingMaintenanceCost(double cost) {
		this.buildingMaintenanceCost += cost;
	}

	public double getTotalRent() {
		double totalRent = 0.0;
		for(Apartment apt:this.apartments) {
			totalRent += apt.getRent();
		}
		return totalRent;
	}
}
