package luyentap;

import java.util.Scanner;

public class Bai2IfElse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, n;
		System.out.println("Nhap so thu nhat: ");
		a = scanner.nextInt();
		System.out.println("Nhap so thu hai: ");
		b = scanner.nextInt();
		System.out.println("Nhap so thu ba: ");
		n = scanner.nextInt();

		if (a > n || b > n) {
			System.out.println("Khong hop le");
		} else {
			int tong = 0;
			for (int i = 1; i < n; i++) {
				if (i % a == 0 && i % b != 0) {
					tong += i;
				}
			}
			System.out.println("Tong cac so chia het cho a nhung ko chia het cho b la " + tong);
		}
	}
}
