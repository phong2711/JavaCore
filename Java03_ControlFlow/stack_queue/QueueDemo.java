package stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queueName = new LinkedList <>();
		// Thêm phần tử
		queueName.add("Phong 1");
		queueName.add("Phong 2");
		queueName.add("Phong 3");
		queueName.add("Phong 4");
		queueName.add("Phong 5");
		
		System.out.println("Queue : " + queueName);
		
		// Get phần tử top nhưng không xóa
		System.out.println("Top = " + queueName.peek()); // Phong 1
		System.out.println("Queue after peek() : " + queueName); // [Phong 1, Phong 2, Phong 3, Phong 4, Phong 5]
		
		// Get phần tử top và xóa
		System.out.println("Top = " + queueName.poll()); // Phong 1
		System.out.println("Stack after pop() : " + queueName); // [Phong 2, Phong 3, Phong 4, Phong 5]
	}
}
