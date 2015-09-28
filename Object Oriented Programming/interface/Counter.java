package Interface;

public class Counter {
	static String description = "The foundation of all counters.";
	int value;
	public void reset() {
		value = 0;
	}
	public int getValue() {
		return value;
	}
	
	public void click() {
		value++; 
	}
}
