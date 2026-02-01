package demo2;

public class Test {
	public static void main(String[] args) {
		int a = (1 > 2) ? 2 : 1;
		System.out.println("a = " + a);
		
		int a1 = 5, a2 = 10;
		int maxa = (a1 < a2) ? a2  : a1;
		System.out.println("maxa = " + maxa);
		
		
		Student st = new Student();
		try {
//			st.setAge(10);
			st.setAge(-10);
		} catch (NullPointerException e) {
			System.out.println("Gặp NullPointerException");
//		} catch (RuntimeException e) {
//			System.out.println("Gặp sự cố về tuổi");
		} catch (Exception e) {
			System.out.println("Gặp Exception");
		} finally {
			System.out.println("Chạy vào finally");
		}
		
		System.out.println("age = " + st.getAge());
	}
}
