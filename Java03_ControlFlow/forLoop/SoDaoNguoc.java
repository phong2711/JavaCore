package luyentap;

import java.util.Scanner;

public class SoDaoNguoc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Nhap so: ");
		n = scanner.nextInt();
		
		
		
		// Cách 1: In trực tiếp ra
//        System.out.print("\nCách 1: Số đảo ngược của " + n + " là: ");
//        for(long i = n; i > 0; i /= 10) {
//            int chuSoCuoi = (int) i % 10; 
//            System.out.print(chuSoCuoi);
//        }
        
        // Cách 2: Dùng 1 biến String để lưu lại giá trị
        String soDaoNguoc = ""; // Khởi tạo là 1 chuỗi rỗng để lưu kết quả
        for(long i = n; i > 0; i /= 10) {
            int chuSoCuoi = (int) i % 10;
            soDaoNguoc += chuSoCuoi;
        }
        System.out.println("So dao nguoc la: "+soDaoNguoc);
	}
}
