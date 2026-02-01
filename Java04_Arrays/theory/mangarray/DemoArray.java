package mangarray;

public class DemoArray {
	/* 
	 * Array
	 * - Lưu được nhiều biến cùng kiểu, trong các ô nhớ liên tục
	 * -> Ưu điểm:
	 * 		+ Không phải khai báo nhiều biến
	 * 		+ Không bị phân mảnh bộ nhớ
	 * 
	 * - Array truy cập giá trị thông qua chỉ số (index)
	 * - Index luôn bắt đầu từ 0
	 * - Số phần tử cố định
	 * */
	
	
	public static void main(String[] args) {
		// Khai báo mảng ~ khai báo kiểu dữ liệu khác
//		int x=1;
		// <Kiểu dữ liệu> _ <tên biến> = <giá trị khởi tạo>;
		String[] str; //khai bao
		int[] arr = {1, 3, 5, 7};
		
		// Duyệt mảng
		System.out.println("Index = 0, arr[0] = " + arr[0]);
		System.out.println("Index = 1, arr[1] = " + arr[1]);
		System.out.println("Index = 2, arr[2] = " + arr[2]);
		System.out.println("Index = 3, arr[3] = " + arr[3]);
		System.out.println("============================");
		
		// Xuat mang
		for(int i = 0; i < 4; i++) {
			System.out.println("Index = " + i + ", arr[" + i + "] = " + arr[i]);
		}
		System.out.println("============================");
		
		// Cập nhật giá trị => Thông qua index
		arr[2] = 10; 
		for(int i = 0; i < 4; i++) {
			System.out.println("Index = " + i + ", arr[" + i + "] = " + arr[i]);
		}
//		System.out.println(arr[4]); // lỗi
		System.out.println("============================");
		
		System.out.println("end");
		
	}
}
