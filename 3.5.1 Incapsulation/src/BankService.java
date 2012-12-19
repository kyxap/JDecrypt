class BankService {
    static void removeMoney(double amount, BankAccount ba) {
        ba.debit(amount);
    }
}