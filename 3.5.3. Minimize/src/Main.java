public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        
        System.out.println("before: " + myAccount.getBalance());
        myAccount.creditAccount(3.2);
        myAccount.creditAccount(500);
        myAccount.debitAccount(15);
        System.out.println("after: " + myAccount.getBalance());
        System.out.println("transaction done: " + myAccount.showTransaction());
    }
}