
public class Task_1 {

	/*
	 * Заданы 3 локальные переменные типа int, напишите набор вложенных if 
	 * конструкций, который печатает заданные числа в порядке возрастания. 
	 * Даже если мы изменим значение переменных они должны выводиться в возрастающем порядке.
	 */
	
	public static void main(String[] args) {
		int a = 12;
		int b = 34;
		int c = 6;		
			
		//abc
		if (a < b && a < c && b < c ) {
			System.out.print(a + " " + b + " " + c);
		}
		
		//bca
		else if (b < c && b < a && c < a ) {
			System.out.print(b + " " + c + " " + a);
		}
		
		//cab
		else if (c < a && c < b && c < b ) {
			System.out.print(c + " " + a + " " + b);
		}
		
		//bac
		else if (b < a && b < c && a < c ) {
			System.out.print(b + " " + a + " " + c);
		}
		
		//acb
		else if (a < c && a < b && c < b ) {
			System.out.print(a + " " + c + " " + b);
		}
		else {
			System.out.println("No mathing");
		}

	}

}
