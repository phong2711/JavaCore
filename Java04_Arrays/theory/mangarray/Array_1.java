package mangarray;

import java.util.Scanner;

public class Array_1 {
	public static void main(String[] args) {
		byte[] arr = new byte[10];
		arr[0] = 1;
		
		for(int i = 1; i < arr.length; i++) {
			int summe = arr[i - 1] + 101;
			arr[i] = (byte) summe;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
