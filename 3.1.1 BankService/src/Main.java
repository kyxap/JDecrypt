
class Main {
    public static void main(String[] args) {
        BankAccount johnBa = new BankAccount();
        johnBa.balance = 100;
        johnBa.number = "123-45676890-00";
        BankAccount nicolasBa = new BankAccount();
        nicolasBa.balance = 500;
        nicolasBa.number = "555-45676890-55";
//        BankService.removeMoney(6, johnBa);
        BankService.changeNum("555-34544-12", nicolasBa);
        System.out.println(johnBa.balance);
        System.out.println(nicolasBa.number);
        
        
        johnBa.removeMoney(4);
        System.out.println(johnBa.balance);
    }
}