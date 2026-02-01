package stack_heap;

public class StackHeapDemo {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		System.out.println("a == b: " + (a == b)); // true
		
		Integer obj1 = new Integer(5);
		Integer obj2 = new Integer(5);
		System.out.println("obj1 == obj2: " + (obj1 == obj2)); // false
		Integer obj3 = obj2;
		System.out.println("obj3 == obj2: " + (obj3 == obj2)); // true
		
	
		Student st1 = new Student("Phong", 18);
		Student st2 = new Student("Phong", 18);
		System.out.println("st1 == st2: " + (st1 == st2)); // false
		Student st3 = st2; // gán địa chỉ của chứa value của st2 cho st3
		System.out.println("st3 == st2: " + (st3 == st2)); // true
		st3.age = 20;
		System.out.println("age của st1 = " + st1.age); // 18
		System.out.println("age của st2 = " + st2.age); // 20
		System.out.println("age của st3 = " + st3.age); // 20
		
		st2.age = 10;
		System.out.println("age của st2 = " + st2.age); // 10
		System.out.println("age của st3 = " + st3.age); // 10
		
		System.out.println("===== Pass by value =======");
		
		int x = 20;
		System.out.println("x = " + x); // 20
		updateValue(x);
		System.out.println("x = " + x); // 20
		
		System.out.println("===== Pass by reference =======");
		Student st5 = new Student("Phong", 18);
		System.out.println("age = " + st5.age); // 18
		updateStudent(st5);
		System.out.println("age = " + st5.age); // 15
		
	}
	
	
	public static void updateValue(int a) {
		a = 10;
	}
	
	public static void updateStudent(Student student) {
		student.age = 15;
	}
}
