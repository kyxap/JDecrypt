
public class MathTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	/*
	 * ����������� ��������� ����� ��� ������ ������� ���������. 
	 * ����������� ��������� ���������� ��� ������� ����������� �������. 
	 * � ��������� ������� �� ���������� ������� 4�4. 
	 * ��� ��� ������ �������� � ����� ��������� ����������� �������.
	 * http://knowledgeblackbelt.com/#CoursePage/12649754/RU
	 * 
	 * �������������: �������� ������� ��� �������������� ��������:
	 * �������������: � ����� ������ ������ ����� �������� �� �����:
	 */
		int mult = 7;
		// ��� ���
		
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
