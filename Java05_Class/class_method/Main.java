package class_method;

public class Main {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a = " + a); // giá trị
		 
		HocSinh hocSinh1 = new HocSinh();
//		hocSinh.inThongTin();
		
		
		System.out.println("Hoc sinh 1: " + hocSinh1); // địa chỉ ô nhớ @HEXA16
//		System.out.println(hocSinh.toString()); // tự động gọi
//		Object obj = new HocSinh();
		
		HocSinh hocSinh2 = new HocSinh();
		System.out.println("Hoc sinh 2: " + hocSinh2);
		
		System.out.println("Hoc sinh 1 ==  Hoc sinh 2: "  + (hocSinh1 == hocSinh2));
		System.out.println("Hoc sinh 1 equals  Hoc sinh 2: "  + (hocSinh1.equals(hocSinh2)));
	}
}
