
public class From1Till100 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Напишите цикл, который отображает все числа от 0 до 100, 
		 * кроме тех, которые делятся на 5. При этом 50 является исключением -
		 *  это число должно быть напечатано.
		 *  Дополнительно (не обязательно): добавьте перенос строки после чисел 9, 19, 29. 
		 *  Для этого можно использовать println() вместо print().
		 */
		for (int count = 1; count <= 100; count++){
			if (count % 5 == 0 & count != 50) {
				continue;
			}
			System.out.print(count + " ");
			if ((count + 1) % 10 == 0) {
				System.out.println();
				}
			}

	}

}
