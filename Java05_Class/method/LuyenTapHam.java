package demofunction;

import java.util.Scanner;

public class LuyenTapHam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so nguyen n: ");
		int n = scanner.nextInt();
		int[] myArray = new int[n];
		for (int i=0; i<n; i++) {
			System.out.println("Nhap phan tu thu i: ");
			myArray[i]=scanner.nextInt();
		}
		
		// In mang
//		System.out.print("arr = {");
//		for(int i=0; i<n-1; i++) {
//			System.out.print(arr[i]+", ");
//		}
//		System.out.print(arr[n-1] + "}");
		
		xuatMang(myArray);
		
//		int[] brr = {2, 4, 6, 8, 10};
//		xuatMang(brr);
		int tong= sumArray(myArray);
		System.out.println("\ntong mang myArray = " + tong);
		
		// doi xung
		boolean dx = mangDoiXung(myArray);
		// dx == true
		if(dx) {
			System.out.println("myArray la mang doi xung");
		} else {
			System.out.println("myArray la mang khong doi xung");
		}
	}
	
	public static void xuatMang(int[] arr) {
		int n = arr.length;
		System.out.print("arr = {");
		for(int i=0; i<n-1; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.print(arr[n-1] + "}");
	}
	
	public static int sumArray(int[] arr) {
		int n = arr.length;
		int tong=0;
		for(int i=0; i<n; i++) {
			tong+=arr[i];
		}
		return tong;
	}
	
	
	public static boolean mangDoiXung(int[] arr) {
		int n = arr.length;
		boolean doiXung=true;
		for(int i=0; i<n; i++) {
			if(arr[i]!=arr[n-1-i]) {
				doiXung=false;
				break;
			}
		}
		return doiXung;
	}
	
}
