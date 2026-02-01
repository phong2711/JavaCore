package luyentap;

import java.util.Scanner;

public class BaiTapFor3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int  n;
		System.out.println("Nhap so n: ");
		n = scanner.nextInt();
//		System.out.println((int)Math.sqrt(n));
//		int sqr = (int)Math.sqrt(n);
//		if (sqr*sqr!=n) {
//			System.out.println("n="+n+" ko phai la so chinh phuong");
//		} else {
//			System.out.println("n="+n+" la so chinh phuong");
//		}
//		
//		boolean languyento=true;
//		for (int i = 2; i<n; i++) {
//			if(n%i==0) {
//				languyento=false;
//				break;
//			} 
//			System.out.println("n="+n + ", i=" + i );
//		}
//		if(languyento == true) {
//			System.out.println("n="+n+" la so nguyen to");
//		} else {
//			System.out.println("n="+n+" khong phai la so nguyen to");
//		}
		
//		int max=0, min=9, tam;
//		while (n>0) {
//			tam=n%10;
//			if(tam>max) {
//				max=tam;
//			}
//			if (tam<min) {
//				min=tam;
//			}
//			n/=10;
//		}
//	
//		
//		System.out.println("Chu so lon nhat la: "+max);
//		System.out.println("Chu so nho nhat la: "+min);
		
//		int tong=0, tam;
//		while (n>0) {
//			tam=n%10;
//			n/=10;
//			tong+=tam;
//		}
//		
//		System.out.println("Tong cac chu so: "+tong);
		
		for(int i=1; i<=20;i++) {
			if (i==11) {
				break;
			}
			System.out.println(i);
		}
	}
}
