package demo_interface;

public class Mai {
	public static void main(String[] args) {
		DongVat conCho = new ConCho();
		conCho.an();
		conCho.inLoaiDongVat();
		
		DongVat conMeo = new ConMeo();
		conMeo.an();
		conCho.inLoaiDongVat();
		
		DongVat conVit = new ConVit();
		conVit.an();
		conVit.inLoaiDongVat();
		
	}
}
