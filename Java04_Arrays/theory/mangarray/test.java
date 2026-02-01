package mangarray;

public class test {
	public static void main(String[] args) {
		int[] myArray = {1, 33, 7};
		myArray[0] = myArray.length + 1;
		
		for(int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}
}
