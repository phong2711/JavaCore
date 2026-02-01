package baitapmang;

import java.util.Scanner;

public class BaiTapMang {
	public static void main(String[] args) {
		// Nhập n là số lượng phần tử của mảng (n ~ 20 phần tử)
		// Nhập 1 mảng số nguyên từ bàn phím
		
		// Output: Tìm phần tử (số) xuất hiện nhiều lần nhất, và xuất hiện bao nhiêu lần
		// 1 2 3 4 5 1 2 3 4 5 2 3 4 3 4 2 => số 2 xuất hiện nhiều nhất, và xuất hiện 4 lần
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		int[] phanTuDuocDem = new int[n];
		for (int i=0; i<n; i++) {
			System.out.println("Nhap phan tu thu "+i);
			arr[i] = scanner.nextInt();
		}
		System.out.print("arr={");
		for (int i=0; i<n-1; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println(arr[n-1]+"}");
		System.out.println("==================");
		
		for (int i=0; i<n; i++) {
			// Kiem tra xem so do (arr[i]) da duoc dem chua
			boolean tungXuatHien = false;
			for(int j = 0; j < i; j++) {
				// Da tung dem cho so arr[i]
				if(arr[j] == arr[i]) {
					phanTuDuocDem[i] = phanTuDuocDem[j];
					tungXuatHien = true;
					break;
				}
			}
			
//			// Cach 1:
//			if(tungXuatHien == false) {
//				// Neu ma chua xuat hien arr[i] lan nao
//				int count=1;
//				for(int j=i+1; j<n; j++) {
//					if(arr[i]==arr[j]) {
//						count++;
//					}
//				}
//				
//				// So lan xuat hien cua phan tu arr[i]
//				phanTuDuocDem[i] = count;
//			}
			
			if(tungXuatHien) {
				continue;
			}
			
			// Neu ma chua xuat hien arr[i] lan nao
			int count=1;
			for(int j=i+1; j<n; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			
			// So lan xuat hien cua phan tu arr[i]
			phanTuDuocDem[i] = count;
			
		}
		
		
		for (int i=0; i<n; i++) {
//			if (phanTuDuocDem[i]!=0) {
//				System.out.println("Phan tu "+arr[i]+" xuat hien "+phanTuDuocDem[i]);
//			}
			
			System.out.println("Phan tu voi i = " + i + " la " + arr[i] + ", xuat hien " + phanTuDuocDem[i]);
		}
		
		
		// Tim vi tri dau tien co so xuat hien nhieu nhat
		int maxx = phanTuDuocDem[0];
		int index = 0;
		for(int i = 1; i < n; i++) {
			if(phanTuDuocDem[i] > maxx) {
				// Cap nhat lai vi tri va gia tri
				index = i;
				maxx = phanTuDuocDem[i];
			}
		}
		System.out.println("Phan tu voi i = " + index + " la " + maxx + 
				", xuat hien nhieu nhat " + phanTuDuocDem[index] + " lan");
	}
	
}
