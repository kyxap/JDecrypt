
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int x = 100;
		int y = 1;
		while (y != x) {
			if (y % 3 == 0 && y % 5 == 0){
				System.out.print("fizzbuzz ");
			} else if (y % 3 == 0) {
				System.out.print("fizz ");
			} else if (y % 5 == 0) {
				System.out.print("buzz ");
			} else System.out.print(y + " ");
			y++;
			
		}
	}

}
