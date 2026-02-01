package variable_scope;

public class Demo01 {
	// Member variable
	// Truy cập thông qua this.xxx
	int a = 100;
	
	public void test() {
		System.out.println("Member a = " + this.a);
		System.out.println("Member a = " + a);
	}
	
	public static void main(String[] args) {
		// Biến 
		// Local variable: trong cặp {}
		int a = 10;
		System.out.println("a = " + a);
		
		if(true) {
			int b = 20;
			System.out.println("b = " + b);
		}
		
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);
		
		Demo01 demo1 = new Demo01();
		demo1.test();
		
	}
	
	
}
