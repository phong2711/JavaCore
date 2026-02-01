package mangarray;

import java.util.Random;

public class Array_2 {
	public static void main(String[] args) {
		char[] list = new char[30];
		Random random = new Random();
		
		for(int i = 0; i < list.length; i++) {
			int code = 65 + random.nextInt(26);
			list[i] = (char)code;
		}
		
		int mid = list.length / 2;
		
		for(int i = 0; i < list.length / 2; i++) {
			System.out.println(list[i]);
			System.out.println(list[mid + i]);
		}
	}
}
