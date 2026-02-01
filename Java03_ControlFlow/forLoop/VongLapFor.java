package vonglapfor;

import java.util.Scanner;

public class VongLapFor {
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		int x,y;
		System.out.println("Nhap so thu nhat: ");
		x = scanner.nextInt();
		System.out.println("Nhap so thu hai: ");
		y = scanner.nextInt();
		
		int chiahetcho5 = 0;
		int chiahetcho3 = 0;
		int demsochiahetcho5=0;
		for(int i=x; i<=y; i++) {
			if (i%5==0) {
				chiahetcho5+=i;
				demsochiahetcho5++;
			} else if (i%3==0) {
				chiahetcho3+=i;
			}
		
			
			
		}
		double trungbinhcong;
		trungbinhcong=(double)chiahetcho5/demsochiahetcho5;
		System.out.println("Tong cac so chia het cho 5 la " + chiahetcho5);
		System.out.println("Tong cac so chia het cho 3 la " + chiahetcho3);
		System.out.println("Trung binh cong cac so chia het cho 5 la "+trungbinhcong);
		
	
	}
}
