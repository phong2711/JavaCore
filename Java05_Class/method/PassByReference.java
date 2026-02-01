package demofunction;

public class PassByReference {
	public static void main(String[] args) {
		StringBuilder obj = new StringBuilder("Phong");
		System.out.println("Truoc obj = " + obj);
		update(obj);
		System.out.println("Sau obj = " + obj);
	}
	
	public static void update(StringBuilder ten) {
		ten = ten.append(" Nguyen");
	}
}
