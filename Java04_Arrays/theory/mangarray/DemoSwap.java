package mangarray;

public class DemoSwap {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		System.out.println("Before swap: a = " + a + ", b = " + b);
		
		// Swap
//		int b_cu = b;
//		b = a;
//		a = b_cu;
		
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swap: a = " + a + ", b = " + b);
		
	}
}
