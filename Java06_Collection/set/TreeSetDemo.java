package set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();
        // CRUD
        // Thêm - Create
        students.add(new Student(1, "Phong"));
        students.add(new Student(2, "Van"));
        students.add(new Student(3, "Dang"));
        students.add(new Student(4, "Nguyen"));
        students.add(new Student(2, "Van"));

        // Read
        System.out.println("Duyet set cach 1:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("Duyet set cach 2:");
        Iterator<Student> studentsIterator = students.iterator();
        while(studentsIterator.hasNext()) {
            System.out.println(studentsIterator.next());
        }

        // Delete
        System.out.println("Sau khi xoa Van:");
        students.remove(new Student(2, "Van"));
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("Sau khi them student id=2:");
        students.add(new Student(2, "New student"));
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
