package list;

public class Employee {
    public int id;
    public String name;

    public Employee(int ma, String ten) {
        this.id = ma;
        this.name = ten;
    }

    public String toString() {
        return "Employee: [" + id + ", " + name + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Employee)) {
            return false;
        }
        Employee std = (Employee) obj;
        return this.id == std.id && this.name == std.name;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + id;
        return result;
    }

}
