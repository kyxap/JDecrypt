class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("moandji-123");
        System.out.println(myAccount.accountNumber); // �������� "moandji-123"
        System.out.println(myAccount.balance); // �������� �������� �� ��������� (0.0 ��� double);

        myAccount.balance += 5.0;
        System.out.println(myAccount.balance); // �������� ������� �������� (5)
    }
}