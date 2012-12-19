package com.rk.main;

import com.rk.main.customer.Customer;
import com.rk.main.customer.Customer.gender;

//import com.rk.customer.*;

public class Main {

	public static void main(String[] args) {
		//Customer rika = new Customer();
		//rika.gender = 'F';
		//rika.goodCustomer = true;
		//rika.name = "Rika Vasilivna";

		//custy('F', true, "Rika");
		//custy('F', false, "Rita");
		//custy('M', true, "Binn");
		//custy('M', false, "Dino");
		
		//autoHello(rika);
		Customer someCst = new Customer(true, "Maria", gender.F);
		someCst.test(); // for test only! 
//		Customer.test(); // did not work because test methond is not static

	}
}
	/*
	public static void autoHello(Customer custy) {
		String msg = "";
		if (custy.gender == 'M'){
			if (custy.goodCustomer == true){
				msg += "Hello, " + custy.name;
			} else msg +="Go to hell, " + custy.name;
		}
		if (custy.gender == 'F') {
			msg += "Hello, " + custy.name;
			if (custy.goodCustomer == true){
				msg += "\nWhat a nice dress!";
			} else msg += "\nNice to see you again";
		}
		System.out.println(msg);
	}
}
	/*
	 
	 * public static void  custy(char gen, boolean mark, String name) {
	 
		String msg = "";
		if (gen == 'M'){
			if (mark == true){
				msg += "Hello, " + name;
			} else msg +="Go to hell, " + name;
		}
		if (gen == 'F') {
			msg += "Hello, " + name;
			if (mark == true){
				msg += "\nWhat a nice dress!";
			} else msg += "\nNice to see you again";
		}
		System.out.println(msg);
	}
	 */

