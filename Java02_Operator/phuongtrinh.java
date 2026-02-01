package phuongtrinhbac.java;

import java.util.Scanner;

public class phuongtrinh {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a, b, c, x1, x2, delta;
		System.out.println("Nhap so nguyen a: ");
		a=scanner.nextDouble();
		System.out.println("Nhap so nguyen b: ");
		b=scanner.nextDouble();
		System.out.println("Nhap so nguyen c: ");
		c=scanner.nextDouble();
		
		delta=Math.pow(b, 2)-4*a*c;
		
		if(delta<0) {
			System.out.println("Phuong trinh vo nghiem");
		} else if (delta==0) {
			x1=(-b)/2*a;
			System.out.println("Phuong trinh co nghiem kep x1=x1= "+x1);
		} else {
			x1=(-b+Math.sqrt(delta))/2*a;
			x2=(-b-Math.sqrt(delta))/2*a;
			System.out.println("Phuong trinh co hai nghiem phan biet x1= "+x1+"\nx2= "+x2);
		
		}
		

	}
	
}

