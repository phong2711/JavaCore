package constructor;

public class HocSinh {
	// attribute
	private String ten;
	private int tuoi;
	
	// Constructor => Tao doi tuong / object
	// 1. Trung ten class
	// 2. Khong co kieu tra ve
	
	// Defautl constructor => Gan gia tri mac dinh cho object
	public HocSinh() {
		System.out.println("Default constructor");
		this.ten = "Nguyen Duc Nguyen Phong";
		this.tuoi = 18;
	}
	
	// Constructor co tham so (parameters)
	// => Tao doi tuong dong thoi gan gia tri bat ki cho object
	public HocSinh(String ten, int tuoi) {
		System.out.println("Constructor co tham so");
		this.ten = ten;
		this.tuoi = tuoi;
	}
	
	// Getter => Get ra cac thuoc tinh cua class
	// La 1 ham public
	// tra ve gia tri minh muon get ra
	public String getTen() {
		return this.ten;
	}
	
	public int getTuoi() {
		return this.tuoi;
	}
	
	// Setter => Set lai gia tri cho cac thuoc tinh cua class
	// 1. La 1 ham public
	// 2. Khong return ve gia tri gi, ma chi update thuoc tinh
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	
	// method
	public void inThongTin() {
		System.out.println("Hoc sinh: [ten = " + this.ten + ", tuoi = " + this.tuoi +"]");
	}
}
