package rk.sandwich2;

import java.util.ArrayList;

public class Sandwich {
	private String name;
	private double price;
	
//	private ArrayList<Worker> owner = new ArrayList<Worker>();
	private Worker owner;
	
//	Supplement suppl; //1 to 1
	private ArrayList<Supplement> suppList = new ArrayList<Supplement>();
	
	/**
	 * @param name
	 * @param price
	 */
	public Sandwich(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ArrayList<Supplement> getSuppList() {
		return suppList;
	}

	public void setSuppList(ArrayList<Supplement> suppList) {
		this.suppList = suppList;
	}

	public Worker getWorker() {
		return owner;
	}

	public void setWorker(Worker worker) {
		this.owner = worker;
	}

	public Worker getOwner() {
		return owner;
	}

	public void setOwner(Worker owner) {
		this.owner = owner;
	}


}
