package demo;

public class DemoException {
	public static void main(String[] args) {
		// NullPointerException
//		Object obj = null;
//		System.out.println(obj.toString());
		
		
		// ArrayIndexOutOfBoundsException
		try {
			int[] arr = new int[4];
			System.out.println("arr[1] = " + arr[1]);
//			System.out.println("arr[-1] = " + arr[-1]);
			
//			System.out.println("arr[4] = " + arr[4]);
			throw new ArrayIndexOutOfBoundsException();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Xảy ra lỗi ArrayIndexOutOfBoundsException");
		}
		
		throw new NullPointerException();
//		System.out.println("okok");
		
		
	}
}
