package basic;

public class Run {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push("Element 1");
		stack.push("Element 2");
		stack.push("Element 3");
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}