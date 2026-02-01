package method;

import java.util.Scanner;

public class TinhGiaiThua01 {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int a, b, c;
		do {
			System.out.println("Nhap so nguyen ");
			a = scanner.nextInt();
		} while (a <= 0);
		do {
			System.out.println("Nhap so nguyen ");
			b = scanner.nextInt();
		} while (b <= 0);
		do {
			System.out.println("Nhap so nguyen ");
			c = scanner.nextInt();
		} while (c <= 0);
		
		// S1 = a!
		int s1 = 1;
		for (int i=2; i<=a; i++) {
			s1*=i;
		}
		System.out.println("S1= "+s1);
		
		
		int s2 = 1;
		for (int i=2; i<=b; i++) {
			s2*=i;
		}
		System.out.println("S2= "+s2);
		
		
		int s3 = 1;
		for (int i=2; i<=c; i++) {
			s3*=i;
		}
		System.out.println("S3= "+s3);
		
		int tong=s1+s2+s3;
		System.out.println("tong= "+tong);
	}
}
