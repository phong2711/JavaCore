package dongvat;

import java.util.Scanner;

public class DongVat {
	// loài, màu sắc, số chân
	public String loai;
	public String mauSac;
	public int soChan;
	
	
	// Default constructor tự động được tạo nếu không có constructor
//	public DongVat() {
//	}
//	
//	// Constructor có tham số
//	public DongVat(String loai) {
//		this.loai = loai;
//	}
	
	// nhập thông tin, xuất thông
	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap loai: ");
		this.loai=scanner.nextLine();
		System.out.println("Nhap mau sac: ");
		this.mauSac=scanner.nextLine();
		System.out.println("Nhap so chan: ");
		this.soChan=scanner.nextInt();		
	}
	
	public void xuatThongTin() {
		System.out.print(this.loai);
		System.out.print("   "+this.mauSac);
		System.out.print("   "+this.soChan);
		System.out.println();
	}
	
}
