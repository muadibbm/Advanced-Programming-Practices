package Inheritence;

public abstract class Person {
	
	public abstract String whoAmI();
	
	public void notAbstract() {
		System.out.println("may or may not override this method");
	}
}
