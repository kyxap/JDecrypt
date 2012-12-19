package rk.sandwich2;

public class Worker {
	private String name;
	private double balance;
	
	
	
	/**
	 * @param name
	 * @param balance
	 */
	public Worker(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}
	

	public void setBalance(double balance) {
		this.balance -= balance;
	}
	
	public void purchase(Sandwich stuff) {
		if (stuff.getOwner() == null){
			if (stuff.getPrice() > getBalance()) {
			System.out.println(getName() + " do not have money to buy it");
			
		} else {
			setBalance(stuff.getPrice());
			stuff.setOwner(this);
//			System.out.println(stuff.getName() + " with " + stuff.getSuppList() + " owned by " + stuff.getOwner().getName());
//			System.out.println(getBalance());
		}
			} else System.out.println(stuff.getName() + " already sold");
		
		
	}
}
