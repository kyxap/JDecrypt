/*
 * 2.8.4. Дополнительно: двоичное представление
Данное упражнение является не обязательным для прохождения курса. Напишите метод, который принимает в качестве аргумента небольшое целое число в десятичной системе счисления и печатает данное число в двоичной системе счисления.

Например, для числа 8 метод должен вывести 1000.

Примечание: для большего эффекта от упражнения постарайтесь не использовать специализированные методы класса String, оперируйте числовыми значениями вместо этого.
 
 *
 *http://knowledgeblackbelt.com/#CoursePage/12649798/RU
 */

public class Binary {
	public static void main(String[] args) {
		System.out.println(binMath(19));
	}
	
	public static String binMath(int value){
		String rez = "";
		int temp = 0;
		while (value != 0){
			temp = value % 2;
			value = value / 2;
			if (temp == 1){
				rez+= "1";
			} 
			else rez+= "0";
		}
		rez = new StringBuffer(rez).reverse().toString();
		return rez;
		
	}

}
