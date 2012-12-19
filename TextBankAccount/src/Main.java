class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("moandji-123");
        System.out.println(myAccount.accountNumber); // печатает "moandji-123"
        System.out.println(myAccount.balance); // печатает значение по умолчанию (0.0 для double);

        myAccount.balance += 5.0;
        System.out.println(myAccount.balance); // печатает текущее значение (5)
    }
}