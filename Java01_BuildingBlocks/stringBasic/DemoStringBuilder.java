package StringBuilderStringBuffer;

public class DemoStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("a");
		StringBuilder temp = sb1;
		System.out.println("Before: s11 == temp: " + (sb1 == temp)); // true
		sb1.append("b");
		sb1.append("c");
		System.out.println("sb1 = " + sb1); // abc
		System.out.println("temp = " + temp); // abc
		System.out.println("After: s11 == temp: " + (sb1 == temp)); // true
		
		StringBuilder sb2 = new StringBuilder("Cong hoa xa hoi chu nghia 123");
		String s1 = sb2.substring(5);
		System.out.println("s1 = " + s1); // hoa xa hoi chu nghia 123
		String s2 = sb2.substring(5, 12);
		System.out.println("s2 = " + s2); // hoa xa 
		
		// 
	}
}


