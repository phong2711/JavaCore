package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;


public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        // Create
        names.add("Phong");
        names.add("Lan");
        names.add("Minh");

        //Read
        System.out.println("Cách 1: ");
        for(int i = 0; i < names.size(); i++){
            System.out.println("i= " + i + "name[i]= " + names.get(i));
        }

        System.out.println("Cách 2: ");
        for(String name: names){
            System.out.println(name);
        }

        System.out.println("Cách 3: ");
        ListIterator<String> nameIterators = names.listIterator();
        while(nameIterators.hasNext()) {
            String name = nameIterators.next();
            System.out.println(name);
            if(name.equals("Van")) {
                nameIterators.previous();
                System.out.println(nameIterators.previous());
                nameIterators.next();
                nameIterators.next();
            }
        }

        System.out.println("Duyet List cach 4:");
        names.forEach(ten -> System.out.println(ten));

        // Update
        names.set(1, "Pham Van");
        System.out.println("Van sau khi update: " + names.get(1));

        // Delete
        names.remove("Dang");
        System.out.println("Sau khi xoa Dang:");
        for(String name: names) {
            System.out.println(name);
        }

        // Sắp xếp
        names.add("Dang");
        Collections.sort(names);
        System.out.println("Sau khi sap xep:");
        for(String name: names) {
            System.out.println(name);
        }

    }
}
