package StringBuilderStringBuffer;

public class StringImmutable2 {
	public static void main(String[] args) {
		String s5 = "Phong Phung";
		String s8 = "123";
		int int_s8 = Integer.parseInt(s8);
		System.out.println("s8 = " + int_s8);
		
		String s9 = "FPT";
		s9.concat("Software");
		System.out.println("s9 = " + s9); 
		System.out.println("s9.concat(xxx) = " + s9.concat(" Software")); 
		
		String s10 = "PHONG PHUNG";
		System.out.println("s5 equal s10: " + s5.equals(s10));
		System.out.println("s5 equalsIgnoreCase s10: " + s5.equalsIgnoreCase(s10));
		System.out.println("==============================");
		
		String s11 = "a";
		String temp = s11;
		System.out.println("Before: s11 == temp: " + (s11 == temp)); 
		s11 += "b";
		s11 += "c";
		System.out.println("s11 = " + s11); 
		System.out.println("temp = " + temp); 
		System.out.println("After: s11 == temp: " + (s11 == temp)); 
	}

}
