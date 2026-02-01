package exception;

import java.util.Scanner;

public class DemoException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		
		// 123s => Chết chương trình => Error
//		int so = Integer.parseInt(number);
//		System.out.println(so);
		
		try {
			int so = Integer.parseInt(number);
			System.out.println(so);
			
//			String str = null;
//			str.charAt(0);
		} catch (NumberFormatException e) {
			System.out.println("Có lỗi sai format của số");
		} catch (NullPointerException e) {
			System.out.println("Lỗi NullPointer");
		} catch (Exception e) {
			System.out.println("Lỗi chung");
		} finally {
			System.out.println("Default");
		}
		
		System.out.println("End");
	}
}
