package stack_queue;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> stackNumber = new Stack<>();
		// Thêm phần tử
		stackNumber.push(9);
		stackNumber.push(8);
		stackNumber.push(7);
		stackNumber.push(6);
		stackNumber.push(5);
		
		System.out.println("Stack : " + stackNumber);
		
		// Get phần tử top nhưng không xóa
		System.out.println("Top = " + stackNumber.peek()); // 9
		System.out.println("Stack after peek() : " + stackNumber); // Stack : [9, 8, 7, 6, 5]
		
		// Get phần tử top và xóa
		System.out.println("Top = " + stackNumber.pop()); // 9
		System.out.println("Stack after pop() : " + stackNumber); // Stack : [9, 8, 7, 6]
		
		
	}
}
