
public class From1Till100 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * �������� ����, ������� ���������� ��� ����� �� 0 �� 100, 
		 * ����� ���, ������� ������� �� 5. ��� ���� 50 �������� ����������� -
		 *  ��� ����� ������ ���� ����������.
		 *  ������������� (�� �����������): �������� ������� ������ ����� ����� 9, 19, 29. 
		 *  ��� ����� ����� ������������ println() ������ print().
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
