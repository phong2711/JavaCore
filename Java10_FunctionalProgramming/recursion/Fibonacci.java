package Recursion;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println("Enter number n = ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		long result = fibonacci(n);
		System.out.println("Fibonacci(" + n +"): " + result);
	}
	
	private static long fibonacci(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
