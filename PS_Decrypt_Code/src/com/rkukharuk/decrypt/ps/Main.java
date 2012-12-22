package com.rkukharuk.decrypt.ps;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		System.out.print("Administrator Code: ");
		Scanner sc = new Scanner(System.in);
		String code = sc.nextLine();

		String AAI = "jjjjjj9999999999999999999999999999999999999999";
		String AIA = "hhh999jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj";
		String III = "9990000000000000000000000000000000000000000";
		String IAI = "9AAAAAAAAAAAAA0";
		String IAA = "999dddkkkkkkkkkkkkkjkkkk";
		String AII = "AAA900000000000";
		String decrypt = "";
		
		Decryptions dec = new Decryptions();
		
		if (dec.checkString(code.substring(5,6)) == false && dec.checkString(code.substring(12,13)) == true) {
			decrypt = IAI;
		}
		
		else if (dec.checkString(code.substring(2,3)) == true && dec.checkString(code.substring(5,6)) == true && dec.checkString(code.substring(12,13)) == true) {
			decrypt = III;
		}
		
		else if (dec.checkString(code.substring(2,3)) == false && dec.checkString(code.substring(5,6)) == true && dec.checkString(code.substring(12,13)) == false) {
			decrypt = AIA;
		}
		
		else if (dec.checkString(code.substring(2,3)) == false && dec.checkString(code.substring(5,6)) == false && dec.checkString(code.substring(12,13)) == true) {
			decrypt = AAI;
		}
		
		else if (dec.checkString(code.substring(2,3)) == true && dec.checkString(code.substring(5,6)) == false && dec.checkString(code.substring(12,13)) == false) {
			decrypt = IAA;
		}
		
		else if (dec.checkString(code.substring(2,3)) == false && dec.checkString(code.substring(5,6)) == true && dec.checkString(code.substring(12,13)) == true) {
			decrypt = AII;
		}
		
		else System.out.println("I can't decrypt this code!");
		
		//For debuging (3,6,13 characters)
//		System.out.println("3th=" + code.substring(2,3));
//		System.out.println("6th=" + code.substring(5,6));
//		System.out.println("13th= " + code.substring(12,13));
		
		System.out.println("Password: " + decrypt);

		
	}

}
