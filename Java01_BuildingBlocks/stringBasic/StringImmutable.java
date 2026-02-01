package StringBuilderStringBuffer;

public class StringImmutable {
	public static void main(String[] args) {
		String s1 = "abc"; 
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		
		System.out.println("s1 == s2: " + (s1 == s2)); 
		System.out.println("s1 equal s2: " + s1.equals(s2)); 
		
		System.out.println("s3 == s4: " + (s3 == s4)); 
		System.out.println("s3 equal s4: " + s3.equals(s4));
		System.out.println("==============================");
	
		System.out.println("====== String method ======");
		System.out.println("s1[1] = " + s1.charAt(1));
		System.out.println("s3 compateTo s4: " + s3.compareTo(s4)); // 0
		
		String s5 = "Phong Phung";
		System.out.println("s5 start with Phong: " + s5.startsWith("Phong")); 
		System.out.println("s5 start with Phung: " + s5.startsWith("Phung")); 
		System.out.println("s5 end with Phong: " + s5.endsWith("Phong")); 
		System.out.println("s5 end with Phun: " + s5.endsWith("Phun")); 
		System.out.println("s5 index of 'h': " + s5.indexOf('h'));
		System.out.println("s5 index of 'Phung': " + s5.indexOf("Phung"));
		System.out.println("s5 contain 'Phong': " + s5.contains("Phung"));
		System.out.println("s5 contain 'g': " + s5.contains("g")); 
		
		
		char[] kyTus = s5.toCharArray();
		System.out.print("s5 gom cac ky tu: ");
		for(char kytu: kyTus) {
			System.out.print(kytu + " ");
		}
		
		String[] hoTen = s5.split(" ");
		System.out.println("\ns5 gom cac chuoi: ");
		for(String ht: hoTen) {
			System.out.print(ht + ", ");
		}
		
		System.out.println("\nHo: " + hoTen[0]);
		System.out.println("Ten dem: " + hoTen[1]);
		System.out.println("Ten: " + hoTen[2]);
		
		
		
		
		
	}

}
