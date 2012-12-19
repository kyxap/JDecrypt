package com.rk.sandwichStore;



public class Sandwich {
//	TODO: Supplement supplement; // association
	
	private String name;
	private double price;
	private String supplements;
	private boolean availability;
	private final double TAX = 0.2;
	private Worker owner;
	
	public Worker getOwner() {
		return this.owner;
	}
	
	public void setOwner(Worker name) {
		this.owner = name; 
	}

	
	/**
	 * Sandwich created with real price (TAX included)
	 * @param name
	 * @param price
	 * @param availability
	 */
	public Sandwich(String name, double price, boolean availability) {
		this.name = name;
		this.price = price * TAX + price;
		this.availability = availability;
	}
	
	public void addSupplements(String supplements) {
		this.supplements = supplements + ", ";
	}
	
	public boolean getAvailability() {
		return availability;
	}
	public void changeAvailability(boolean position) {
		availability = position;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String getsName() {
		return this.name;
	}
	
	public String getSuplements() {
		return this.supplements;
	}
	
}
