package set;

public class Student implements Comparable<Student> {
    public int id;
    public String name;

    public Student() {}

    public Student(int ma, String ten) {
        this.id = ma;
        this.name = ten;
    }

    public String toString() {
        return "Student: [" + id + ", " + name + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Student)) {
            return false;
        }
        Student std = (Student) obj;
//		if(this.id == std.id && this.name == std.name) {
//			return true;
//		}
//		return false;
        return this.id == std.id && this.name == std.name;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + id;
        return result;
    }

    @Override
    public int compareTo(Student student) {
        return this.id - student.id;
    }

}
