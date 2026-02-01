package demo_abstract;

public abstract class DongVat {
	public String loai;

	public void inLoai() {
		System.out.println("Loài " + loai);
	}
	
	public abstract void an();
	
	// abstract class có thể không có abstract method
	// class có chứa abstract method thì phải là abstract class
}
