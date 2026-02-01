package vonglapfor;

public class VongLap2 {
	public static void main(String[] args) {
//	int tong=0;
//	for (int i=1; i<=10; i++) {
//		tong+=i;		
//	}
//	double trungbinhcong;
//	trungbinhcong=(double)tong/10;
//	System.out.println("Trung binh cong cac so tu 1 den 10 la" + trungbinhcong);
//			
		int tong=0;
		int dem = 0;
		for (int i=1; i<=20; i++) {
			if(i%3==0) {
				tong+=i;
				dem++;
				System.out.println("i = " + i + " chia het cho 3");
			}
			
		}
		System.out.println("Tong cac so chia het cho ba " + tong);
		System.out.println("dem=" + dem);
		double trungbinhcong;
		trungbinhcong=(double)tong/dem;
		System.out.println("Trung binh cong la " + trungbinhcong);
	}
}
