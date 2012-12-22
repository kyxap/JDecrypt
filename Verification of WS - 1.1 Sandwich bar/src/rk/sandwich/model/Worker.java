package rk.sandwich.model;

import java.util.ArrayList;


public class Worker {
    String firstName;
    long budget;  // In cents
    
    ArrayList<Sandwich> sandwiches = new ArrayList<Sandwich>();

    
	/**
	 * @param firstName
	 * @param budget
	 * @param sandwiches
	 */
	public Worker(String firstName, long budget) {
		this.firstName = firstName;
		this.budget = budget;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public long getBudget() {
		return budget;
	}

	public void setBudget(long budget) {
		this.budget = budget;
	}

	public ArrayList<Sandwich> getSandwiches() {
		return sandwiches;
	}

	// объектно-ориентированный подход с "толстой моделью данных"
    public void purchase(Sandwich sand) {
        if (sand.getOwner() != null) {
            throw new RuntimeException("Bug: that sandwich has already an owner.");
        }

        if (this.getBudget()-sand.getPrice() < 0) {
            throw new RuntimeException("Bug: we are too poor.");
        }

        sand.setOwner(this);
        this.getSandwiches().add(sand);
        this.setBudget( this.getBudget()-sand.getPrice() );
    }

}


