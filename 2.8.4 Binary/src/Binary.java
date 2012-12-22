/*
 * 2.8.4. �������������: �������� �������������
������ ���������� �������� �� ������������ ��� ����������� �����. �������� �����, ������� ��������� � �������� ��������� ��������� ����� ����� � ���������� ������� ��������� � �������� ������ ����� � �������� ������� ���������.

��������, ��� ����� 8 ����� ������ ������� 1000.

����������: ��� �������� ������� �� ���������� ������������ �� ������������ ������������������ ������ ������ String, ���������� ��������� ���������� ������ �����.
 
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
