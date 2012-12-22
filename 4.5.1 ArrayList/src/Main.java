import java.util.ArrayList;


public class Main {
	public static void main(String[] args) {
		ArrayList<Some> someList = new ArrayList<Some>();
		Some mainSome = new Some("String1", 4643);
		Some mainSome2 = new Some("String 2", 22222);
		
		someList.add(mainSome);
		someList.add(mainSome2);
		
		for (Some some : someList) {
			System.out.println(some.getSome1());
			System.out.println(some.getSome2());
		}
		
		System.out.println(mainSome.getSome1());
	}
}
