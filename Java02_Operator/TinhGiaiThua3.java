package method;

import java.util.Scanner;

public class TinhGiaiThua3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		do {
			System.out.println("Nhap so nguyen duong a: ");
			a = scanner.nextInt();
		} while (a <= 0);

		do {
			System.out.println("Nhap so nguyen duong b: ");
			b = scanner.nextInt();
		} while (b <= 0);

		do {
			System.out.println("Nhap so nguyen duong c: ");
			c = scanner.nextInt();
		} while (c <= 0);

		int s1 = tinhGiaiThua(a);
		int s2 = tinhGiaiThua(b);
		int s3 = tinhGiaiThua(c);

		int tong = s1 + s2 + s3;
		System.out.println("Tong= " + tong);

	}

	public static int tinhGiaiThua(int n) {
		int s = 1;
		for (int i = 2; i <= n; i++) {
			s *= i;
		}
		System.out.println("S= " + s);
		return s;
	}
}
