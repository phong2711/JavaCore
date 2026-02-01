package class_method;

public class HocSinh {
	private String ten;
	private int tuoi;
	
	public HocSinh() {
		this.ten = "Nguyen Duc Nguyen Phong";
		this.tuoi = 18;
	}
	
	public HocSinh(String ten, int tuoi) {
		this.ten = ten;
		this.tuoi = tuoi;
	}
	
	public String getTen() {
		return this.ten;
	}
	
	public int getTuoi() {
		return this.tuoi;
	}
	
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	@Override
	public String toString() {
		return "Hoc sinh: [ten = " + this.ten + ", tuoi = " + this.tuoi +"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		HocSinh hocSinh = (HocSinh) obj;
//		boolean check = this.ten.equals(hocSinh.getTen()) && this.tuoi == hocSinh.getTuoi();
//		return check;
		return this.ten.equals(hocSinh.getTen()) && this.tuoi == hocSinh.getTuoi();
	}
}
