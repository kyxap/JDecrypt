/*
 * Реализуйте в коде пример изображённый на видео и диаграмме (в нижней части), 
 * обратите внимание на то что в классе CrazyService невозможно работать 
 * непосредственно с полем balance, поскольку оно имеет модификатор доступа private. 
 * Исправьте этот недостаток не изменяя модификатор доступа и не используя setter.
 * Подсказка: при отсутствие setter'а Вы можете использовать конструктор с аргументами.
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