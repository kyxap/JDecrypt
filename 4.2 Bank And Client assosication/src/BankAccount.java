
class BankAccount {
    String number;
    double balance;
	Customer customer; ///////////////// <<<<<<<<<<<<===============================

	public BankAccount(Customer customer) {
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}