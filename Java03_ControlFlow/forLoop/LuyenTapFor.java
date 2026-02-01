package luyentap;

import java.util.Scanner;

public class LuyenTapFor {
	public static void main(String[] args) {
//		int n=5;
//		for (int i=1; i<=n; i++) {
//			for (int j=1; j<=10; j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Nhap so: ");
		n = scanner.nextInt();
		
		int tong=0, giaithua = 1;
		for (int i=1; i<=n; i++) {
			tong+=Math.pow(i, 2);
		}
		System.out.println("S2= "+tong);

		
		 for (int i=1; i<=n; i++) {
			 giaithua*=i;
		 }
		System.out.println("S3= "+giaithua);
		
		float s3 = 0;
		for (int i=1; i<=n; i++) {
			s3+=1.0/i;
		}
		System.out.println("S1= "+s3);
	}
}
