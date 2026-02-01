package StringDemo;

public class StringSample {
	public static void main(String[] args) {
		String s1 = "Phong";
		String s3 = "Phong";
		
		char test[] = {'h', 'e', 'l', 'l', 'o'};
		
		String s2 = new String(test);
		String s4 = new String("hello");
		
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
		
		System.out.println(s2.equals(s4));
		System.out.println(s2 == s4);

	}
}

