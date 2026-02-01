package luyentap;

import java.util.Scanner;

public class PracticeFunction {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so cac phan tu trong mang: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu thu: " + i);
			arr[i] = scanner.nextInt();
		}

		System.out.print("arr= {");
		for (int i = 0; i < n - 1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.print(arr[n - 1] + "}");

		int tong = sumArray(arr);
		System.out.println("\nTong= " + tong);

		int tongCacSoLe = sumOfOddNumber(arr);
		System.out.println("Tong cac so le trong mang= " + tongCacSoLe);

	}

	public static int sumArray(int[] arr) {
		int n = arr.length;
		int tong = 0;
		for (int i = 0; i < n; i++) {
			tong += arr[i];
		}
		return tong;
	}

	public static int sumOfOddNumber(int[] arr) {
		int n = arr.length;
		int tongCacSoLe = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 != 0) {
				tongCacSoLe += arr[i];
			}
		}
		return tongCacSoLe;
	}

	public static boolean mangDoiXung(int[] arr) {
		int n = arr.length;
		boolean doiXung=true;
		for (int i=0; i<n; i++) {
			if(arr[i]!=arr[n-1-i]) {
				doiXung=false;
				break;
			}
		}
		return doiXung;
	}
}
