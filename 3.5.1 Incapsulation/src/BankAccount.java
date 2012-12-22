class BankAccount {
    String number;    
    private double balance;
//    int count = 0;
	BankAccount(int i, String num) { //constructor
		this.balance = i;
		this.number = num;
	}
	void debit(double amount) {
        // check first there is enough money
        if (this.balance - amount > 0) { // OK
           this.balance = this.balance - amount;
        } else { // oups, problemo
           throw new RuntimeException("Bug: some code "+
              "attempts to remove too much money!");
        }
//        addTranscation();
    }
//	private void addTranscation(){
//		count++;
//	}
    void addMoney(double amount) {
        this.balance = this.balance + amount;
//        addTranscation();
    }
    double getBalance() {
        return this.balance;
    }
  
}