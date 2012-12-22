class CrazyService {
    static void pay(double price, BankAccount baFrom, BankAccount baTo) {
        // 1. .... update accountancy 
        // 2. remove money from first bank account
        //    It's impossible to access baFrom.balance 
        //    directly now (it's private)
        baFrom.debit(price); 
        // Now, if price is too high, program stopped,
        // but at least we know there is a problem.
        
        // 3. add money to second bank account
        baTo.addMoney(price);
        System.out.println(baFrom.getBalance());
    }
}