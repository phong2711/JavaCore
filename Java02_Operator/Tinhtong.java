package method;

import java.util.Scanner;

public class TinhTong {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap n1 = ");
		int n1 = scanner.nextInt();
		System.out.println("Nhap n2 = ");
		int n2 = scanner.nextInt();
		
		// Tính tổng 1 -> n1
		int tong1 = tinhTong(n1);
		
		System.out.println("tong tu 1 -> " + n1 + " = " + tong1);
		
		// Tính tổng 1 -> n1
		int tong2 = tinhTong(n2);
		System.out.println("tong tu 1 -> " + n2 + " = " + tong2);
	}
	
	// Tính tổng 1 -> n
	public static int tinhTong(int n) {
		int tong = 0;
		for(int i = 1; i <= n; i++) {
			tong += i;
		}
		return tong;
	}
}
