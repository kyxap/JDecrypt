/**
 * 
 * @author rkukharuk
 *
 Write a program that (in the given order):

declares a long with 0 as initial value,
prints its value to the console,
changes the value to 3,
prints the new value,
declares a boolean with false as initial value,
prints the value of the boolean.
 *
 */
public class Chapter2_1_4_Task_1 {
	
	public static void main(String[] args) {
		
		boolean canITakeHisMoney;
		int hisBalance = 5;
		long myBalance = 4;
		hisBalance += 8;
		canITakeHisMoney = hisBalance > myBalance;
		canITakeHisMoney = canITakeHisMoney && (hisBalance >= 3);
		System.out.println(canITakeHisMoney);
		

	}

}
