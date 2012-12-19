
//http://knowledgeblackbelt.com/#CoursePage/12649798/RU
public class Reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(reverse(2132456));
		

	}
	
	public static int reverse(int original){
		int base = 10;
		int rez = 0;
		while (original > 0){
			int d = original / base;
			int m = original % base;
			rez = rez * 10 + m;
			original = d;
		}
		return rez;
		
		
	}

}
