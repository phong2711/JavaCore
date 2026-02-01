package mangarray;

import java.util.Scanner;

public class practiceSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array n = ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Enter a[" + i + "] = ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Array before sort: ");		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < n-1; i++) {
			int minn = i;
			for(int j = i + 1; j < n; j++) {
				if(arr[j] < arr[i]) {
					minn = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minn];
			arr[minn] = temp;
			
		}
		System.out.print("Array after sort: ");	
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
