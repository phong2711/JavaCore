package mangarray;

public class TimMinMax {
	public static void main(String[] args) {
		int a[] = {64, 22, 12, 15, 11, 18};
		int minn = a[0];
		int maxx = a[0];
		for(int i = 1; i < 6; i++) {
			if(a[i] < minn) {
				minn = a[i];
			}
			
			if(a[i] > maxx) {
				maxx = a[i];
			}
		}
		System.out.println("min = " + minn);
		System.out.println("max = " + maxx);
	}
}
