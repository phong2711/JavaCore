package luyentap;

import java.util.Scanner;

public class LuyenTapArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang: ");
		int n=scanner.nextInt();
		int [] myArr=new int[n];
	
		for (int i=0;i<n;i++) {
			System.out.println("Nhap cac phan tu thu "+i);
			myArr[i]=scanner.nextInt();
		}
		
		System.out.print("arr= {");
		for(int i=0;i<n-1;i++ ) {
			System.out.print(myArr[i]+", ");
		}
		System.out.print(myArr[n-1]+"}\n");
		
		int max=myArr[0], min=myArr[0];
		for (int i=0; i<n; i++) {
			if(myArr[i]>max) {
				max=myArr[i];
			}
			if(myArr[i]<min) {
				min=myArr[i];
			}
		}
		System.out.println("Max= "+max+ "\nMin= "+min);
		
		System.out.println("Nhap so x");
		int x=scanner.nextInt();
		boolean numberInArray=false;
		for (int i=0;i<n;i++) {
			if(myArr[i]==x) {
				numberInArray=true;
				break;
			}
		}
		if(numberInArray) {
			System.out.println("So x co trong mang ");
		} else {
			System.out.println("So x ko co trong mang");
		}
		
		boolean toanChan=true;
		for (int i=0; i<n; i++) {
			if(myArr[i]%2!=0) {
				toanChan=false;
				break;
			}
		}
		if(toanChan) {
			System.out.println("Mang toan chan");
		}else {
			System.out.println("Mang khong chan");
		}
			
		
		boolean mangTang=true;
		for (int i=0; i<n; i++) {
			if(myArr[i]<myArr[i+1]) {
				mangTang=false;
			}
		}
		if(mangTang) {
			System.out.println("Mang tang");
		}else {
			System.out.println("Mang ko tang");
		}
	}
}
