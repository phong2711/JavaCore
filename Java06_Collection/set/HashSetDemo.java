package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // Khong luu gia tri trung lap
        // Khong dam bao thu tu them vao, phụ thuộc hash() function
        Set<Integer> numbers = new HashSet<>();
        // Create
        numbers.add(1);
        numbers.add(20);
        numbers.add(300);
        numbers.add(4000);
        numbers.add(50000);
        numbers.add(300);
        // Read
        System.out.println("Duyet set cach 1:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        System.out.println("Duyet set cach 2:");
        Iterator<Integer> numbersIterator = numbers.iterator();
        while (numbersIterator.hasNext()) {
            System.out.println(numbersIterator.next());
        }

        // Delete
        System.out.println("Sau khi xoa 50000:");
        numbers.remove(50000);
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}