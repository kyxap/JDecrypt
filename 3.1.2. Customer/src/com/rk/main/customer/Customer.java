/* class Customer {
	boolean goodCustomer;
	String name;
	char gender;
	*/


//after ading package stucture the constructor mod accew was changed from def to public
package com.rk.main.customer;
public class Customer {
	
	public enum gender {
		M, F;
	}
	
	public Customer(boolean goodCustomer, String name, gender gen) {
		String msg = "";
		if (gender.M.equals(gen)){
			if (goodCustomer == true){
				msg += "Hello, " + name;
			} else msg +="Go to hell, " + name;
		}
		if (gender.F.equals(gen)) {
			msg += "Hello, " + name;
			if (goodCustomer == true){
				msg += "\nWhat a nice dress!";
			} else msg += "\nNice to see you again";
		}
		System.out.println(msg);	
	}
	public void test() {
		System.out.println("Done");
	}
	
}