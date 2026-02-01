package demo;

public class Demo01 {
	public static void main(String[] args) {
		// Chuỗi là 1 mảng của các ký tự
		// "Phung Duc Nguyen Phong"
		// ['P', 'h', 'u', 'n', 'g' ....]
		String ten = "Phung Duc Nguyen Phong";
		// Độ dài chuỗi
		int doDaiChuoi = ten.length();
		for(int i = 0; i < doDaiChuoi; i++) {
			System.out.println("Ky tu thu i=" + i + " la: " + ten.charAt(i));
		}
		
		
		// Khai báo 
		// Cách 1: Gán trực tiếp
		String ten1 = "Abc dff";
		
		// Cách 2: new Object
		String ten2 = new String("DEF abc");
		
		// So sánh sử dụng == vs equals()
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		String s3 = new String("abc");
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
		// Các hàm cơ bản
		System.out.println(ten.toUpperCase());
		System.out.println(ten.toLowerCase());
		String str1 = "abc", str2 = "def";
		System.out.println(str1.concat(str2));
		
		// include double quote 
		String example = "This is the \"String\" adfasd \\n class";
		System.out.println(example);
		
		// replace
		String thayThe = "bat ball";
	    // thay thế b = c
	    System.out.println(thayThe.replace('b', 'c'));
	    
	    // Nối chuỗi
	    String str = "Phong";
	    String str11 = "hoc gioi";
	    System.out.println(str.concat(str11));
	    
	    // So sánh hai chuỗi theo từ điển
	    String chuoi1 = "Hoc Ly";
	    String chuoi2 = "Hoc Toan";
	    int result = 0;
	    result = chuoi1.compareTo(chuoi2);
	    System.out.println(result);
	    
	    // Trích xuất một phần của chuỗi
	    String chuoi3 = "Java is fun";
	    System.out.println(chuoi3.substring(0, 4));
	    
	}
}
