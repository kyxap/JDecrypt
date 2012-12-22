
public class MathTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	/*
	 * Используйте вложенные циклы для печати таблицы умножения. 
	 * Используйте локальную переменную для задания размерности таблицы. 
	 * В следующем примере мы отображаем таблицу 4х4. 
	 * Ваш код должен работать с любым значением размерности таблицы.
	 * http://knowledgeblackbelt.com/#CoursePage/12649754/RU
	 * 
	 * Дополнительно: добавьте пробелы для форматирования столбцов:
	 * Дополнительно: в конце каждой строки чисел выведите их сумму:
	 */
		int mult = 7;
		// Ваш код
		
		int sum = 0;
		for (int i = 1; i <= mult; i++){
			for (int j = 1; j <= mult; j++){
				sum += j * i;
				if (j * i <= 9) {
					System.out.print(" " + j * i + " ");
				} else System.out.print("" + j * i + " ");
				}
			System.out.println("= " + sum);
			sum = 0;
			}
	}

}
