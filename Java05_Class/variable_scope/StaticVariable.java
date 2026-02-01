package variable_scope;

public class StaticVariable {
	// Static variable thuộc về lớp
	// Nếu không gán giá trị, có giá trị mặc định
	// Dùng chung cho tất cả các objectt
	public static int dungChung;
	
	// Static block
	// Chỉ chạy 1 lần duy nhất lần đầu class được sử dụng
	static {
		System.out.println("static block");
	}
	
	public static void main(String[] args) {
		// Có thể gọi thông qua tên class
		System.out.println(StaticVariable.dungChung);
		
		StaticVariable abc1 = new StaticVariable();
		// Có thể gọi qua tên đối tượng
		System.out.println("abc1: " + abc1.dungChung);
		
		StaticVariable abc2 = new StaticVariable();
		System.out.println("abc2: " + abc2.dungChung);
		
		// Gán lại cho abc1
		abc1.dungChung = 123;
		
		System.out.println("abc1: " + abc1.dungChung);
		System.out.println("abc2: " + abc2.dungChung);
	}
}
