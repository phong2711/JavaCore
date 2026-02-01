package hocsinh;

import java.util.Scanner;

// Class - Lop
public class HocSinh {
	// attribute: Ho, ten dem, ten, diem toan, diem ly, diem hoa
	public String ho;
	public String tenDem;
	public String ten;
	public int diemToan;
	public int diemLy;
	public int diemHoa;
	
	// method: nhap thong tin, ten day du, diem trung binh, xep loai
	
	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap Ho: ");
		this.ho = scanner.nextLine();
		System.out.println("Nhap Ten dem: ");
		this.tenDem = scanner.nextLine();
		System.out.println("Nhap Ten: ");
		this.ten = scanner.nextLine();
		System.out.println("Nhap Diem Toan: ");
		this.diemToan = scanner.nextInt();
		System.out.println("Nhap Diem Ly: ");
		this.diemLy = scanner.nextInt();
		System.out.println("Nhap Diem Hoa: ");
		this.diemHoa = scanner.nextInt();
	}
	
	// noi chuoi java
	public String tenDayDu() {
//		String tenDayDu = this.ho+" "+this.tenDem+" "+this.ten;
//		return tenDayDu;
		return this.ho+" "+this.tenDem+" "+this.ten;
	}
	
	public double diemTrungBinh() {
//		double diemTrungBinh=(this.diemToan+this.diemHoa+this.diemLy)/3.0;
//		return diemTrungBinh;
		return (this.diemToan+this.diemHoa+this.diemLy)/3.0;
	}
	
	public String xepLoai() {
		// diemTrungBinh >= 8.0: Gioi
		// 6.5 <= dtb < 8.0: Kha
		// else: Yeu
		// ...
		String xepLoai = "";
		if(this.diemTrungBinh()>=8.0) {
			 xepLoai = "Gioi";
		} else if(this.diemTrungBinh()>=6 && this.diemTrungBinh()<8) {
			xepLoai = "Kha" ;
		} else {
			xepLoai = "Yeu";
		}
		return xepLoai;
	}
	
	// xuat thong tin (1 dong)
	// Ho va ten -> Diem toan -> Diem ly -> Diem hoa -> Diem trung binh -> Xeeps loai
	// Nguyen Van A    10        9              8         9.0               Gioi
	
	public void xuatThongTin() {
		System.out.print(this.tenDayDu());
		System.out.print(" "+this.diemToan);
		System.out.print(" "+this.diemLy);
		System.out.print(" "+this.diemHoa);
		System.out.print(" "+this.diemTrungBinh());
		System.out.print(" "+this.xepLoai());
		System.out.println();
	}
	
	
	
	// 
}
