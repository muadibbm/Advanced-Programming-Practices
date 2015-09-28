package basic;

import java.util.ArrayList;

public class Stack {
	
	private ArrayList <String> stack = new ArrayList <String>();
	protected int top = -1;
	
	public void push(String element) {
		top += 1;
		stack.add(element);
	}
	
	public String pop() {
		if(this.isEmpty())
			return null;
		top -= 1;
		return stack.remove(top + 1);
	}
	
	public String top() {
		if(this.isEmpty())
			return null;
		return stack.get(top);
	}
	
	public int size() {
		return top + 1;
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
}
