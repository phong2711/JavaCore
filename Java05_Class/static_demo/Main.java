package static_demo;

public class Main {
	public static void main(String[] args) {
		// static là vùng nhớ chung của tất cả các object
		Student st1 = new Student();
		System.out.println("id của st1 = " + st1.id); // 0
		System.out.println("age của st1 = " + st1.age); // 0
		st1.id = 2;
		st1.age = 18;
		System.out.println("id của st1 = " + st1.id); // 2
		System.out.println("age của st1 = " + st1.age); // 18
		System.out.println("===================================");
		
		Student st2 = new Student();
		System.out.println("id của st2 = " + st2.id); // 2
		System.out.println("age của st2 = " + st2.age); // 0
		st2.id = 10;
		System.out.println("id của st1 = " + st1.id); // 10
		System.out.println("id của st2 = " + st2.id); // 10
		
		st2.age = 20;
		System.out.println("age của st1 = " + st1.age); // 18
		System.out.println("age của st2 = " + st2.age); // 20
		System.out.println("===================================");
		
		// static là thuộc về class
		// => để gọi static member => chỉ cần dùng tên class, không cần tạo đối tượng (instance)
		Student.display();
		Student.id = 30;
		System.out.println("id của st1 = " + st1.id); // 30
		System.out.println("id của st2 = " + st2.id); // 30
	}
}
