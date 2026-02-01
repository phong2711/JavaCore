package mangarray;

import java.util.Arrays;
import java.util.Scanner;

public class DemoSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array length n = ");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Enter a[" + i + "] = ");
			arr[i] = scanner.nextInt();
		}
		
		System.out.print("Array before sort: ");		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// Sort
//		Arrays.sort(arr);
		for(int i = 0; i < n-1; i++) {
			// Find index of min value
			int min_idx = i;
			for(int j = i + 1; j < n; j++) {
				if(arr[j] < arr[i]) {
					min_idx = j;
				}
			}
			// Swap arr[i] and arr[min_idx]
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
		}
		
		System.out.print("Array after sort: ");		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
