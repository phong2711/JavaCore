package luyentap;

import java.util.Scanner;

public class BaiTapTaxi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float km;
		double cost = 0f;
		System.out.println("Nhap so km: ");
		km = scanner.nextFloat();
		if (km<=1) {
			cost = km * 15000;
			System.out.println("So tien phai tra la: "+cost);
		} else if (km >= 2 && km <= 5) {
			cost = 15000 + 13500*(km-1);
			System.out.println("So tien phai tra la: "+cost);
		} else {
			float Cost = 15000+(13500*4)+11000*(km-5);
			if (km>=120) {
				cost = Cost - 0.1*Cost;
			}
			System.out.println("So tien phai tra la: "+cost);
		} 
		
		int x; // so km da di
		System.out.println("Nhap so km da di x = ");
		x = scanner.nextInt();
		double thanhTien = 0;
		if(x <= 1) {
			thanhTien = 15000;
		} else if(x >= 2 && x <= 5) {
			thanhTien = 15000 + (x-1) * 13500;
		} else { // x >= 6
			thanhTien = 15000 + 4 * 13500 + (x-5) * 11000;
			if(x >= 120) {
				thanhTien = thanhTien - 0.1 * thanhTien;
				// thanhTien -= 0.1 * thanhTien;  
			}
		}
		System.out.println("So tien phai tra la: " + thanhTien);
	}
}
