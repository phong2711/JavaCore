package u01_data_type;

public class DataType {
    public static void main(String[] args) {
        //		String str = "12345";
        char x = '0';
        int y = (int) x;
        System.out.println("y = " + y);
        int z = x - 48;
        System.out.println("z = " + z);

        char lower = 'b';
        char upper = (char) (lower - 32);
        System.out.println("upper = " + upper);
    }
}
