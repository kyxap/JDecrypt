package rk.sandwich.model;

import java.util.ArrayList;

public class Sandwich {
	
	private String label;
	private long price;
	
	private Worker owner;
	private ArrayList<Supplement> supplements = new ArrayList<Supplement>();
	
	public ArrayList<Supplement> getSupplements() {
        return supplements;
    }
	  /**
	 * @param label
	 * @param price
	 */
	public Sandwich(String label, long price) {
//		super();
		this.label = label;
		this.price = price;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Worker getOwner() {
		return this.owner;
	}

	public void setOwner(Worker owner) {
		this.owner = owner;
	}

}
