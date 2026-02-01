package access_modifier;

public class Demo01 {
	// Access modifier -> Pham vi truy cap
	// 1. public: Mọi nơi đều có thể sử 
	// 2. protected: Quan hệ kế thừa
	// 3. default: Trong package
	// 4. private: Trong class
	
	public String ten = "Phong";
	protected int tuoi = 19;
	private String diaChi = "Hanoi";
	
	// Goi duoc o moi noi
	public void inThongTin() {
		System.out.println(this.ten + " " + this.tuoi + " " + this.diaChi);
	}
}
