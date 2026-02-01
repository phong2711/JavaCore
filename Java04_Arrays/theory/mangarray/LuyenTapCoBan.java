package mangarray;

import java.util.Scanner;

public class LuyenTapCoBan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang n = ");
		int n = scanner.nextInt();
		 int [] arr = new int [n];
		 
		 for (int i=0; i<n; i++) {
			 System.out.println("Nhap phan tu thu " + i + " = ");
			 arr[i]=scanner.nextInt();
		 }
		 
		 for (int i=0; i<n; i++) {
				System.out.println("Index = " + i + ", arr[" + i + "] = " + arr[i]);
		 }
		
		 int tong=0;
		 for (int i=0; i<n; i++) {
			 tong+=arr[i];
		 }
		 System.out.println("Tong= "+tong);
		 
		 int max=arr[0], min=arr[0];
		 for (int i=0; i<n; i++) {
			 if (arr[i]>arr[0]) {
				 max=arr[i];
			 }
			 if (arr[i]<min) {
				 min=arr[i];
			 }
		 }
		 System.out.println("Max= "+max+" Min= "+min);

		 boolean toanChan=true;
		 for (int i=0; i<n; i++) {
			 if(arr[i]%2 !=0) {
				 toanChan=false;
				 break;
			 }
		 }
		 if (toanChan==true) {
			 System.out.println("Mang toan chan");
		 } else {
			 System.out.println("Mang ko chan");
		 }
		 
		 boolean toanLe=true;
		 for(int i=0; i<n; i++) {
			 if(arr[i]%2==0) {
				 toanLe=false;
				 break;
			 }
		 }
		 if(toanLe==true) {
			 System.out.println("Mang toan le");
			 
		 } else {
			 System.out.println("Mang ko le");
		 }
			 
		 boolean mangTang=true;
		 for(int i=0; i<n; i++) {
			 if(arr[i]<arr[i+1]) {
				 mangTang=false;
				 break;
			 }
			 
		 }
		 if (mangTang==true) {
			 System.out.println("Mang tang dan");
		 }else {
			 System.out.println("Mang khong tang dan");
		 }
		 
		 
		
	}
}
