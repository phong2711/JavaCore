package demo_interface;

public interface DongVat {
	public String loai = "dong vat";
	
	// public abstract ...
	void an();
	
	// default method
	// public ....
	default void inLoaiDongVat() {
		System.out.println("Động vật 4 chân");
	}
}
