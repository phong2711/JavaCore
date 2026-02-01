package demo_abstract;

public class Mai {
	public static void main(String[] args) {
		DongVat conCho = new ConCho();
		conCho.an();
		conCho.inLoai();
		
		DongVat conMeo = new ConMeo();
		conMeo.an();
		conMeo.inLoai();
	}
}
