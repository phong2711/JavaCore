package luyentap;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		/*
		 *** Bài toán cơ sở là tách các chữ số ra khỏi 1 số 12345678 => 1, 2, 3, 4, 5, 6,
		 * 7, 8 -> Thuật toán: Sử dụng tính chất của phép toán / và % để tách ra các chữ
		 * số cuối cùng
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap n = ");
		// Giả sử n có nhiều chữ số
		// => Là số nguyên lớn => sử dụng kiểu long
		long n = scanner.nextLong();

		/*
		 * - Giả sử n = 12345678 
		 * -> Lần lượt tách ra các chữ số cuối cùng: 8 -> 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 
		 * - Bước 1: 
		 * 		+ Lấy chữ số cuối cùng x = n % 10; (lần đầu = 8) 
		 * 		+ Xóa số 8 ra khỏi số ban đầu: n = n / 10; 
		 * - Bước 2: Lặp lại bước 1 cho đến khi không còn chữ số nào nữa 
		 * ----------------------------------- 
		 * => Phân tích để sử dụng vòng lặp 
		 * - Khởi tạo: i = n 
		 * - Điều kiện lặp: còn lặp khi i vẫn còn chữ số để lấy i > 0 
		 * - Câu lệnh lặp: lấy ra chữ số cuối cùng hiện tại i = n % 10 
		 * - Bước nhảy: xóa chữ số vừa lấy ra khỏi số hiện tại: i = i / 10
		 */

		for (long i = n; i > 0; i /= 10) {
			int chuSoCuoi = (int) i % 10; // Ép kiểu về kiểu int vì i đang là kiểu long
			// Sau này có thể lưu các chữ số này vào mảng
			// Hiện giờ thì chỉ in ra để hiểu cách hoạt động của vòng lặp
			System.out.println("Số hiện tại i = " + i);
			System.out.println("Chữ số cuối cùng hiện tại i = " + chuSoCuoi);
			System.out.println("---------------------------------");
		}
		// ---------------------------------

		// ============= Ứng dụng =============
		/*
		 * Bài toán 1: Tính tổng các chữ số của 1 số - Ví dụ: n = 12345678 -> Tổng chữ
		 * số = 1+2+3+4+5+6+7+8 = 36 => Quá quen thuộc rồi, em tự làm nhé
		 */
		// ---------------------------------

		/*
		 * Bài toán 2: Tìm chữ số lớn nhất, chữ số nhỏ nhất -> Tìm max, min của từng cặp
		 */
		int chuSoMax = 0; // Vì chữ số nhỏ nhất là 0
		int chuSoMin = 9; // Vì chữ số lớn nhất là 9
		for (long i = n; i > 0; i /= 10) {
			int chuSoCuoi = (int) i % 10;
			// Tìm max
			if (chuSoCuoi > chuSoMax) {
				chuSoMax = chuSoCuoi; // Cập nhật lại max
			}
			// Tìm min
			if (chuSoCuoi < chuSoMin) {
				chuSoMin = chuSoCuoi; // Cập nhật lại min
			}
		}
		System.out.println("\nChữ số lớn nhất là " + chuSoMax);
		System.out.println("Chữ số nhỏ nhất là " + chuSoMin);
		// ---------------------------------

		/*
		 * Bài toán 3: In ra số đảo ngược của 1 số - Ví dụ: n = 12345678 -> Số đảo ngược
		 * là 87654321
		 */
		// Cách 1: In trực tiếp ra
		System.out.print("\nCách 1: Số đảo ngược của " + n + " là: ");
		for (long i = n; i > 0; i /= 10) {
			int chuSoCuoi = (int) i % 10;
			System.out.print(chuSoCuoi);
		}

		// Cách 2: Dùng 1 biến String để lưu lại giá trị
		String soDaoNguoc = ""; // Khởi tạo là 1 chuỗi rỗng để lưu kết quả
		for (long i = n; i > 0; i /= 10) {
			int chuSoCuoi = (int) i % 10;
			soDaoNguoc += chuSoCuoi;
		}
		System.out.println("\n\nCách 2: Số đảo ngược của " + n + " là: " + soDaoNguoc);

		// Cách 3: Trả về 1 số kiểu long luôn
		/*
		 * Thuật toán: Ví dụ n = 12345678 => Tự vẽ ra giấy cho dễ tưởng tượng nhé 
		 * 1234 = 1*10^3 + 2*10^2 + 3*10^1 + 4*10^0 
		 * - 1, 2, 3, 4 chính là các chữ số hàng nghìn, trăm, chục, đơn vị 
		 * - tương ứng số mũ là 3, 2, 1, 0 
		 * - Số đảo ngược của 1234 là 4321 = 4*10^3 + 3*10^2 + 2*10^1 + 1*10^0 
		 * -> Số mũ sẽ ngược lại giảm dần ứng với chữ số hàng đơn vị của số ban đầu 
		 * -> Bài toán mở rộng thêm thao tác: 
		 * 		+ Lặp qua các chữ số 
		 * 		+ Kết quả + (chữ số)*10^x; 
		 * 		+ Giả sử n có m chữ số
		 * 			=> x giảm dần từ m-1 về 0
		 */
		long soDaoNguoc2 = 0;
		int soChuSo = (int) Math.log10(n) + 1;
		System.out.println("\n" + n + " có " + soChuSo + " chữ số");
		int soMu = soChuSo - 1; // Số mũ giảm dần về 0
		for (long i = n; i > 0; i /= 10) {
			int chuSoCuoi = (int) i % 10;
			soDaoNguoc2 += chuSoCuoi * Math.pow(10, soMu);
			soMu--; // Số mũ giảm dần 1 đơn vị
		}
		System.out.println("Cách 3: Số đảo ngược của " + n + " là: " + soDaoNguoc2);
	}

}
