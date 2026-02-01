package method;

import java.util.Scanner;

public class TinhGiaiThua02 {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int a = 4, b = 5, c = 6;
		
		
		int s1 = tinhGiaiThua(a);
		int s2 = tinhGiaiThua(b);
		int s3 = tinhGiaiThua(c);
		
		int tong=s1+s2+s3;
		System.out.println("tong= "+tong);
	}
	
	// Tên hàm => Tùy theo mục đích hàm làm gì
	// Tham số (parameters)
	// Hàm trả về gì => Kiểu trả về
	// + Nếu không quan tâm kết trả về => void
	// + Nếu cần kết quả trả về => return ...
	public static int tinhGiaiThua(int n) {
		int s = 1;
		for (int i=2; i<=n; i++) {
			s *= i;
		}
		System.out.println("S = " + s);
		return s;
	}
	
}
