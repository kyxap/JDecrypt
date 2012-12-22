package com.rk.sandwichStore;

public class Worker {
	private String fName;
	private double balance;
	private String receipt;
	
	public Worker(String name, double bal) {
		if (bal < 0) {
			throw new RuntimeException("Bug: "+
		              "balance should be more than or equl 0");
		} else {
			this.fName = name;
			this.balance = bal;
		}
	}
	
	public void setName(String newName) {
		this.fName = newName;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	/**
	 * Many verification for newSandwich.getAvailability() and this.balance
	 * @param newSandwich 
	 */
	public void purchase(Sandwich newSandwich) {
		if (this.balance - newSandwich.getPrice() >= 0 && newSandwich.getAvailability() == true) {
			newSandwich.changeAvailability(false);
			newSandwich.setOwner(this);
			this.balance -= newSandwich.getPrice();
			this.receipt = this.fName + " your " + newSandwich.getsName() + 
					" with " + newSandwich.getSuplements() + " already cooked!" + 
					" Balance: " + getBalance();
		} else if (newSandwich.getAvailability() == false) {
			this.receipt = "Sorry, " + this.fName + " the " + newSandwich.getsName() +
					" is already sold";
		} else this.receipt = "Sorry, " + this.fName + " you dont have enought money for " + 
					newSandwich.getsName() + " Balance: " + getBalance();
		System.out.println(getReceipt());
	}
	
	public void setReceipt(String newRec) {
		this.receipt += newRec;
	}
	
	public String getReceipt() {
		return this.receipt;
	}

	public static Sandwich arrayPrint(Sandwich sandwich) {
		return sandwich;
	}

	public String getfName() {
		return fName;
	}

}