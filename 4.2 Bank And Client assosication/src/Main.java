
//import java.util.ArrayList;
//
//class Main {
//    public static void main(String[] args) {
//        BankAccount johnBa1 = new BankAccount();
//        johnBa1.balance = 100;
//        johnBa1.number = "123-45676890-00";
//        BankAccount johnBa2 = new BankAccount();
//        johnBa2.balance = 200;
//        johnBa2.number = "222-45676890-22";
//        BankAccount nicolasBa = new BankAccount();
//        nicolasBa.balance = 500;
//        nicolasBa.number = "555-45676890-55";
//        
//        Customer john = new Customer();
//        john.firstName = "John";
//        john.lastName = "Rizzo";
//        
//        Customer nicolas = new Customer();
//        nicolas.firstName = "Nicolas";
//        nicolas.lastName = "Brasseur";
//        
//        johnBa1.customer = john;
//        johnBa2.customer = john;        
//        nicolasBa.customer = nicolas;
//        
//        System.out.println(johnBa1.customer == john);
//        System.out.println(johnBa1.customer.firstName);
//        System.out.println(nicolasBa.customer == nicolas);
//        
//        ArrayList<BankAccount> baList = new ArrayList<BankAccount>();
//        baList.add(johnBa1);
//        baList.add(johnBa2);
//        baList.add(nicolasBa);
////        for(BankAccount ba : baList) {
////            System.out.println(ba.balance);
////        }
////        
////        for(BankAccount ba : baList) {
////            System.out.println(baList.contains(ba));
////        }
//        System.out.println("==> " + baList.contains());
//        System.out.println(extractCustomer(baList));
//
//    
//		
//	}  
////    public static <E> ArrayList<E> extractCustomer(ArrayList<BankAccount> baList) {
////    	int t;
////		return null;
////		
////	}    
//
//}

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Customer nicolas = new Customer("Nicolas", "Brasseur");
		Customer john = new Customer("John", "Smith");
//		john.setFirstName("John");
//		john.setLastName("Smith");
		

		BankAccount johnBa1 = new BankAccount(john);
		BankAccount johnBa2 = new BankAccount(john);
		BankAccount nicolasBa = new BankAccount(nicolas);
		
//		deleted after Costructro was edded
//		johnBa1.setCustomer(john);
//		johnBa2.setCustomer(john);
//		nicolasBa.setCustomer(nicolas);

				
		ArrayList<BankAccount> baList = new ArrayList<BankAccount>();
		baList.add(johnBa1);
		baList.add(johnBa2);
		baList.add(nicolasBa);
		ArrayList<Customer> cuList = new ArrayList<Customer>();

		for (BankAccount tmpBanckAccount : baList) {
			if (tmpBanckAccount.getCustomer().equals(john)){
				System.out.println("Found " + tmpBanckAccount.getCustomer().getFirstName());
//				System.out.println("His name is: " + tmpBanckAccount.customer.getFirstName());
			}
			//помещать экземпл€ры Customer в новый список,
			cuList.add(tmpBanckAccount.getCustomer());
		}
		System.out.println("==> " + baList.contains(johnBa1));
		System.out.println("==> " + cuList.contains(john));
	}
}