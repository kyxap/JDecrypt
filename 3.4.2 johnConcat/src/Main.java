
public class Main {

	public static void main(String[] args) {
		String someEnt = "Hello";
		String name = " John";
		String rez = johnConcat(someEnt, name);
		if (someEnt + name == rez) {
			System.out.println("==");
		} else if ((someEnt + name).equals(rez)) {
			System.out.println("equals");
		} else System.out.println("err");

	}
	public static String johnConcat(String str, String name) {
		str+= name;
		return str;
	}

}
