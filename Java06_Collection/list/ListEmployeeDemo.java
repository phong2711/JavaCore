package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEmployeeDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Phong"));
        employees.add(new Employee(2, "Van"));
        employees.add(new Employee(4, "Dang"));
        employees.add(new Employee(1, "Nguyen"));

        // Đọc - Read
        System.out.println("Duyet list:");
        for(int i = 0; i < employees.size(); i++) {
            System.out.println("i = " + i + ", employees[i] = " + employees.get(i));
        }

        Collections.sort(employees, new EmployeeComparator());
        System.out.println("Sau khi sap xep:");
        for(int i = 0; i < employees.size(); i++) {
            System.out.println("i = " + i + ", employees[i] = " + employees.get(i));
        }

    }
}
