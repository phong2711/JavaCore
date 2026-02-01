package luyentap;

import java.util.Scanner;

public class TongCacChuSo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n;
		int tong=0;
		System.out.println("Nhap so: ");
		n = scanner.nextLong();
		
		for (long i=n; i>0; i/=10 ) {
			int chusocuoi=(int)i%10;
			tong+=chusocuoi;
		}
		System.out.println("Tong cac chu so= "+tong);

	}
}
