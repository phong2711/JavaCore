package kytu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoDocGhiFile {
	public static void main(String[] args) throws IOException {
		//Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
		FileOutputStream fos = new FileOutputStream("d:/demo/mydata.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		//Bước 2: Ghi dữ liệu
		dos.writeInt(100);
		dos.writeDouble(9.5);
		dos.writeUTF("Nguyễn Đức Nguyên Phong");
		
		//Bước 3: Đóng luồng
		fos.close();
		dos.close();
		System.out.println("Ghi file thành công!");
		System.out.println("====================");
		
		//Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
		FileInputStream fis = new FileInputStream("d:/demo/mydata.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		//Bước 2: Đọc dữ liệu
		int n = dis.readInt(); 
		double m = dis.readDouble();
		String ten = dis.readUTF();
		
		//Bước 3: Đóng luồng
		fis.close();
		dis.close();
		//Hiển thị nội dung đọc từ file
		System.out.println("Số nguyên: " + n);
		System.out.println("Số thực: " + m);
		System.out.println("Tên: " + ten);
	}
}
