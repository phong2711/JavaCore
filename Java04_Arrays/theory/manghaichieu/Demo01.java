package manghaichieu;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		// In hình chữ nhật bằng các dấu *
		// chiều dài 6, chiều rộng là 4
		// 1 ******
		// 2 ******
		// 3 ******
		// 4 ******
		
		for(int hang = 1; hang <= 4; hang++) {
			for(int cot = 1; cot <= 6; cot++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chiều dài n = ");
		int n = scanner.nextInt();
		System.out.println("Nhập chiều dài m = ");
		int m = scanner.nextInt();
		
		System.out.println("Hinh chu nhat m * n:");
		
		for(int hang = 1; hang <= m; hang++) {
			for(int cot = 1; cot <= n; cot++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// In hình chữ nhật số tăng dần từ 1
		// 1  2  3  4  5  6  7  8
		// 9  10 11 12 13 14 15 16
		// 17 18 19 20 21 22 23 24
		
		int chuSo=0;
		for (int hang=1; hang<=3; hang++) {
			for (int cot =1; cot<=8; cot++) {
				chuSo++;
				System.out.print(chuSo);
			}
			System.out.println();
		}
	}
}
