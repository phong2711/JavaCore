package hocsinh;

import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		// ArrayList
		// 1. Khai bao
		ArrayList<HocSinh> danhSachHocSinh = new ArrayList<>();
//		HocSinh hocsinh1 = new HocSinh();
//		hocsinh1.nhapThongTin(); // Object - doi tuong
//		// Luu hoc sinh 1 vao danh sach
//		danhSachHocSinh.add(hocsinh1);
//		
//		HocSinh hocsinh2 = new HocSinh();
//		hocsinh2.nhapThongTin();
//		danhSachHocSinh.add(hocsinh2);
//		
//		HocSinh hocsinh3 = new HocSinh();
//		hocsinh3.nhapThongTin();
//		danhSachHocSinh.add(hocsinh3);
		
		for(int i = 1; i <= 3; i++) {
			HocSinh hocsinh = new HocSinh();
			hocsinh.nhapThongTin();
			danhSachHocSinh.add(hocsinh);
		}
		
		System.out.println("Ho va ten ||   Diem Toan  ||  Diem Ly  ||  Diem Hoa ||   Diem Trung Binh  ||  Xep Loai ");
//		hocsinh1.xuatThongTin();
//		hocsinh2.xuatThongTin();
//		hocsinh3.xuatThongTin();
		
		for (int i=0; i < danhSachHocSinh.size(); i++) {
			// hocsinh_i.xuatThongTin();
			HocSinh hocsinh_i = danhSachHocSinh.get(i);
			hocsinh_i.xuatThongTin();
		}

	}
}
