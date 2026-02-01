package demo_interface;

public class ConVit implements DongVat{

	@Override
	public void an() {
		System.out.println("con vit an cam");
	}
	
	@Override
	public void inLoaiDongVat() {
		System.out.println("Động vật 2 chân");
	}

}
