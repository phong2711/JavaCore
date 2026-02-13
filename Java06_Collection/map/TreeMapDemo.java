package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> students = new TreeMap<>();
        // Create
        students.put(1, "Phong");
        students.put(20, "Van" );
        students.put(300, "Dang" );
        students.put(4000, "Nguyen" );

        // Read
        for(Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
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

    }
}
