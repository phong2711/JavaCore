package Recursion;

import java.util.Scanner;

public class FibonancciPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number n: ");
		int n = sc.nextInt();
		
		long result = fibonancci(n);
		System.out.println(fibonancci(n));

	}

	private static long fibonancci(int n) {
		// TODO Auto-generated method stub
		if(n == 1 || n == 2) {
			return 1;
		}
		return fibonancci(n - 1) + fibonancci(n - 2);
	}
}
