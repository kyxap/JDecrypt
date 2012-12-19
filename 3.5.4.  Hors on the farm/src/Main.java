//http://knowledgeblackbelt.com/#CoursePage/12649938/RU

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hors banksky = new Hors("Banksky", 80, 15, true);
		Hors jayne = new Hors("Jayne", 34, 32, false);
//		System.out.println(jayne.getMaxHours());
//		System.out.println(jayne.getActualHours());
//		System.out.println(banksky.getMaxHours());
//		System.out.println(banksky.getActualHours());
		jayne.getMaxHours();
		jayne.getActualHours();
		banksky.getMaxHours();
		banksky.getActualHours();
		jayne.getInfoAboutCool();
		banksky.getInfoAboutCool();
		
	}
}
