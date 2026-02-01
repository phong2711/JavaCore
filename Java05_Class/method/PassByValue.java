package demofunction;

public class PassByValue {
	public static void main(String[] args) {
		int n = 10;
		System.out.println("Truoc n = " + n);
		update(n);
		System.out.println("Sau n = " + n);
	}
	
	public static void update(int n) {
		n = 20;
	}
}
