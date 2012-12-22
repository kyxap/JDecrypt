public class BankAccount {
    private String accountNumber;
    private double balance;
    private int transactionCount;

    // эти методы доступны из любого класса
    public void creditAccount(double amount) {
        balance += amount;
        addTransaction();
    }

    public void debitAccount(double amount) {
        balance -= amount;
        addTransaction();
    }

    public double getBalance() {
        return balance;
    }

    private void addTransaction() {
        transactionCount++;
    }
    public int showTransaction() {
		return this.transactionCount;
	}
}