package basic;

public aspect Logger {

	pointcut mutators():
		call (void Stack.push(String)) ||
		call (String Stack.pop());
	
	before() : mutators() {
		System.out.println("Logger:[Mutator method is to be called]");
	}
	
	after() : mutators() {
		System.out.println("Logger:[Mutator method is called]");
	}
}
