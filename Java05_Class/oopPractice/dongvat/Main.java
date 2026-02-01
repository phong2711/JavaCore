package dongvat;

public class Main {
	public static void main(String[] args) {
		DongVat conCho = new DongVat();
		conCho.nhapThongTin();
		DongVat conCa = new DongVat();
		conCa.nhapThongTin();

		System.out.println("Ten loai  ||   Mau sac  ||  So chan ");
		conCho.xuatThongTin();
		conCa.xuatThongTin();
	}
}
