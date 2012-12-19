import java.util.concurrent.CountDownLatch;


public class TestC {
    public static void main(String[] args) {
    	
//    	int[] ar1;
//    	ar1 = new int[22];
//    	//ar1[1]	 = 44;
//    	int count = 0;
//    	for (int count : ar1) {
//    		ar1[count] += count;
//			System.out.println(ar1[count]);
//			count++;
//		}
//    	
//
//    	System.out.println("/////" +ar1[1] + " " + ar1[7]);
//
    	System.out.println(asd(55));
        
        
    }
    int ya_ru = 4; 
    int ta = 5;
    public static int asd(int n) {
    	int count = 0;
		if (n < 2) {
			return n;
		}
		else {
			count++;
//			printMe(count);
			System.out.println(">>>>>>" + count + " " + n);
			return asd(n-1) + asd(n-2);
			
		}
	}
    
    public static void printMe(int prt) {
		System.out.println(prt);
	}

}