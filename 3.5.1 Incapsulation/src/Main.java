/*
 * ���������� � ���� ������ ����������� �� ����� � ��������� (� ������ �����), 
 * �������� �������� �� �� ��� � ������ CrazyService ���������� �������� 
 * ��������������� � ����� balance, ��������� ��� ����� ����������� ������� private. 
 * ��������� ���� ���������� �� ������� ����������� ������� � �� ��������� setter.
 * ���������: ��� ���������� setter'� �� ������ ������������ ����������� � �����������.
 * http://knowledgeblackbelt.com/#CoursePage/12649910/RU
 */

class Main {
    public static void main(String[] args) {
    	
//        BankAccount johnBa = new BankAccount();
    	BankAccount johnBa = new BankAccount(100, "123-45676890-00");
        BankAccount nicolasBa = new BankAccount(500, "555-45676890-55");
//        johnBa.balance = 100;
//        johnBa.number = "123-45676890-00";
//        BankAccount nicolasBa = new BankAccount();
//        nicolasBa.balance = 500;
//        nicolasBa.number = "555-45676890-55";
        CrazyService.pay(55, johnBa, nicolasBa);
    }
}