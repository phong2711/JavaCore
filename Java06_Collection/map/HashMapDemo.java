package map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // key - value => 1775035 - Phong infor
        // key: ma sinh vien
        // value: ten sinh vien
        Map<Integer, String> students = new HashMap<>();
        // Create
        students.put(1, "Phong");
        students.put(20, "Van" );
        students.put(300, "Dang" );
        students.put(4000, "Nguyen" );

        // Read
        System.out.println("Cach 1 - duyet qua key:");
        for (Integer maSV : students.keySet()) {
            String value = students.get(maSV);
            System.out.println(maSV + " - " + value);
        }

        System.out.println("Cach 2 - duyet qua entry:");
        for(Map.Entry<Integer, String> entry : students.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " - " + value);
        }


        // Update
        students.put(300, "Student update");
        students.put(50000, "Minh");
        System.out.println("Map sau khi update:");
        for(Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Delete
        students.remove(20);
        System.out.println("Map sau khi xoa 20:");
        for(Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        boolean check = students.containsKey(300);
        if(check) {
            System.out.println("Map co chua key = 300");
        } else {
            System.out.println("Map khong chua key = 300");
        }


        if(students.isEmpty()) {
            System.out.println("Map rong");
        } else {
            System.out.println("Map co " + students.size() + " phan tu");
        }
    }
}
