package variable_scope;

public class LocalVariable {
	public static void main(String[] args) {
		// local
//		System.out.println(a);
		inRaManHinh();
		
		// phải gán giá trị mới được sử dụng
		int b;
//		System.out.println(b);
		b = 10;
		System.out.println(b);
	}
	
	public static void inRaManHinh() {
		int a = 10;
		System.out.println("đang ở trong inRaManHinh() method");
	}
}
