class BankAccount {
    String number;
    double balance;
    void removeMoney(double amount) {
        this.balance = this.balance - amount;
    }
}