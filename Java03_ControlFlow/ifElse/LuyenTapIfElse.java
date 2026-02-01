package luyentap;

import java.util.Scanner;

public class LuyenTapIfElse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c, d;
		System.out.println("Nhap so thu 1: ");
		a = scanner.nextInt();
		System.out.println("Nhap so thu 2: ");
		b = scanner.nextInt();
		System.out.println("Nhap so thu 3: ");
		c = scanner.nextInt();
		System.out.println("Nhap so thu 4: ");
		d = scanner.nextInt();
		
//		int [] arr = {a, b, c, d};
//		int max= arr[0];
//		int min= arr[0];
//		for (int i=1; i<arr.length; i++) {
//			max= Math.max(max, arr[i]);
//			min= Math.min(min, arr[i]);
//		}
//		System.out.println("Gia tri lon nhat la: "+max);
//		System.out.println("Gia tri nho nhat la: "+min);
		
		
		int minn = a;
		if(minn > b) { // minn = a
			minn = b;
		} else { // a < b
			// ko lam gi ca
		}
		
		if(minn > c) {
			minn = c;
		}
		
		if(minn > d) {
			minn = d;
		}
			
		int maxx = a;
		if(maxx < b) {
			maxx = b;
		}
		if(maxx<c) {
			maxx = c;
		}
		if(maxx<d) {
			maxx = d;
		}
		System.out.println("Max="+maxx+"Min="+minn);
		
		int min2 = Math.min(a, b);
		min2 = Math.min(min2, c);
		min2 = Math.min(min2, d);
		
		System.out.println("Max="+maxx+"Min="+minn);
		
		if(a>b) {
			if (c>a) {
				System.out.println(c+">"+a+">"+b);
			} else if (c<b) {
				System.out.println(a+">"+b+">"+c);
			} else {
				System.out.println(a+">"+c+">"+b);
			}
		} else { // b>a
			if (c>b) {
				System.out.println(c+">"+b+">"+a);
			} else if (c<a) {
				System.out.println(b+">"+a+">"+c);
			} else {
				System.out.println(b+">"+c+">"+a);
			}
		}
		
	}
}
