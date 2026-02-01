package constructor;

public class Main {
	public static void main(String[] args) {
		// Constructor
		HocSinh hocSinh1 = new HocSinh(); // => Goi default constructor
		System.out.println("Hoc sinh 1:");
		hocSinh1.inThongTin();
		System.out.println("================");
		
		String ten = "Nguyen Phong";
		int tuoi = 19;
		HocSinh hocSinh2 = new HocSinh(ten, tuoi); // => Goi constructor co tham so
		System.out.println("Hoc sinh 2:");
		hocSinh2.inThongTin();
		System.out.println("================");
		
		// Getter
//		System.out.println(hocSinh1.ten);
//		System.out.println(hocSinh1.tuoi);
		System.out.println("Hoc sinh 1 get thong tin:");
		System.out.println(hocSinh1.getTen());
		System.out.println(hocSinh1.getTuoi());
		System.out.println("================");
		
		// Setter
//		hocSinh1.ten = "Dang";
//		hocSinh1.tuoi = 18;
		hocSinh1.setTen("Dao Dang");
		hocSinh1.setTuoi(20);
		System.out.println("Hoc sinh 1 sau khi set:");
		hocSinh1.inThongTin();
		
	}
}
