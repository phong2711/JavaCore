package mangarray;

import java.util.Scanner;

public class DemoArray_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang n = ");
		int n = scanner.nextInt();
		
		// Khai báo mảng arr có n phần từ 
		// => arr[0], arr[1], .... arr[n-1]
		int[] arr = new int[n];
		
		/*
		// Nhập mảng
		System.out.println("Nhap phan tu thu 0 = ");
		arr[0] = scanner.nextInt();
		System.out.println("Nhap phan tu thu 1 = ");
		arr[1] = scanner.nextInt();
		// .... => n-1
		*/
		
		// Nhập mảng
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu thu " + i + " = ");
			arr[i] = scanner.nextInt();
		}
		
		// Xuất mảng
		for(int i = 0; i < n; i++) {
			System.out.println("Index = " + i + ", arr[" + i + "] = " + arr[i]);
		}
		
		// Tính tổng các phần tử trong mảng 
		int tong=0;
		for ( int i=0; i<n; i++) {
			tong+=arr[i];
		}
		System.out.println("Tong= "+tong);
	}
}
