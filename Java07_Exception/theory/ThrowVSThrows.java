package demo;

public class ThrowVSThrows {
	public static void main(String[] args) {
		try {
			inThongTin();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void inThongTin() throws Exception {
		System.out.println("info");
		throw new Exception();
	}
}
