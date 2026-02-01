package variable_scope;

public class InstanceVariable {
	// attribute: thuộc tính
	// Instance variable thuộc về đối tượng
	// Nếu không gán giá trị, có giá trị mặc định
	// default value
	public String ten;
	public int tuoi;
	public boolean laHocSinhGioi;
	
	public static void main(String[] args) {
		// InstanceVariable là class
		// abc là object/instance
		InstanceVariable abc1 = new InstanceVariable();
		// Gọi qua tên đối tượng
		System.out.println(abc1.ten);
		abc1.inRaManHinh();
		System.out.println(abc1.laHocSinhGioi);
		
		abc1.ten = "Phong 01";
		abc1.tuoi = 20;
		System.out.println("abc1 : " + abc1.ten + " - "+ abc1.tuoi);
		
		InstanceVariable abc2 = new InstanceVariable();
		abc2.ten = "Phong 02";
		abc2.tuoi = 18;
		System.out.println("abc1 : " + abc2.ten + " - "+ abc2.tuoi);
		System.out.println("abc1 : " + abc1.ten + " - "+ abc1.tuoi);
		
	}
	
	public void inRaManHinh() {
		System.out.println(tuoi);
	}
}
